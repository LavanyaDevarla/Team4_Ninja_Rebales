package batchTest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;
public class GetBatchesbyID {
	 @Test
	 public void batchbyID() {
	 given()
	 .when()
	 .get("https://lms-backend-service.herokuapp.com/lms/batches/batchId/980")
	 .then()
	 .statusCode(200)
	 .log().all().assertThat()
	 .header("Content-Type", equalTo("application/json"));

	 }
}
