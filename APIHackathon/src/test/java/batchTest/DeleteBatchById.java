package batchTest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteBatchById {
	@Test
	public void deletebyBatchIDRequest()
	{
		RestAssured.baseURI ="https://lms-backend-service.herokuapp.com/lms";
		RestAssured.basePath ="/batcheh/689";
		
		
		given()
		
		.when()
		.delete()
		.then()
		//.statusCode(200)
		//.statusLine("HTTP/1.1 200 OK")
		.log().all();
		
		
	}
}
