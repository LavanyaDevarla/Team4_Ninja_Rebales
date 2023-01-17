package batchTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class GetBachallPrograms {
	@Test
	public void getallPrograms()
	{
		baseURI = "https://lms-backend-service.herokuapp.com/lms";
		given()
		.get("/batches")
		.then()
		.statusCode(200)
		.log().all();
}
}