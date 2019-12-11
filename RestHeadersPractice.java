package RestAssuredLearn;



import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.Test;

public class RestHeadersPractice {
	
  @Test
  public void getWeatherDetails() {
	  RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	  RequestSpecification httprequest = RestAssured.given();
	  Response response = httprequest.get("/Hyderabad");
	  
	  Headers allheaders = response.headers();
	  for(Header hed : allheaders) {
		  System.out.println("key" +" "+hed.getName() +" " +"Value" +" "+hed.getValue());
	  }
  }
}
