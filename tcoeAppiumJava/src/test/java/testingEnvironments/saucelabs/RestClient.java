package testingEnvironments.saucelabs;

import components.reporting.TestLog;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.entity.EntityBuilder;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.UnknownHostException;


/**
 * Apache Http Rest Client
 * maciej.szwarc@volvo.com
 */
public class RestClient {

    TestLog logger = new TestLog();
    private static final String CHAR_SET = "UTF-8";
    private static final String TAG = "#RestClient: ";

    /**
     * Method for sending a file using httpPost
     *
     * @param uri                 - url we send post to
     * @param file                -  file we post
     * @param destinationFileName - filename in the post
     * @param username            - username for basic auth
     * @param password            - password for basic auth
     * @return - returns status code so we can use it in assertions
     */
    public int postFileWithBasicAuth(String uri, String username, String password, File file, String destinationFileName) {
        int status = 0;

        CloseableHttpClient client;
        if (System.getProperties().getProperty("http.proxyHost").contains("volvo")) {
            String proxyAddress = System.getProperties().getProperty("http.proxyHost");
            String proxyPort = System.getProperties().getProperty("http.proxyPort");
            HttpHost proxy = new HttpHost(proxyAddress, Integer.parseInt(proxyPort));
            Credentials credentials = new UsernamePasswordCredentials(enums.Credentials.VCN_ID.toString(), enums.Credentials.VCN_KEY.toString());
            AuthScope authScope = new AuthScope(proxyAddress, Integer.parseInt(proxyPort));
            CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
            credentialsProvider.setCredentials(authScope, credentials);
            client = HttpClientBuilder.create().setProxy(proxy).setDefaultCredentialsProvider(credentialsProvider).build();

        } else {
            client = HttpClients.createDefault();
        }

        HttpPost httpPost = new HttpPost(uri);
        httpPost.addHeader(BasicScheme.authenticate(
                new UsernamePasswordCredentials(username, password),
                CHAR_SET, false));


        //MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        //builder.addBinaryBody("file", file, ContentType.APPLICATION_OCTET_STREAM, destinationFileName);
        //HttpEntity multipart = builder.build();
        //        httpPost.setEntity(multipart);
        EntityBuilder builder = EntityBuilder.create();
        builder.setFile(file);
        builder.setContentType(ContentType.APPLICATION_OCTET_STREAM);
        HttpEntity entity = builder.build();
        httpPost.setEntity(entity);

        CloseableHttpResponse response;
        logger.info("Attempting to send post request: " + uri);
        try {
            response = client.execute(httpPost);
            status = response.getStatusLine().getStatusCode();
            client.close();
            logger.info("Received response code " + String.valueOf(status));

        } catch (UnknownHostException e) {
            e.printStackTrace();
            logger.error("UnknownHostException. Nodename nor servname provided, or not known. Probably proxy issue or wrong url.");
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("IOException exception occurred when executing post request.");
        }

        return status;
    }


    /**
     * Method for sending http get request
     *
     * @param uri      - url we send get request to
     * @param username - username for basic auth
     * @param password - password for basic auth
     * @return - returns string response, in case of failure string is empty
     */
    public String getWithBasicAuth(String uri, String username, String password) {
        String responseString = "";
        int status;
        String USER_AGENT = "Chrome/40";
        logger.info("Attempting to send post request: " + uri);
        // setting up proxy and http client
        CloseableHttpClient httpClient;
        if (System.getProperties().containsKey("http.proxyHost") && System.getProperties().getProperty("http.proxyHost").contains("volvo")) {
            String proxyAddress = System.getProperties().getProperty("http.proxyHost");
            String proxyPort = System.getProperties().getProperty("http.proxyPort");
            HttpHost proxy = new HttpHost(proxyAddress, Integer.parseInt(proxyPort));
            Credentials credentials = new UsernamePasswordCredentials(enums.Credentials.VCN_ID.toString(), enums.Credentials.VCN_KEY.toString());
            AuthScope authScope = new AuthScope(proxyAddress, Integer.parseInt(proxyPort));
            CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
            credentialsProvider.setCredentials(authScope, credentials);
            httpClient = HttpClientBuilder.create().setProxy(proxy).setDefaultCredentialsProvider(credentialsProvider).build();

        } else {
            httpClient = HttpClients.createDefault();
        }


        // forming get request with basic auth
        HttpGet httpGet = new HttpGet(uri);
        httpGet.addHeader("User-Agent", USER_AGENT);
        httpGet.addHeader(BasicScheme.authenticate(
                new UsernamePasswordCredentials(username, password),
                CHAR_SET, false));
        // execution
        try {

            CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
            status = httpResponse.getStatusLine().getStatusCode();
            // obtaining the response content
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    httpResponse.getEntity().getContent()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = reader.readLine()) != null) {
                response.append(inputLine);
            }
            reader.close();
            responseString = response.toString();
            httpClient.close();
            logger.info("Received response code " + String.valueOf(status));

        } catch (UnknownHostException e) {
            //e.printStackTrace();
            logger.error("UnknownHostException. Nodename nor servname provided, or not known. Probably proxy issue or wrong url.");
        } catch (IOException e) {
            //e.printStackTrace();
            logger.error("IOException exception occurred when executing get request.");
        }

        return responseString;

    }

}


