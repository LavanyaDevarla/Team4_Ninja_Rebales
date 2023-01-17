package programsTest;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;





public class GetAllPrograms {

	/*@Test
	public void get()
	{
		
		Response res = RestAssured.get(" https://lms-backend-service.herokuapp.com/lms/allPrograms");
	    System.out.println("Status code:" + res.getStatusCode());
		
	    System.out.println("Response time:"+res.getTime());
        System.out.println(res.getBody().asString());
        int statusCode =res.getStatusCode();
        Assert.assertEquals(statusCode, 200);
	}*/
	
	
	@Test
	public void getallPrograms()
	{
		baseURI = "https://lms-backend-service.herokuapp.com";
		given()
		.get("/lms/allPrograms")
		.then()
		.statusCode(200)
		.log().all();
		//.body("[0].programId", equalTo(762));
	
		
	}
	
	
		
	}
