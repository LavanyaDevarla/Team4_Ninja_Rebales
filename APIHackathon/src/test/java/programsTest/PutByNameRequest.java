package programsTest;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PutByNameRequest {

	
	
		String programname1="EliteForce-SDET-001-Jan23";
			@SuppressWarnings("rawtypes")
			public static HashMap map=new HashMap();
			
			String programid = Util.getid();
		    		String programname=Util.getprogramname();
			String getprogramdesc=Util.getprogramdesc();
			

			
		@SuppressWarnings("unchecked")
			@BeforeClass
			public void putData()
			{
			    map.put("programId",programid);
				System.out.println("programid" +programid );
				RestAssured.baseURI="https://lms-backend-service.herokuapp.com/lms";
				RestAssured.basePath="/program/"+programname1;
			}
			
			@Test
			public void testPutName()
			{
				given()
				
				.contentType("application/json")
				.body(map)
				.when()
				.post()
				.then();
				    
			}
}
