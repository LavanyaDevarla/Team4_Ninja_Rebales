package programsTest;

import io.restassured.RestAssured;


import static io.restassured.RestAssured.given;


import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class PutByProgramID {
	String programname="EliteForce-SDET-001-Jan23";
	@SuppressWarnings("rawtypes")
	public static HashMap map=new HashMap();
	
	String programid = Util.getid();
    
@SuppressWarnings("unchecked")
	@BeforeClass
	public void putData()
	{
	    map.put("programId",programid);
		System.out.println("programid" +programid );
					RestAssured.baseURI="https://lms-backend-service.herokuapp.com/lms";
		RestAssured.basePath="putprogram/ProgramID";
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
