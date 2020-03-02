package components.network;

import java.io.*;
import java.lang.reflect.*;
import java.net.Proxy;
import java.net.*;
import java.net.Proxy.Type;
import java.util.*;
import java.util.logging.*;
import java.util.regex.*;
import org.mozilla.javascript.*;

/**
 * A {@link ProxySelector} implementation that supports proxy auto-config (PAC).
 *
 * <b>references</b>
 * <ul>
 * <li><a href="http://en.wikipedia.org./wiki/Proxy_auto-config">http://en.wikipedia.org./wiki/Proxy_auto-config</a></li>
 * <li>Mark A. Ziesemer <a href="http://www.ziesemer.com.">www.ziesemer.com</a></li>
 * <li><a href="http://www.mozilla.org/rhino/">Mozilla Rhino</a></li>
 * </ul>
 */
public class ProxyUtil extends ProxySelector {

    protected static final Logger LOGGER = Logger.getLogger(ProxyUtil.class.getName());
    protected static final Pattern PAC_RESULT_PATTERN = Pattern.compile("(DIRECT|PROXY|SOCKS)(?:\\s+(\\S+):(\\d+))?(?:;|\\z)");
    protected Context context;
    protected Scriptable scriptable;

    /**
     * A {@link Reader} to a PAC script.
     *
     * @param pacReader
     * @see #init(Reader)
     */
    public ProxyUtil(Reader pacReader) throws Exception {
        init(pacReader);
    }

    /**
     * Retrieve/Resolve proxy information using PAC script configuration URL.
     *
     * @param pacUrl    PAC script URL
     * @param targetUrl target URL to access
     * @return proxy information
     */
    public static Proxy getProxy(URL pacUrl, URL targetUrl) {
        try {
            ProxySelector selector = getProxyPac(pacUrl);
            List<Proxy> select = selector.select(targetUrl.toURI());
            if (select == null || select.isEmpty()) {
                return Proxy.NO_PROXY;
            } else {
                return select.get(0);
            }
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, e.getMessage(), e);
            return Proxy.NO_PROXY;
        }
    }

    /**
     * Returns a new {@link ProxySelector} instance from input Proxy PAC script location URL.
     *
     * @param url Proxy PAC URL
     * @return Proxy PAC ProxySelector instance
     * @throws Exception
     */
    private static ProxySelector getProxyPac(URL url) throws Exception {
        return new ProxyUtil(new InputStreamReader(url.openStream()));
    }

    /**
     * Reads and parses the proxy pac script.
     *
     * @param pacReader
     * @throws Exception
     */
    protected void init(Reader pacReader) throws Exception {
        try {
            Context c = this.context = new ContextFactory().enterContext();
            try {
                c.setClassShutter(new PacClassShutter());
                Scriptable s = this.scriptable = c.initStandardObjects();
                registerFunction("alert", PacFunctions.class.getMethod("alert", String.class), s);
                registerFunction("myIpAddress", PacFunctions.class.getMethod("myIpAddress"), s);
                registerFunction("dnsResolve", PacFunctions.class.getMethod("dnsResolve", String.class), s);

                InputStreamReader isrUtils = new InputStreamReader(getClass().getResourceAsStream("/PacUtils.js"));
                try {
                    c.evaluateReader(s, isrUtils, null, 1, null);
                } finally {
                    isrUtils.close();
                }

                try {
                    c.evaluateReader(s, pacReader, null, 1, null);
                } finally {
                    pacReader.close();
                }
            } finally {
                Context.exit();
            }
        } finally {
            pacReader.close();
        }
    }

    /**
     * @param name
     * @param m
     * @param s
     */
    protected void registerFunction(String name, Method m, Scriptable s) {
        FunctionObject fo = new FunctionObject(name, m, s);
        ScriptableObject.putProperty(s, name, fo);
    }

    @Override
    public List<Proxy> select(URI uri) {
        if (uri == null) {
            throw new IllegalArgumentException("uri must not be null.");
        }
        String pacResult = findProxyForUrl(uri);
        List<Proxy> result = convert(pacResult.trim());
        LOGGER.log(Level.FINE, "Returning {0} for {1}.", new Object[]{result, uri});
        return result;
    }

    /**
     * @param uri
     * @return
     */
    protected String findProxyForUrl(URI uri) {
        Context c = new ContextFactory().enterContext(this.context);
        try {
            Scriptable s = this.scriptable;
            // Considered caching, but would prevent a possibility where the
            // function could rewrite itself.
            Object fObj = ScriptableObject.getProperty(s, "FindProxyForURL");
            if (!(fObj instanceof Callable)) {
                LOGGER.log(Level.WARNING, "No FindProxyForURL function found: {0}", fObj);
                return null;
            }
            Callable f = (Callable) fObj;
            Object scriptResultObj = f.call(c, s, s, new Object[]{uri.toString(), uri.getHost()});
            if (scriptResultObj == null) {
                LOGGER.log(Level.WARNING, "Null result from FindProxyForURL: {0}", uri);
                return null;
            }
            return scriptResultObj.toString();
        } finally {
            Context.exit();
        }
    }

    /**
     * @param pacResult
     * @return
     */
    protected List<Proxy> convert(String pacResult) {
        List<Proxy> result = new LinkedList<Proxy>();
        if (pacResult != null) {
            convert(pacResult, result);
        }
        if (result.isEmpty()) {
            // Mozilla Firefox, as visible in nsPluginHostImpl.cpp, defaults to
            // "DIRECT" on any unexpected returns.
            LOGGER.warning("Empty or invalid result from FindProxyForURL.  Returning default of DIRECT...");
            result.add(Proxy.NO_PROXY);
        }
        return result;
    }

    /**
     * @param pacResult
     * @param result
     */
    protected void convert(String pacResult, List<Proxy> result) {
        Matcher m = PAC_RESULT_PATTERN.matcher(pacResult);
        while (m.find()) {
            String scriptProxyType = m.group(1);
            if ("DIRECT".equals(scriptProxyType)) {
                result.add(Proxy.NO_PROXY);
            } else {
                Type proxyType;
                if ("PROXY".equals(scriptProxyType)) {
                    proxyType = Type.HTTP;
                } else if ("SOCKS".equals(scriptProxyType)) {
                    proxyType = Type.SOCKS;
                } else {
                    // Should never happen, already filtered by Pattern.
                    throw new RuntimeException("Unrecognized proxy type.");
                }
                result.add(new Proxy(proxyType, new InetSocketAddress(m.group(2), Integer.parseInt(m.group(3)))));
            }
        }
    }

    @Override
    public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
        LOGGER.log(Level.WARNING, "connectFailed: " + uri + ", " + sa, ioe);
        Context c = new ContextFactory().enterContext(this.context);
        try {
            Scriptable s = this.scriptable;
            Object fObj = ScriptableObject.getProperty(s, "connectFailed");
            if (!(fObj instanceof Callable)) {
                LOGGER.log(Level.FINE, "No connectFailed function found: {0}", fObj);
                return;
            }
            ((Callable) fObj).call(c, s, s, new Object[]{uri.toString(), sa.toString(), ioe.toString()});
        } finally {
            Context.exit();
        }
    }

    /**
     * @author mahieddine_ichir
     */
    protected static class PacFunctions {

        public static void alert(String s) {
            LOGGER.log(Level.INFO, "PAC-alert: {0}", s);
        }

        public static String myIpAddress() {
            if (LOGGER.isLoggable(Level.FINE)) {
                LOGGER.fine("myIpAddress called.");
            }
            try {
                return InetAddress.getLocalHost().getHostAddress();
            } catch (Exception ex) {
                throw new WrappedException(ex);
            }
        }

        public static String dnsResolve(String name) {
            if (LOGGER.isLoggable(Level.FINE)) {
                LOGGER.log(Level.FINE, "dnsResolve called: {0}", name);
            }
            try {
                return InetAddress.getByName(name).getHostAddress();
            } catch (UnknownHostException uhe) {
                LOGGER.log(Level.WARNING, "dnsResolve returning null for: {0}", name);
                return null;
            }
        }
    }

    /**
     * <p>
     * Hack for <a
     * href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6782031"
     * >http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6782031</a> and <a
     * href="https://bugzilla.mozilla.org/show_bug.cgi?id=468385"
     * >https://bugzilla.mozilla.org/show_bug.cgi?id=468385</a>.
     * </p>
     */
    protected static class PacClassShutter implements ClassShutter {
        public boolean visibleToScripts(String fullClassName) {
            LOGGER.log(Level.WARNING, "visibleToScripts returning false for: {0}", fullClassName);
            return false;
        }
    }
}
