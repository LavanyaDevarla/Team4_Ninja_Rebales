package programsTest;

import org.apache.commons.lang3.RandomStringUtils;

public class Util {
	public static String getid()
	{
		String generatedString=RandomStringUtils.randomNumeric(1);
		return("23"+generatedString);
	}
	public static String getprogramname()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(4);
		return("Rebels"+generatedString);
	}
	public static String getprogramdesc()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(9);
		return("seleniumprogram"+generatedString);
	}
	
	
public static String programid()
{
	String generatedString=RandomStringUtils.randomNumeric(1);
	return("programid : "+generatedString);
}
public static String programname()
{
	String generatedString=RandomStringUtils.randomAlphabetic(4);
	return("programname"+generatedString);
}
public static String programdesc()
{
	String generatedString=RandomStringUtils.randomAlphabetic(9);
	return(generatedString);
}
}
