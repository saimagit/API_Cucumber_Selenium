package tcs1.amex;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception, IOException
    {
    	String url="https://www.5dayweather.org/api.php?city=London";
		
	    //HttpClient client=HttpClientBuilder.create().build(); 
	     CloseableHttpClient client = HttpClients.createDefault();
	     HttpGet getRequest=new HttpGet(url);				 
		  //addHeaders(getRequest);
	    HttpResponse response= client.execute(getRequest);
			
			System.out.println(response.getStatusLine().getStatusCode());
	       //HttpEntity entity = CloseableHttpResponse.getEntity();
    }
}
