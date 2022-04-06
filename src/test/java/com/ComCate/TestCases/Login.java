package com.ComCate.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import com.ComCate.CommonBrowsers.BrowsersList;
import com.ComCate.Utils.CCPUtils;
import com.ComCate.Utils.Credentials;
import com.ComCate.Utils.LoginAgencyUtils;
import com.ComCate.CommonMethods.WebDriverWaits;
import com.ComCate.ExtentReport.ExtentReportClass;


public class Login extends ExtentReportClass {
	
		public static By emailField = By.id(LoginAgencyUtils.Username);
	    public static By passField = By.id(LoginAgencyUtils.Password);
	    public static By BtnField = By.id(LoginAgencyUtils.Button);
	    public static By CCPButton = By.xpath(CCPUtils.CCPBtn);

//  Create or initialize objects here.	
	BrowsersList bl = new BrowsersList();

	
	@BeforeSuite
	public void validateSetUp() throws IOException, InterruptedException {
				
     // To Open Browser.
		bl.initialize();
//		Thread.sleep(3000);
		
	 // To Open Url.	
	    bl.urlStack();
	    driver.manage().window().maximize();
//		Thread.sleep(4000);
			
	}
	
	 
	 @Test(priority = 0)
	    public static void LoginAgency() {
	        extentTest = extent.startTest(" Pre-requisite(Login) ");
	         extentTest.setDescription(" Verify that user is able to log in with valid credentials. ");
	         try {
		        	 WebDriverWaits.SendKeys(emailField, Credentials.AgencyUsername);
		        	 WebDriverWaits.SendKeys(passField, Credentials.AgencyPassword);
		        	 WebDriverWaits.ClickOn(BtnField);
		            WebDriverWaits.WaitUntilVisible(CCPButton);
		            WebElement CPPBtn = driver.findElement(CCPButton);
	            if(CPPBtn.isDisplayed()==false){
	                Assert.assertEquals("Fail", "");
	            }
	         }
	         catch (AssertionError e) {
	            System.out.println(e.getMessage());
	         }
	    }


	 
	
    
}
