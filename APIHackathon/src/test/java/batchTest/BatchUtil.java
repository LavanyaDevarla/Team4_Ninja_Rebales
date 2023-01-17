package batchTest;

import org.apache.commons.lang3.RandomStringUtils;

public class BatchUtil {
	public static String batchId()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(2);
		return ("200" + generatedString);
		
	}
	
	public static String batchName()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("LearningPost+200+Automation" + generatedString);
		
	}
	
	public static String batchStatus()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("Running" + generatedString);
		
	}
	
	
	public static String batchNoOfClasses()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("12" + generatedString);
		
	}
	
	public static String programId()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("308" + generatedString);
		
	}
	public static String programName()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("Jan23-CRUDCarriers-SDET-008" + generatedString);
		
	}
}
