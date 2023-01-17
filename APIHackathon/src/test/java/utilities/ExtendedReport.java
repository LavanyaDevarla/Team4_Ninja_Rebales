package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendedReport {
	static ExtentReports extentreport;
	public static ExtentReports getExtentReport()
	{
		String extentreportspath=System.getProperty("C:\\Users\\sath1\\eclipse-workspace\\APIHackathon\\ExtendedReport");
		ExtentSparkReporter reporter=new ExtentSparkReporter(extentreportspath);
		reporter.config().setReportName("Team 4 API Rebels");
		reporter.config().setDocumentTitle("Test results");
		
		extentreport=new ExtentReports();
		extentreport.attachReporter(reporter);
		
	
		return extentreport;
		
		
		
	}
}
