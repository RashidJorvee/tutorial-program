import java.util.List;
import java.util.ArrayList;
import org.apache.http.*;
import java.io.*;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.*;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.*;
import org.apache.http.message.*;
import org.apache.http.util.EntityUtils;
import org.apache.http.client.entity.*;


public class hcFeb {

public static void main (String[] args) throws ClientProtocolException, IOException {
    //Set up Cookie settings and also Timeout settings
    CookieStore cookieStore = new BasicCookieStore();
    HttpClientContext context = HttpClientContext.create();
    context.setCookieStore(cookieStore);

    int CONNECTION_TIMEOUT = 80000;
    RequestConfig requestConfig = RequestConfig.custom().setCookieSpec(CookieSpecs.DEFAULT)
            .setConnectionRequestTimeout(CONNECTION_TIMEOUT)
            .setConnectTimeout(CONNECTION_TIMEOUT)
            .setSocketTimeout(CONNECTION_TIMEOUT)
            .build();

    //Set up HttpClient
    CloseableHttpClient httpclient = HttpClients.custom().setDefaultRequestConfig(requestConfig).setDefaultCookieStore(cookieStore).disableContentCompression().build();
    //createDefault();//
    HttpGet httpGet = new HttpGet("http://localhost:4502");
    CloseableHttpResponse response = httpclient.execute(httpGet);
    
    //Create Post request to log into the website
    HttpPost httpPost = new HttpPost("http://localhost:4502/libs/granite/core/content/login.html");
    System.out.println("httppost done");
    //Login to website
     List <NameValuePair> nvps = new ArrayList <NameValuePair>();

        nvps.add(new BasicNameValuePair("j_username","admin"));
        nvps.add(new BasicNameValuePair("j_password","admin"));
        nvps.add(new BasicNameValuePair("submit", "Login"));
        httpPost.setEntity(new UrlEncodedFormEntity(nvps));
        System.out.println("nvps" +nvps);
        response = httpclient.execute(httpPost);
        System.out.println("response::" +response);

    try{
        System.out.println("response1 "+response.getStatusLine());   
        HttpEntity entity = response.getEntity();
        EntityUtils.consume(entity);                
    } finally{
    }

    //Send request for Excel file and download it.
    String link = "http://localhost:4502/bin/campaignkeyfile";
    HttpGet get = new HttpGet(link);

    //maybe create new response
    HttpResponse response2;

    try{
        response2 = httpclient.execute(get,context);
        System.out.println(response2.getStatusLine());  
        HttpEntity entity1 = response2.getEntity();


        if (entity1 != null) {
            System.out.println("Entity isn't null {} "+entity1);

            InputStream is = entity1.getContent();
            String filePath = "C:\\Users\\mohammad.raza\\Downloads\\WODETAIL_List.csv";
            FileOutputStream fos = new FileOutputStream(new File(filePath));

            byte[] buffer = new byte[5600];
            int inByte;
            while((inByte = is.read(buffer)) > 0)
                fos.write(buffer,0,inByte);
            is.close();
            fos.close();

            System.out.println("Excel File recieved");                  


            EntityUtils.toString(response2.getEntity());
            EntityUtils.consume(entity1);

        }

    } catch (ConnectionPoolTimeoutException e){
        //response.close();
        System.out.println(e.getMessage());
    } catch (IOException e){
        System.out.println(e.getMessage());
    }
}
}