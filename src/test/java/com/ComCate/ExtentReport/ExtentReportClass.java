package com.ComCate.ExtentReport;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.ComCate.CommonBrowsers.BrowsersList;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportClass extends BrowsersList {

	public static ExtentReports extent;
	public static ExtentTest extentTest;

	
	@BeforeSuite
	public void setExtent() throws InterruptedException, IOException{
		
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReportResult.html", true);
	//	extent.addSystemInfo("User Name", "");
		extent.addSystemInfo("Environment", "Testing");
        extent.loadConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));

		
	}
	
	@AfterSuite
	public void endReport(){
		extent.flush();
		extent.close();
		
		//driver.quit();  // To close chrome in last.
	}
	
	
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
		
		if(result.getStatus()==ITestResult.FAILURE){
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report

		
			String screenshotPath = ExtentReportClass.getScreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); //to add screenshot in extent report
		//	extentTest.log(LogStatus.FAIL, extentTest.addScreencast(screenshotPath)); //to add screencast/video in extent report
		}
		else if(result.getStatus()==ITestResult.SKIP){
			extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS){
			extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());

		}
		
		
		extent.endTest(extentTest); // ending test and ends the current test and prepare to create html report
	//	driver.quit();
	}
	
//  For Screenshot :
	
 	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException{
	String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	
//	After execution, you could see a folder "FailedTestsScreenshots" Path : Mastera/test-output/FailedTestsScreenshots

	String destination = System.getProperty("user.dir") + "/test-output/FailedTestsScreenshots/" + screenshotName + dateName + ".png";
	File finalDestination = new File(destination);
	FileUtils.copyFile(source, finalDestination);
	return destination;
}

}

