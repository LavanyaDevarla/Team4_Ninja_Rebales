package batchTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class GetBatchesByBatchName {
	@Test
	 public void batchbyNameRequest() {
	 given()
	 .when()
	 .get("https://lms-backend-service.herokuapp.com/lms/batches/batchName/Jan23-CRUDCarriers-SDET-701")
	 .then()
	 .statusCode(200)
	 .log().all().assertThat()
	// .body("programId", equalTo(" 2976"))
	 .header("Content-Type", equalTo("application/json"));

	 }
}
