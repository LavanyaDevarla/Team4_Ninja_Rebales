package batchTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class GetbatchesbyProgramId {
	 @Test
	 public void batchbyID() {
	 given()
	 .when()
	 .get("https://lms-backend-service.herokuapp.com/lms/batches/program/305")
	 .then()
	 .statusCode(200)
	 .log().all().assertThat()
	 .header("Content-Type", equalTo("application/json"));

	 }
}
