package com.ComCate.CommonBrowsers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowsersList {

	public static WebDriver driver;
	public Properties prop;
	

	@SuppressWarnings("static-access")
	public void initialize() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//TestData//Data.Properties");
		prop.load(fis);
		
	/*  Below browsers are defined in 'Data.Properties' file.
		We can change browser in 'Data.Properties' file. */
		
		String browserName = prop.getProperty("browser"); 
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			this.driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			this.driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			this.driver = new EdgeDriver();		
		}
		else
		{
			WebDriverManager.iedriver().setup();
			this.driver = new InternetExplorerDriver();	
		}
	}

//  The below URL is defined in 'Data.Properties' file, Change or update URL in Data.Properties file
	
	public void urlStack()
	{
	 
		     driver.get(prop.getProperty("url"));
	 
	}	
	
	public void simpleWait() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
