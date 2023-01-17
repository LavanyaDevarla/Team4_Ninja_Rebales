package programsTest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteProgrambyID {

	@Test
	public void deletebyIDRequest()
	{
		RestAssured.baseURI ="https://lms-backend-service.herokuapp.com/lms";
		RestAssured.basePath ="/deletebyprogid/3330";
		
		
		given()
		
		.when()
		.delete()
		.then()
		//.statusCode(200)
		//.statusLine("HTTP/1.1 200 OK")
		.log().all();
		
		
	}
}
