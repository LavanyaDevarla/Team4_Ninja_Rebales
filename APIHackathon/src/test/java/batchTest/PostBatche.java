package batchTest;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import programsTest.RestUtil;

public class PostBatche {
public static HashMap map = new HashMap();
	
	

	@BeforeClass
	public void postData()
	{
		
		map.put("batchId", BatchUtil.batchId());
		map.put("batchName", BatchUtil.batchName());
		map.put("batchStatus", BatchUtil.batchStatus());
		map.put("batchNoOfClasses", BatchUtil.batchNoOfClasses());
		map.put("programId", BatchUtil.programId());
		map.put("programName", RestUtil.programName());
		
		RestAssured.baseURI ="https://lms-backend-service.herokuapp.com/lms";
		RestAssured.basePath ="batches";
	}
	
	@Test
	public void storeData()
	{
		given()
		
		.contentType("application/json")
		.body(map)
		.when()
		.post()
		.then();
	
		
		
		
	}
}
