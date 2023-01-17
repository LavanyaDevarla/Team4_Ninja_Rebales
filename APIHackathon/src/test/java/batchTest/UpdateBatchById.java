package batchTest;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class UpdateBatchById {
	String batchId="200";
	@SuppressWarnings("rawtypes")
	public static HashMap map=new HashMap();
	
	String programid = BatchUtil.batchId();
   
@SuppressWarnings("unchecked")
	@BeforeClass
	public void putData()
	{
	    map.put("batchId",batchId);
		System.out.println("batchId" +batchId );
					RestAssured.baseURI="https://lms-backend-service.herokuapp.com/lms";
		RestAssured.basePath="/batches/200";
	}
	
	@Test
	public void testPutId()
	{
		
         given()
		.contentType("application/json")
		.body(map)
		.when()
		.post()
		.then();
		    
	}
}
