package batchTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
public class PostBatchID {

	  @Test
	    public void sampleTest() {
	         System.out.println("Posting New random batch Number "); 
	         System.out.println("===========================================");
	         RequestSpecification httpRequest = RestAssured.given().header("Content-Type", "application/json");
	          Response res = httpRequest.body("{\r\n"
	                + "        \"batchName\": \"Team4 API Testing1\",\r\n"
	                + "        \"batchDescription\": \"API Testing\",\r\n"
	                + "        \"batchStatus\": \"Active\",\r\n"
	                + "        \"batchNoOfClasses\": 4,\r\n"
	                + "        \"programId\": 1001,\r\n"
	                + "        \"programName\": \"Jan23-SDET-004\"\r\n"
	                + "}")
	                 .post("https://lms-backend-service.herokuapp.com/lms/batches");
	          
	          System.out.println("The response code: " +res.getStatusCode());
	          System.out.println("The response message: " +res.getStatusLine());
	          System.out.println("output:" + res.getBody().asString());
	    }
}
