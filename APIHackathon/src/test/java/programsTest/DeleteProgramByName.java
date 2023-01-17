package programsTest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;


public class DeleteProgramByName {

	@Test
	public void deletebyNameRequest()
	{
		RestAssured.baseURI ="https://lms-backend-service.herokuapp.com/lms";
		RestAssured.basePath ="/deletebyprogname/Jan23-SAvePrograms-SDET+003";
		
		
		given()
		
		.when()
		.delete()
		.then()
		.statusCode(200)
		//.statusLine("HTTP/1.1 200 OK")
		.log().all();
		
		
	}


	
/*	@Test
	public void delete()
	{
		baseURI = "https://lms-backend-service.herokuapp.com";
		given()
		.get("/lms/deletebyprogname/UpdatedBrand_1_V0.4")
		.then()
		.statusCode(200)
		.log().all();
}*/
}