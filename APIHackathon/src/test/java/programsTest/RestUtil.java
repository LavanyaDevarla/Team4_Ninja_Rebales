package programsTest;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtil {

	
	
	public static String programName()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(2);
		return ("Jan23-SAvePrograms-SDET+2001" + generatedString);
		
	}
	
	public static String programDescription()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("LearningPost+200+Automation" + generatedString);
		
	}
	
	public static String programStatus()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("Running" + generatedString);
		
	}
	
	public static String creationTime()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("2023-01-13T10:59:59.408+00:00" + generatedString);
		
	}
	
	public static String lastModTime()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("2023-01-12T03:21:40.409+00:00" + generatedString);
		
	}
}
