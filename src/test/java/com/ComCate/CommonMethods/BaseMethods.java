package com.ComCate.CommonMethods;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ComCate.CommonBrowsers.BrowsersList;

public class BaseMethods extends BrowsersList
{
	
	@SuppressWarnings("static-access")
	public BaseMethods(WebDriver driver) {
		
		this.driver = driver; 
	}


    public void baseSimpleWait() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

//	public static void waitTillElementPresent(){
//		
//		WebDriverWait dw = new WebDriverWait(driver, 50);
//		dw.until(ExpectedConditions.presenceOfElementLocated(null));
//    }
	
	public static void AlertReads() 
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
	
	}

//	ExpectedConditions.elementToBeClickable() can accept only the type By. 
	
	public static void waitAndClick(By By){
		WebElement elm = driver.findElement(By);
		WebDriverWait wd = new WebDriverWait(driver, 70);
		wd.until(ExpectedConditions.elementToBeClickable(elm));
		elm.click();
	}
	
	public static String RequiredString(int n)
    {
        String AlphaNumericString = "0123456789";
        StringBuilder s = new StringBuilder(n);
        int y;
        for ( y = 0; y < n; y++)
        {
            int index = (int)(AlphaNumericString.length() * Math.random());
            s.append(AlphaNumericString.charAt(index));
        }
        return s.toString();

    }


	public static void waitAndClear(By By){
		WebElement elm = driver.findElement(By);
		WebDriverWait wd = new WebDriverWait(driver, 70);
		wd.until(ExpectedConditions.elementToBeClickable(elm));
		elm.clear();
	}
	public static void scrollWindow(int input) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+input+",document.body.scrollHeight)");
	}
	
	public static void windowMax() throws InterruptedException{
		driver.manage().window().maximize();
	}
	
    public static void switchWindow(int input) throws InterruptedException {               // Parameters: (type/input) -> input type.
    	ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
    	try {
			driver.switchTo().window(tab.get(input));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    public static void waitAndSendkeys(By By, String value){
    	WebElement elm = driver.findElement(By);
    	WebDriverWait wd = new WebDriverWait(driver, 70);
    	wd.until(ExpectedConditions.elementToBeClickable(elm));
    	elm.sendKeys(value);
    }
    
}

   