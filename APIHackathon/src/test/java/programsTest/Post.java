package programsTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
public class Post {

	  @Test
	     public void postAPIRequest() throws Exception
	        {
	        System.out.println("Updating programName using ProgramID "); 
	         System.out.println("===========================================");
	         System.out.println("Before Update");
	         System.out.println("===========================================");
	         given()
	         .contentType("application/json")
	         .when()
	         .get("https://lms-backend-service.herokuapp.com/lms/programs/1128")
	         .getBody().print();
	         RequestSpecification httpRequest = RestAssured.given().header("Content-Type", "application/json");
	         Response res = httpRequest.body("{\r\n"
	                + "        \"programId\": 1128,\r\n"
	                + "        \"programName\": \"NinjagoTestTeam4Rebel\",\r\n"
	                + "        \"programDescription\": \"Master PostgreSql2800\",\r\n"
	                + "        \"programStatus\": \"Active\",\r\n"
	                + "        \"creationTime\": \"2023-01-13T20:12:34.302+00:00\",\r\n"
	                + "        \"lastModTime\": \"2023-01-13T20:12:34.302+00:00\"\r\n"
	                + "}\r\n"
	                + "")
	                 .put("https://lms-backend-service.herokuapp.com/lms/putprogram/1128");
	          System.out.println("The response code - " +res.getStatusCode());
	          System.out.println("After Update");
	             System.out.println("===========================================");
	             given()
	             .contentType("application/json")
	             .when()
	             .get("https://lms-backend-service.herokuapp.com/lms/programs/1128")
	             .getBody().print();
}
}
