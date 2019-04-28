package Tools.ApiTesting;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


public class ApiRequestsMethods {

    private HttpClient client = HttpClientBuilder.create().build();

    private JSONObject fromStringToJSON(String input) {
        JSONParser parser = new JSONParser();

        try {
            return (JSONObject) parser.parse(input);
        } catch (ParseException e) {
            return null;
        }
    }


    public JSONObject GetMethod(String url) {

        HttpUriRequest request = new HttpGet(url);

        try {
            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();
            String apiOutput = EntityUtils.toString(entity);

            return fromStringToJSON(apiOutput);

        } catch (IOException e) {

            System.out.println("Oooops, something went wrong with the Get Request... Take a look with the Debug!");
            return null;

        }
    }


    public void PostMethod(String url, List<NameValuePair> params) {

        HttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);

        try {

            httpPost.setHeader("Content-type", "application/json");

            httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));

            HttpResponse response = httpClient.execute(httpPost);

            // Verify that the Response is 200
            Assert.assertEquals(200, response.getStatusLine().getStatusCode());

        } catch (IOException e) {

            System.out.println("Oooops, something went wrong with the Post Request... Take a look with the Debug!");


        }

    }


    /**
     * Optional Post - Doesnt seem to be working either...
     * @param url
     * @throws IOException
     */
    public void aDifferenPost(String url) throws IOException {

        final String POST_PARAMS = "{\n" + "\"id\": 101,\r\n" +
                "    \"selection\": selectionHere,\r\n" +
                "    \"price\": \"10\",\r\n" +
                "    \"status\": \"Active\",\r\n" +
                "    \"result\": \"Won\"" + "\n}";

        System.out.println(POST_PARAMS);

        URL obj = new URL(url);

        HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
        postConnection.setRequestMethod("POST");
        postConnection.setRequestProperty("Content-Type", "application/json");
        postConnection.setDoOutput(true);

        OutputStream os = postConnection.getOutputStream();

        os.write(POST_PARAMS.getBytes());
        os.flush();
        os.close();

        int responseCode = postConnection.getResponseCode();

        System.out.println("POST Response Code :  " + responseCode);
        System.out.println("POST Response Message : " + postConnection.getResponseMessage());

        if (responseCode == HttpURLConnection.HTTP_CREATED) {

            BufferedReader in = new BufferedReader(new InputStreamReader(
                    postConnection.getInputStream()));
            String inputLine;

            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            in.close();

            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("POST NOT WORKED");
        }


    }


    public HttpResponse PutMethod(String url, List<NameValuePair> params) throws IOException {

        HttpClient httpclient = HttpClients.createDefault();
        HttpPut httpPut = new HttpPut(url);

        // Request parameters and other properties.
        httpPut.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));

        //Execute and get the response.
        return httpclient.execute(httpPut);


//        URL url = new URL("http://www.example.com/resource");
//        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
//        httpCon.setDoOutput(true);
//        httpCon.setRequestMethod("PUT");
//        OutputStreamWriter out = new OutputStreamWriter(
//                httpCon.getOutputStream());
//        out.write("Resource content");
//        out.close();
//        httpCon.getInputStream();
    }

    public HttpResponse DeleteMethod(String url) throws IOException {

        HttpClient httpclient = HttpClients.createDefault();
        HttpDelete httpDelete = new HttpDelete(url);

        //Execute and get the response.
        return httpclient.execute(httpDelete);

    }

}
