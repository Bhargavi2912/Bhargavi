package RestAssuredLearn;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPractice1 {
  @Test
  void getweatherDetails()
  {
	  RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	  RequestSpecification httprequest = RestAssured.given();
	  Response response = httprequest.request(Method.GET,"/Hyderabad");
	  
	  String resbody = response.getBody().asString();
	  int rescode = response.getStatusCode();
	  Assert.assertEquals(rescode, 200);
	  System.out.println("Responce body is "+" "+resbody +"Response code is " +" "+rescode);
	  
  }
  
}
