package seleniumglucode;


import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class API_Test {
	
	CloseableHttpClient client;
	HttpGet getRequest;
	HttpResponse response;	
	String url="https://www.5dayweather.org/api.php?city=London";
	int statusCode;
	
	@Given("^URL of the weather API for correct city is avaiable$")
	public void weather_API_is_Hit() throws Throwable {
		url="https://www.5dayweather.org/api.php?city=London";			
	}

	@When("^Hit the weather API$")
	public void user_checks_the_response() throws Throwable {
		client = HttpClients.createDefault();
	      getRequest=new HttpGet(url);			  
	     response= client.execute(getRequest);	    
	}

	@Then("^status code in the response is (\\d+)$")
	public void status_code_in_the_response_is(int arg1) throws Throwable {
		statusCode=response.getStatusLine().getStatusCode();		
		Assert.assertEquals(200, statusCode);
	    
	}


}
