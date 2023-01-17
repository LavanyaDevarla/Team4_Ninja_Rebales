package programsTest;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;


import static io.restassured.RestAssured.*;
public class GetProgramNameByID {

	@Test
	public void programbyID() {

	given().when().get("https://lms-backend-service.herokuapp.com/lms/programs/2641").then().statusCode(200).log()
	.all().assertThat().body("programName", equalTo("Jan23-APIRebels-SDET-2116"))
	.header("Content-Type", equalTo("application/json"));

	}

	

}
