package programsTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.RestAssured;
public class PostSaveProgram {

	
	public static HashMap map = new HashMap();
	@BeforeClass
	public void postData()
	{	
		map.put("ProgramName", RestUtil.programName());
		map.put("programDescription", RestUtil.programDescription());
		map.put("programStatus", RestUtil.programStatus());
		map.put("creationTime", RestUtil.creationTime());
	    map.put("lastModTime", RestUtil.lastModTime());
		
		RestAssured.baseURI ="https://lms-backend-service.herokuapp.com/lms";
		RestAssured.basePath ="/saveprogram";
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
