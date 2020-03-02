package components.network;

public class ProxyConfiguration {
    private String host;
    private String port;
    private String user;
    private String password;

    public ProxyConfiguration(String host, String port) {
        this.host = host;
        this.port = port;
    }

    public ProxyConfiguration(String host, String port, String user, String password) {
        this(host, port);
        this.user = user;
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}