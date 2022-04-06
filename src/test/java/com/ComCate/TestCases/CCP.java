package com.ComCate.TestCases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import com.ComCate.CommonMethods.RandomStrings;
import com.ComCate.CommonMethods.RobotClassUploadMedia;
import com.ComCate.CommonMethods.WebDriverWaits;
import com.ComCate.ExtentReport.ExtentReportClass;
import com.ComCate.Utils.CCPUtils;
import com.ComCate.Utils.Credentials;

public class CCP extends ExtentReportClass {
	
	//Select Location Tile
	public static By LoaderImg = By.xpath(CCPUtils.loaderImg);
    public static By CCPButton = By.xpath(CCPUtils.CCPBtn);
    public static By LocationFld= By.xpath(CCPUtils.Location);
    public static By InfoMsg = By.xpath(CCPUtils.infoMsg);  
    public static By Map3 = By.xpath(CCPUtils.Map);
    public static By EditLocIcon= By.xpath(CCPUtils.EditLocation);
    public static By EditStreetAdd= By.xpath(CCPUtils.EditStAddress);
    public static By EditCity= By.xpath(CCPUtils.editCity);
    public static By EditZip = By.xpath(CCPUtils.editZip);
    public static By SaveButton = By.xpath(CCPUtils.saveButton);
    public static By CCButton = By.xpath(CCPUtils.CCbutton);
    public static By GlobalValidMsg = By.xpath(CCPUtils.globalValidMsg);
    public static By AddLocManually = By.xpath(CCPUtils.addLocManually);
    public static By ManualLocPopup = By.xpath(CCPUtils.manualLocPopup);
    public static By ValidationMsg3 = By.xpath(CCPUtils.validationMsg3);
    public static By SaveButton2 = By.xpath(CCPUtils.saveButton2);
    public static By StreetAdd = By.xpath(CCPUtils.streetAdd);
    public static By CityAdd = By.xpath(CCPUtils.cityAdd);
    public static By ZipAdd = By.xpath(CCPUtils.zipAdd);
    public static By ApnAdd = By.xpath(CCPUtils.apnAdd);
    public static By OutAgencyMsg = By.xpath(CCPUtils.outAgencyMsg);
    public static By CancelBtnLoc = By.xpath(CCPUtils.cancelBtnLoc);
    public static By NameLabel = By.xpath(CCPUtils.nameLabel);
    public static By CityLabel = By.xpath(CCPUtils.cityLabel);
    public static By ZipLabel = By.xpath(CCPUtils.zipLabel);
    public static By CancelButton = By.xpath(CCPUtils.cancelButton);
    public static By FlagToggle= By.xpath(CCPUtils.flagToggle);
    public static By PopupTitle= By.xpath(CCPUtils.popupTitle);
    public static By ReasonToFlag = By.xpath(CCPUtils.reasonToFlag);
    public static By FlagAddressBtn = By.xpath(CCPUtils.flagAddressBtn);
    public static By CrossIconFlag = By.xpath(CCPUtils.crossIconFlag);
    public static By FlaggedLabel = By.xpath(CCPUtils.flaggedLabel);
    



    //Add Violations Tile
    public static By ViolationsTile = By.xpath(CCPUtils.violationsTile);
    public static By ViolationSearchBox = By.xpath(CCPUtils.violationSearchBox);
    public static By ViolationList = By.xpath(CCPUtils.violationList);
    public static By ViolationPopup = By.xpath(CCPUtils.violationPopup);
    public static By EntityField1= By.xpath(CCPUtils.entityField1);
    public static By AddButton = By.xpath(CCPUtils.addButton);
    public static By ValidationMsg2 = By.xpath(CCPUtils.validationMsg2);
    public static By InfoMsg2 = By.xpath(CCPUtils.infoMsg2);
    public static By InfoMsgNoSearch = By.xpath(CCPUtils.infoMsgNoSearch);
    public static By CustomIssueIcon = By.xpath(CCPUtils.customIssueIcon);
    public static By CustomIssueFeild = By.xpath(CCPUtils.customIssueFeild);
    public static By CustomIssueDesc= By.xpath(CCPUtils.customIssueDesc);
    public static By ValidMsgCustom = By.xpath(CCPUtils.validMsgCustom);
    public static By WaterViolation = By.xpath(CCPUtils.waterViolation);
    public static By ValidMsgVioPopup = By.xpath(CCPUtils.validMsgVioPopup);
  public static By EntitySearchBox = By.xpath(CCPUtils.entitySearchBox);
  public static By EntitySearchList = By.xpath(CCPUtils.entitySearchList);
  public static By AddedVioList = By.xpath(CCPUtils.addedVioList);
  public static By AddAnotherVio = By.xpath(CCPUtils.addAnotherVio);
  public static By CrossIconVio = By.xpath(CCPUtils.crossIconVio);
  public static By EditIconVio = By.xpath(CCPUtils.editIconVio);
  public static By UploadLink = By.xpath(CCPUtils.uploadLink);
  public static By UploadLink2 = By.xpath(CCPUtils.uploadLink2);
public static By UploadedImg = By.xpath(CCPUtils.uploadedImg);
public static By CustomIssueDlt = By.xpath(CCPUtils.customIssueDlt);
public static By DltUploadedImg = By.xpath(CCPUtils.dltUploadedImg);
public static By EntityAddBtn = By.xpath(CCPUtils.entityAddBtn);
public static By EntityCancelBtn = By.xpath(CCPUtils.entityCancelBtn);
public static By UploadedImgThumb = By.xpath(CCPUtils.uploadedImgThumb);
public static By CountViolations = By.xpath(CCPUtils.countViolations);
public static By CountEachVio = By.xpath(CCPUtils.countEachVio);
public static By ClosePopup = By.xpath(CCPUtils.closePopup);
public static By AddedImgThumb= By.xpath(CCPUtils.addedImgThumb);
//public static By = By.xpath(CCPUtils);

    //Contacts Tile
public static By AddContactFld = By.xpath(CCPUtils.addContactFld);
public static By CrtNewContact = By.xpath(CCPUtils.crtNewContact);
public static By ContactPopup = By.xpath(CCPUtils.contactPopup);
public static By CrtContactBtn = By.xpath(CCPUtils.crtContactBtn);
public static By ContactErrMsg = By.xpath(CCPUtils.contactErrMsg);
public static By NameField = By.xpath(CCPUtils.nameField);
public static By CountContact = By.xpath(CCPUtils.countContact);
public static By CancelContactBtn = By.xpath(CCPUtils.cancelContactBtn);
public static By EditContact = By.xpath(CCPUtils.editContact);
public static By EditContactPopup = By.xpath(CCPUtils.editContactPopup);
public static By CancelEditPopup = By.xpath(CCPUtils.cancelEditPopup);
public static By DeleteContact = By.xpath(CCPUtils.deleteContact);
public static By CountContactTile = By.xpath(CCPUtils.countContactTile);
public static By CreateAnyway = By.xpath(CCPUtils.createAnyway);
//public static By = By.xpath(CCPUtils);
//public static By = By.xpath(CCPUtils);
//public static By = By.xpath(CCPUtils);


    //Attachments Tile
  public static By ImageIcon = By.xpath(CCPUtils.imageIcon);
  public static By AttachmentTitle = By.xpath(CCPUtils.attachmentTitle);
  public static By CameraButton = By.xpath(CCPUtils.cameraButton);
  public static By AddButton2 = By.xpath(CCPUtils.addButton2);
  public static By ImgThumb = By.xpath(CCPUtils.imgThumb);
  public static By CrossIcon2 = By.xpath(CCPUtils.crossIcon2);
  public static By YesCloseBtn = By.xpath(CCPUtils.yesCloseBtn);
  public static By DontCloseBtn = By.xpath(CCPUtils.dontCloseBtn);
  public static By ImgThumb2 = By.xpath(CCPUtils.imgThumb2);
  public static By AttachmentTile = By.xpath(CCPUtils.attachmentTile);
  public static By ModalHeaders = By.xpath(CCPUtils.modalHeaders);
  public static By AddedImage = By.xpath(CCPUtils.addedImage);
  public static By Description = By.xpath(CCPUtils.description);
  public static By UpdateBtn = By.xpath(CCPUtils.updateBtn);
public static By CrossIcon = By.xpath(CCPUtils.crossIcon);
public static By CountAttachment = By.xpath(CCPUtils.countAttachment);
public static By DeleteAttach = By.xpath(CCPUtils.deleteAttach);
public static By YesDelete = By.xpath(CCPUtils.yesDelete);


//WebDriverWaits.WaitUntilInvisible(LoaderImg);

    @Test(priority = 1)
    public void PreRequisite()
    {
        extentTest = extent.startTest(" PreRequisite (CCP)");
        extentTest.setDescription(" Verify that CCP opens up, when user clicks on the 'Plus' icon, on Dashboard. ");
         try {
        	 Thread.sleep(1000);
         	WebDriverWaits.ClickOn(CCPButton);
//         	JavascriptExecutor jser = (JavascriptExecutor)driver;
//			 Thread.sleep(1000);
//			 WebElement CCPBtnJSE = (WebElement) jser.executeScript("return document.querySelector('div.app-header__right > a')");
//			 WebDriverWaits.ClickOnWE(CCPBtnJSE);
       	 Thread.sleep(1000);
       	WebDriverWaits.WaitUntilVisible(ViolationsTile);
       	 WebElement CCPElement = WebDriverWaits.WaitUntilVisibleWE(ViolationsTile);
           if((CCPElement.isDisplayed())==false){
				Assert.assertEquals(false, true);
           }
         } catch (InterruptedException e) {
 			e.printStackTrace();
 		}
   }
    
    
	 @Test(priority = 2)
	 public static void TC_CCP_01() {
	     extentTest = extent.startTest(" TC_CCP_01 ");
	     extentTest.setDescription(" Verify that appropriate validation message appears when user clicks on 'Create Case' button without entering any data in mandatory fields, on 'Create Case' page. ");
	        try {
	        	Thread.sleep(2000);
			WebDriverWaits.ClickOn(CCButton);
			String ValidationMsg = WebDriverWaits.GetText(GlobalValidMsg);
			String ValidMsg6 = "Please complete all fields marked in red below to continue.";
			Assert.assertEquals(ValidMsg6, ValidationMsg);
	        } catch (InterruptedException e) {
				e.printStackTrace();
			}

	 }
	
	 
	 @Test(priority = 3)
	 public static void TC_CCP_02() {
        extentTest = extent.startTest(" TC_CCP_02 ");
        extentTest.setDescription(" Verify that an information message appears by deafult, when no location is selected, on 'Create Case' page. ");
        try {
//			String InfoMessage = WebDriverWaits.GetText(InfoMsg);
//					String InfoMsg = "Enter an address, APN Number, or drop a pin on the map to add location details\nLocation is required to create a case";
//					Assert.assertEquals(InfoMsg, InfoMessage);
        	Thread.sleep(0000);
        	WebElement InfoMessage = WebDriverWaits.WaitUntilVisibleWE(InfoMsg);
        	if((InfoMessage.isDisplayed())==false) {
				Assert.assertEquals(false, true);
        	}
        } catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	  
    
	 @Test(priority = 4)
	 public static void TC_CCP_03() {
	     extentTest = extent.startTest(" TC_CCP_03 ");
	 	  extentTest.setDescription(" Verify that appropriate validation message appears, when user clicks on the outside of Agency boundary on map, on 'Create Case' page. ");
		 try {
			WebDriverWaits.SendKeys(LocationFld, "Turkey");
			 Thread.sleep(2000);
			WebDriverWaits.ClickOn(Map3);
			 Thread.sleep(2000);
			 String OutsideAgencyMsg = WebDriverWaits.GetText(OutAgencyMsg);
	            String ValidMsg7 = "The location you have entered falls outside of the\n" + 
	            		"agency boundary. Please select a location within\n" + 
	            		"the city limits to continue";
	            Assert.assertEquals(ValidMsg7, OutsideAgencyMsg);
	 } catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 
	 

    @Test(priority = 5)
    public void TC_CCP_04() 
    {
        extentTest = extent.startTest(" TC_CCP_04 ");
        extentTest.setDescription(" Verify that user is able to add a location from 'Enter Address, APN or drop a Pin on the Map' combo box, on 'Create Case' page. ");
		 try {
         WebDriverWaits.SendKeys(LocationFld, "Texas ");
         WebDriverWaits.WaitUntilVisible(Map3);
         WebDriverWaits.SendKeys(LocationFld, "City Museum");
         WebDriverWaits.WaitUntilVisible(Map3);
         Thread.sleep(1000);
         WebDriverWaits.ClickOn(Map3);
         WebDriverWaits.WaitUntilVisible(EditLocIcon);
//            WebElement EditLocationIcon = driver.findElement(EditLocIcon);
         WebElement EditLocationIcon = WebDriverWaits.WaitUntilVisibleWE(EditLocIcon);
            if((EditLocationIcon.isDisplayed())==false){
				Assert.assertEquals(false, true);
            }
		 }catch (InterruptedException e) {
				e.printStackTrace();
			}  }
    
	 
    
	 @Test(priority = 7)
	 public static void TC_CCP_06() {
	     extentTest = extent.startTest(" TC_CCP_06 ");
	 	  extentTest.setDescription(" Verify that 'Add Address Manually' popup opens up, after clicking on 'Add Address Manually' link, on 'Create Case' page. ");
		 try {
			 JavascriptExecutor jse = (JavascriptExecutor)driver;
			 WebDriverWaits.SendKeys(LocationFld, " ");
			 Thread.sleep(1000);
			 WebElement AddLoc = (WebElement) jse.executeScript("return document.querySelector('#react-autowhatever-1 > div')");
			 WebDriverWaits.ClickOnWE(AddLoc);
			 Thread.sleep(2000);
			 WebDriverWaits.WaitUntilVisible(ManualLocPopup);
			String PopupTitle =  WebDriverWaits.GetText(ManualLocPopup); 
			String PopupTitle2 = "Add Address Manually";
			Assert.assertEquals(PopupTitle2, PopupTitle);
	           } catch (InterruptedException e) {
				e.printStackTrace();
			}
	        

	 }
	 
	 @Test(priority = 8)
	 public static void TC_CCP_07() {
	     extentTest = extent.startTest(" TC_CCP_07 ");
	 	  extentTest.setDescription(" Verify that 'Add Address Manually' popup gets closed, when user clicks on 'Cross' icon or 'Cancel' button, on 'Create Case' page. ");
		 try {
			WebDriverWaits.ClickOn(CancelBtnLoc);
			Thread.sleep(2000);
			List <WebElement> ModalHeaders1 = WebDriverWaits.WaitUntilVisibleList(ModalHeaders);
			if((ModalHeaders1.size()<=1)==false) {
				Assert.assertEquals(false, true);
				}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 
	 
	 @Test(priority = 9)
	 public static void TC_CCP_08() {
	     extentTest = extent.startTest(" TC_CCP_08 ");
	 	  extentTest.setDescription(" Verify that validation messages appear when user clicks on 'Add Address' button without entering data in mandatory fields, on 'Create Case' popup.  ");
		 try {
			Thread.sleep(0000);
			 WebDriverWaits.ClickOn(LocationFld);
			 WebDriverWaits.ClickOn(AddLocManually);
			 WebDriverWaits.ClickOn(SaveButton2);
			String ValidationMsg4 = WebDriverWaits.GetText(ValidationMsg3);
			String ValidMsg7 = "The Address is required.";
			Assert.assertEquals(ValidMsg7, ValidationMsg4);
		 } catch (InterruptedException e) {
				e.printStackTrace();
			}
	 }
	  
    
	 @Test(priority = 10)
	 public static void TC_CCP_09() {
	     extentTest = extent.startTest(" TC_CCP_09 ");
	 	  extentTest.setDescription(" Verify that the address gets added under 'Select Location' tile, after entering address details manually & clicking on 'Add Address' button, on 'Add Address Manually' popup. ");
		 try {
				Thread.sleep(1000);
				WebDriverWaits.SendKeys(StreetAdd, "Manual Street");
				WebDriverWaits.SendKeys(CityAdd, "Manual City");
				WebDriverWaits.SendKeys(ZipAdd, "77590");
				WebDriverWaits.SendKeys(ApnAdd, "7030-0122-0011-000");
				WebDriverWaits.ClickOn(SaveButton2);
				WebDriverWaits.WaitUntilVisible(EditLocIcon);
	            WebElement EditLocationIcon = driver.findElement(EditLocIcon);
	            if((EditLocationIcon.isDisplayed())==false){
					Assert.assertEquals(false, true);
	            }
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	 }
	 
	 
	
	 @Test(priority = 11)
	 public static void TC_CCP_10() {
	     extentTest = extent.startTest(" TC_CCP_10 ");
	     extentTest.setDescription(" Verify that user is able to edit the location details, after clicking on the 'Edit' icon, on 'Create Case' page. ");
		 try {
			 Thread.sleep(1000);
			 WebDriverWaits.ClickOn(EditLocIcon);
	           WebElement EditStreet = WebDriverWaits.WaitUntilVisibleWE(EditStreetAdd);
//	        		   driver.findElement(EditStreetAdd);
	           EditStreet.clear();
	           WebDriverWaits.SendKeys(EditStreetAdd, Credentials.StreetAddress);
//	           EditStreet.sendKeys(Credentials.StreetAddress);
	           WebElement EditCityFld = WebDriverWaits.WaitUntilVisibleWE(EditCity);
	           EditCityFld.clear();
	           EditCityFld.sendKeys(Credentials.City);
	           WebElement EditZipFld = WebDriverWaits.WaitUntilVisibleWE(EditZip);
	           EditZipFld.clear();
	           EditZipFld.sendKeys(Credentials.Zip);
	           WebElement SaveBtn = WebDriverWaits.WaitUntilVisibleWE(SaveButton);
	           if((SaveBtn.isDisplayed())==false) {
					Assert.assertEquals(false, true);
	           }
						
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	 }
	 
	 
	 @Test(priority = 12)
	 public static void TC_CCP_11() {
	      extentTest = extent.startTest(" TC_CCP_11 ");
	 	  extentTest.setDescription(" Verify that address gets updated, when user edits data and clicks on 'Save' button under 'Select Location' tile, on 'Create Case' page. ");
		 try {
		WebDriverWaits.ClickOn(SaveButton);
		Thread.sleep(2000);
		String NameLabel1 = WebDriverWaits.GetText(NameLabel); 
		Assert.assertEquals(Credentials.StreetAddress, NameLabel1);
		String CityLabel1 = WebDriverWaits.GetText(CityLabel);
		Assert.assertEquals(Credentials.City, CityLabel1);	
		Thread.sleep(0000);
		String ZipLabel1 = WebDriverWaits.GetText(ZipLabel);
		Assert.assertEquals(Credentials.Zip, ZipLabel1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 
	 @Test(priority = 13)
	 public static void TC_CCP_12() {
	      extentTest = extent.startTest(" TC_CCP_12 ");
	 	  extentTest.setDescription(" Verify that address does not get updated, when user edits data and clicks on 'Cancel' button under 'Select Location' tile, on 'Create Case' page. ");
		 try {
			 Thread.sleep(1000);
			 WebDriverWaits.ClickOn(EditLocIcon);
			 WebDriverWaits.ClickOn(CancelButton);
			 String NameLabel1 = WebDriverWaits.GetText(NameLabel);
			 Assert.assertEquals(Credentials.StreetAddress, NameLabel1);
		 	 String CityLabel1 = WebDriverWaits.GetText(CityLabel);
			 Assert.assertEquals(Credentials.City, CityLabel1);	
			 Thread.sleep(0000);
			 String ZipLabel1 = WebDriverWaits.GetText(ZipLabel);
			 Assert.assertEquals(Credentials.Zip, ZipLabel1);
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 
	 
	 @Test(priority = 14)
	 public static void TC_CCP_13() {
	      extentTest = extent.startTest(" TC_CCP_13 ");
	 	  extentTest.setDescription(" Verify that 'Flag Address' popup opens up for an unflagged address, when user clicks on 'Flagged?' toggle button, on 'Create Case' page. ");
		 try {
			 WebDriverWaits.ClickOn(FlagToggle);
				Thread.sleep(2000);
			String[] FlagPopup = WebDriverWaits.GetText(PopupTitle).split("-");
			String FlagPopupTitle = FlagPopup[0];
			Assert.assertEquals("Flag Address ", FlagPopupTitle);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 @Test(priority = 15)
	 public static void TC_CCP_14() {
	      extentTest = extent.startTest(" TC_CCP_14 ");
	 	  extentTest.setDescription(" Verify that 'Flag Address' popup gets closed, when user clicks on 'Cross' icon or 'Cancel' button, on 'Flag Address' popup. ");
		 try {
		WebDriverWaits.ClickOn(CrossIconFlag);
		Thread.sleep(1000);
		List <WebElement> ModalHeaders3 = WebDriverWaits.WaitUntilVisibleList(ModalHeaders);
		if((ModalHeaders3.size()<=1)==false) {
			Assert.assertEquals(false, true);
		}
						
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 
	 @Test(priority = 16)
	 public static void TC_CCP_15() {
	      extentTest = extent.startTest(" TC_CCP_15 ");
	 	  extentTest.setDescription(" Verify that 'Flag address' button gets enabled, when user enters data in 'Reason to Flag the address' field, on 'Flag Address' popup. ");
		 try {
			 WebDriverWaits.ClickOn(FlagToggle);
			 Thread.sleep(1000);
				boolean Status = driver.findElement(FlagAddressBtn).isEnabled();
				Assert.assertEquals(Status, false);
			String RandomReason = RandomStrings.RequiredString(20);
			WebDriverWaits.SendKeys(ReasonToFlag, RandomReason);
		Thread.sleep(1000);
		boolean Status1 = driver.findElement(FlagAddressBtn).isEnabled();
		Assert.assertEquals(Status1, true);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 } 
	 
	 
	 @Test(priority = 17)
	 public static void TC_CCP_16() {
	      extentTest = extent.startTest(" TC_CCP_16 ");
	 	  extentTest.setDescription(" Verify that 'Flagged?' toggle button gets enabled, when user clicks on 'Flag Address' button after entering data in the mandatory field, on 'Create Case' popup. ");
		 try {
			 WebDriverWaits.ClickOn(FlagAddressBtn);
			 	Thread.sleep(0000);
				String FlaggedLabel1 = WebDriverWaits.GetText(FlaggedLabel);
				Assert.assertEquals(FlaggedLabel1, "Yes");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }

	
	//----------------------------------------------------------- Add Violations Tile ------------------------------------------------------------------///

		
	 @Test(priority = 18)
	 public static void TC_CCP_17() {
	      extentTest = extent.startTest(" TC_CCP_17 ");
	 	  extentTest.setDescription(" Verify that an information message appears when no violation is added, on 'Create Case' page. ");
		 try {
			Thread.sleep(1000);
//			String InfoMessage2 = WebDriverWaits.GetText(InfoMsg2);
//			String InfoMsg2 = "You have not added any violations or issues yet.\n" + 
//					"At least one violation or issue description is required to create a case";
//			Assert.assertEquals(InfoMessage2, InfoMsg2);
			WebElement InfoMessage2 = WebDriverWaits.WaitUntilVisibleWE(InfoMsg2);
			if((InfoMessage2.isDisplayed())==false) {
				Assert.assertEquals(false, true);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	 }
	 
	 
    @Test(priority = 19)
	 public static void TC_CCP_18() {
	      extentTest = extent.startTest(" TC_CCP_18 ");
	 	  extentTest.setDescription(" Verify that appropriate validation message appears when user clicks on 'Create Case' button without adding any violation, on 'Create Case' page. ");
		 try {
			 WebDriverWaits.ClickOn(CCButton);
			Thread.sleep(0000);
//			String ValidMsg2 = WebDriverWaits.GetText(ValidationMsg2);
//			String ValidMsg3 = "At least one violation or issue description is required to create a case";
//			Assert.assertEquals(ValidMsg2, ValidMsg3);
			WebElement ValidMsg2 = WebDriverWaits.WaitUntilVisibleWE(ValidationMsg2);
			if((ValidMsg2.isDisplayed())==false) {
				Assert.assertEquals(false, true);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	 }
    
    
	 @Test(priority = 20)
	 public static void TC_CCP_19() {
	      extentTest = extent.startTest(" TC_CCP_19 ");
	 	  extentTest.setDescription(" Verify that an information message appears on entering non-existing data in 'Find a violation, article number or describe the issue' field, on 'Create Case' page. ");
		 try {
			 Thread.sleep(0000);
			 String RandomReason1 = RandomStrings.RequiredString(10);
			 WebDriverWaits.SendKeys(ViolationSearchBox, RandomReason1);
			 String NoSearchResult = WebDriverWaits.GetText(InfoMsgNoSearch);
			 String InfoMsg = "No matching violations";
			 Assert.assertEquals(NoSearchResult, InfoMsg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
    
	 @Test(priority = 21)
	 public static void TC_CCP_20() {
	      extentTest = extent.startTest(" TC_CCP_20 ");
	 	  extentTest.setDescription(" Verify that 'Custom Issue Description' field gets added after entering data & clicking on 'Add custom issue description' link, on 'Create Case' page. ");
		 try {
			Thread.sleep(0000);
			WebDriverWaits.ClickOn(CustomIssueIcon);
			boolean CustomIssue = driver.findElement(CustomIssueFeild).isDisplayed();
			Assert.assertEquals(CustomIssue, true);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	
	 
	 @Test(priority = 22)
	 public static void TC_CCP_21() {
	     extentTest = extent.startTest(" TC_CCP_21 ");
	 	  extentTest.setDescription(" Verify that appropriate validation message appears when 'Custom Issue Description' field is blank, on 'Create Case' page. ");
		 try {
			Thread.sleep(0000);
			WebDriverWaits.ClickOn(CustomIssueDlt);
			WebDriverWaits.ClickOn(ViolationSearchBox);
			WebDriverWaits.ClickOn(CustomIssueIcon);
		String CustomValidMsg = WebDriverWaits.GetText(ValidMsgCustom);
		String CustValidMsg = "The Custom Issue Description is required.";
		Assert.assertEquals(CustomValidMsg, CustValidMsg);
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 @Test(priority = 23)
	 public static void TC_CCP_22() {
	     extentTest = extent.startTest(" TC_CCP_22 ");
	 	  extentTest.setDescription(" Verify that Violation with no entity gets added under 'Add Violations' tile via search results of 'Find a violation, article number or describe the issue' combo box, on 'Create Case' page. ");
		 try {
			 Thread.sleep(0000);
				WebDriverWaits.ClickOn(CustomIssueDlt);
				WebDriverWaits.ClickOn(ViolationSearchBox);
				WebDriverWaits.SendKeys(ViolationSearchBox, "Wa");
				WebDriverWaits.ClickOn(ViolationList);
		     WebElement WaterVio = WebDriverWaits.WaitUntilVisibleWE(WaterViolation);
					if((WaterVio.isDisplayed())==false) {
						Assert.assertEquals(false, true);
					}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 
	 @Test(priority = 24)
	 public static void TC_CCP_23() {
	     extentTest = extent.startTest(" TC_CCP_23 ");
	 	  extentTest.setDescription(" Verify that '<Violation>' popup opens up for violations with entity, via search results of 'Find a violation, article number or describe the issue' combo box, on 'Create Case' page. ");
		 try {
			 Thread.sleep(0000);
			 WebDriverWaits.ClickOn(ViolationSearchBox);
				WebDriverWaits.SendKeys(ViolationSearchBox, "An");
				WebDriverWaits.ClickOn(ViolationList);
//				 Thread.sleep(2000);
		     List <WebElement> ModalHeaders4 = WebDriverWaits.WaitUntilVisibleList(ModalHeaders);
				if((ModalHeaders4.size()>1)==false) {
					Assert.assertEquals(false, true);
				}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 
	 @Test(priority = 25)
	 public static void TC_CCP_24() {
	     extentTest = extent.startTest(" TC_CCP_24 ");
	 	  extentTest.setDescription(" Verify that appropriate validation message appears when user clicks on 'Add' button, without entering data in the mandatory field, on violation popup. ");
		 try {
			 Thread.sleep(0000);
			 WebDriverWaits.ClickOn(AddButton);
		     WebElement ValidMsgVio = WebDriverWaits.WaitUntilVisibleWE(ValidMsgVioPopup);
			if((ValidMsgVio.isDisplayed())==false) {
				Assert.assertEquals(false, true);
			}	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 //##########
    @Test(priority = 26)
    public void TC_CCP_25()
    {
    	 extentTest = extent.startTest(" TC_CCP_25 ");
         extentTest.setDescription(" Verify that a violation gets added under 'Find a violation, article number or describe the issue' combo box, when user clicks on 'Add' button after entering data in mandatory fields, on 'Create Case' page. ");
 try {
		     String PopupTitle = WebDriverWaits.GetText(ViolationPopup);
		     Thread.sleep(0000);
		     WebDriverWaits.SendKeys(EntityField1, "Black");
			 WebDriverWaits.ClickOn(AddButton);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
       
    }
    
    
	 @Test(priority = 27)
	 public static void TC_CCP_26() {
	     extentTest = extent.startTest(" TC_CCP_26 ");
	 	  extentTest.setDescription(" Verify that user is able to add a violation after selecting an option from 'Find and add existing Entity' combo box, on Violation popup. ");
		 try {
			Thread.sleep(0000);
			WebDriverWaits.ClickOn(ViolationSearchBox);
			WebDriverWaits.SendKeys(ViolationSearchBox, "An");
			WebDriverWaits.ClickOn(ViolationList);
			WebDriverWaits.SendKeys(EntitySearchBox, "Wh");
			WebDriverWaits.ClickOn(EntitySearchList);
			WebDriverWaits.ClickOn(AddButton);
			WebElement VioList = WebDriverWaits.WaitUntilVisibleWE(AddedVioList);
	     if((VioList.isDisplayed())==false) {
				Assert.assertEquals(false, true);
	     }
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 
	 
	 @Test(priority = 28)
	 public static void TC_CCP_27() {
	     extentTest = extent.startTest(" TC_CCP_27 ");
	 	  extentTest.setDescription(" Verify that 'Add Another <Violation>' link appears under each added Violation type, under 'Add Violations' tile, on 'Create Case' page. ");
		 try {
			Thread.sleep(0000);
			WebElement AddAnotherVio1 = WebDriverWaits.WaitUntilVisibleWE(AddAnotherVio);
			if((AddAnotherVio1.isDisplayed())==false)
		     {
				Assert.assertEquals(false, true);
		     }
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 
	 
	 @Test(priority = 29)
	 public static void TC_CCP_28() {
	     extentTest = extent.startTest(" TC_CCP_28 ");
	 	  extentTest.setDescription(" Verify that previously added violation gets deleted, when user clicks on the 'Delete' icon under 'Add Violations' tile, on 'Create Case' page. ");
		 try {
			 List<WebElement> countVio = driver.findElements(CrossIconVio);
			 int CountVio = countVio.size();
			Thread.sleep(0000);
			WebDriverWaits.ClickOn(CrossIconVio);
			List<WebElement> countVio1 = WebDriverWaits.WaitUntilVisibleList(CrossIconVio);
		int NewCountVio = countVio1.size()+1;
		Assert.assertEquals(CountVio, NewCountVio);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	
	 
	 @Test(priority = 30)
	 public static void TC_CCP_29() {
	     extentTest = extent.startTest(" TC_CCP_29 ");
	 	  extentTest.setDescription(" Verify that 'Edit <Violation>' popup opens up, when user clicks on 'Edit' icon under 'Add Violations' tile, on 'Create Case' page. ");
		 try {
			 Thread.sleep(2000);
			WebDriverWaits.ClickOn(EditIconVio);
			Thread.sleep(3000);
		String[] PopupTitle = driver.findElement(ViolationPopup).getText().split(" ");
		Assert.assertEquals(PopupTitle[0], "Edit");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 
	 @Test(priority = 31)
	 public static void TC_CCP_30() {
	     extentTest = extent.startTest(" TC_CCP_30 ");
	 	  extentTest.setDescription(" Verify that a photo gets uploaded, when user selects a photo after clicking on 'Upload' button, on 'Edit <Violation>' popup. ");
		 try {
			Thread.sleep(0000);
			WebDriverWaits.ClickOn(UploadLink);
			Thread.sleep(0000);
		RobotClassUploadMedia.RobotClassUploadMedia("//home//sqe//Downloads//Cat_11zon.jpg");
		Thread.sleep(3000);
		WebDriverWaits.ClickOn(EntityAddBtn);
		WebElement ImageThumb = WebDriverWaits.WaitUntilVisibleWE(UploadedImgThumb);
		if((ImageThumb.isDisplayed())==false) {
			Assert.assertEquals(false, true);
		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (AWTException e) {
			e.printStackTrace();
		} 
	 }
	 
	 
	 
	 @Test(priority = 32)
	 public static void TC_CCP_31() {
	     extentTest = extent.startTest(" TC_CCP_31 ");
	 	  extentTest.setDescription(" Verify that the 'Upload' button converts into 'Replace' button, when user uploads a photo, on 'Edit <Violation>' popup. ");
		 try {
			WebDriverWaits.ClickOn(EditIconVio);
			//document.querySelector('div.file-upload__actions > div > label.file-upload__label')
//			JavascriptExecutor jse2 = (JavascriptExecutor)driver;
//			 Thread.sleep(1000);
//			 WebElement ReplaceLink = (WebElement) jse2.executeScript("return document.querySelector('div.file-upload__actions > div > label.file-upload__label')");
//			 String ReplaceBtn = (ReplaceLink).getText();
			Thread.sleep(5000);
			String ReplaceBtn = WebDriverWaits.GetText(UploadLink2);
			 System.out.println(ReplaceBtn);
			Assert.assertEquals(ReplaceBtn, "Replace");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 
	 @Test(priority = 33)
	 public static void TC_CCP_32() {
	     extentTest = extent.startTest(" TC_CCP_32 ");
	 	  extentTest.setDescription(" Verify that the added photo gets deleted, when user clicks on the 'Delete' icon, on 'Edit <Violation>' popup. ");
		 try {
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(DltUploadedImg);
//			WebElement DeleteImg = WebDriverWaits.WaitUntilVisibleWE(DltUploadedImg);
//			Actions action3 = new Actions(driver);
//			Thread.sleep(4000);
//			action3.moveToElement(DeleteImg).click().build().perform();
//		Thread.sleep(4000);
//		String UploadBtn1 = driver.findElement(UploadLink).getText();
//		Assert.assertEquals(UploadBtn1, "Upload");
//		WebDriverWaits.ClickOn(EntityCancelBtn);	
			WebElement ImgThumb4 = driver.findElement(AddedImgThumb);	
			if((ImgThumb4.isDisplayed())==true) {
				Assert.assertEquals(false, true);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 
	 
//	 @Test(priority = 34)
//	 public static void TC_CCP_33() {
//	     extentTest = extent.startTest(" TC_CCP_33 ");
//	 	  extentTest.setDescription(" Verify that 'Upload a Photo' toggle button is selected by default, on 'Vehicle Control' popup. ");
//		 try {
//			Thread.sleep(30000);				
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	 }
	 
	 
	 @Test(priority = 35)
	 public static void TC_CCP_34() {
	     extentTest = extent.startTest(" TC_CCP_34 ");
	 	  extentTest.setDescription(" Verify that total count along with '<Violation with entity>' count of added violations appear beside 'Add Violations' tile's header, on 'Create Case' page. ");
		 try {
			Thread.sleep(2000);
			String CountVio = WebDriverWaits.GetText(CountViolations);
			List<WebElement> countVio3 = WebDriverWaits.WaitUntilVisibleList(CrossIconVio);
			 int i = countVio3.size();
			 String FinalCount = "Add Violations ("+(i)+")";
			 Assert.assertEquals(CountVio, FinalCount);
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 
	 @Test(priority = 36)
	 public static void TC_CCP_35() {
	     extentTest = extent.startTest(" TC_CCP_35 ");
	 	  extentTest.setDescription(" Verify that respective '<Violation> Listing' popup opens up, when user clicks on '<n> <Violation>' link next to 'Add Violation' tile header, on 'Create Case' page. ");
		 try {
			Thread.sleep(0000);
		WebElement IndiVio = WebDriverWaits.WaitUntilVisibleWE(CountEachVio);
		String[] FirstVio = IndiVio.getText().split(" ");
		String FinalIndiVio = FirstVio[1];
		Thread.sleep(1000);
		WebDriverWaits.ClickOn(CountEachVio);
		Thread.sleep(3000);
		String[] popupVio = WebDriverWaits.GetText(PopupTitle).split(" ");
		String FinalPopupVio = popupVio[0]+"s";
		Assert.assertEquals(FinalIndiVio, FinalPopupVio);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
    
	 @Test(priority = 37)
	 public static void TC_CCP_36() {
	     extentTest = extent.startTest(" TC_CCP_36 ");
	 	  extentTest.setDescription(" Verify that '<Violation> Listing' popup gets closed, when user clicks on 'Cancel' button or 'Cross' icon, on 'Create Case' page. ");
		 try {
			Thread.sleep(0000);
			WebDriverWaits.ClickOn(ClosePopup);
		Thread.sleep(2000);
		List <WebElement> ModalHeaders5 = WebDriverWaits.WaitUntilVisibleList(ModalHeaders);
		if((ModalHeaders5.size()<=1)==false) {
			Assert.assertEquals(false, true);
		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	
//------------------------------------------------------------------- Contacts Tile ---------------------------------------------------------///

	 @Test(priority = 38)
	 public static void TC_CCP_37() {
	     extentTest = extent.startTest(" TC_CCP_37 ");
	 	  extentTest.setDescription(" Verify that 'Create a Contact' popup opens up, when user clicks on 'Add Contact' field > 'Create a new contact' link, on 'Create Case' popup. ");
		 try {
			Thread.sleep(2000);
			WebDriverWaits.ClickOn(AddContactFld);
			WebDriverWaits.ClickOn(CrtNewContact);
			String ContactTitle = WebDriverWaits.GetText(ContactPopup);
			Assert.assertEquals(ContactTitle, "Create a Contact");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 @Test(priority = 39)
	 public static void TC_CCP_38() {
	     extentTest = extent.startTest(" TC_CCP_38 ");
	 	  extentTest.setDescription(" Verify that appropriate validation message appears when 'Create Contact' button is clicked without entering data in the mandatory field, on 'Create a Contact' popup. ");
		 try {
			Thread.sleep(0000);
			WebDriverWaits.ClickOn(CrtContactBtn);
			WebElement ErrMsg = WebDriverWaits.WaitUntilVisibleWE(ContactErrMsg);
			if((ErrMsg.isDisplayed())==false) {
				Assert.assertEquals(false, true);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 @Test(priority = 40)
	 public static void TC_CCP_39() {
	     extentTest = extent.startTest(" TC_CCP_39 ");
	 	  extentTest.setDescription(" Verify that 'Create a Contact' popup gets closed , when user clicks on 'Cancel' button, on 'Create Case' popup. ");
		 try {
			Thread.sleep(1000);
			WebDriverWaits.ClickOn(CancelContactBtn);
			Thread.sleep(1000);
			List <WebElement> ModalHeaders4 = WebDriverWaits.WaitUntilVisibleList(ModalHeaders);
			if((ModalHeaders4.size()<=1)==false) {
				Assert.assertEquals(false, true);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 @Test(priority = 41)
	 public static void TC_CCP_40() {
	     extentTest = extent.startTest(" TC_CCP_40 ");
	 	  extentTest.setDescription(" Verify that new contact gets added under 'Add Contact' combo box, when user clicks on 'Create Contact' button after entering data in 'Name' field, on 'Create a Contact' popup. ");
		 try {
			Thread.sleep(2000);
			List <WebElement> BeforeAdding = driver.findElements(CountContact);
			int a = BeforeAdding.size();
			for(int z=0; z<3;z++) {
			WebDriverWaits.ClickOn(AddContactFld);
			WebDriverWaits.ClickOn(CrtNewContact);
			WebDriverWaits.SendKeys(NameField, ("John"+z));
			WebDriverWaits.ClickOn(CrtContactBtn);
			Thread.sleep(1000);
			List <WebElement> ModalHeaders4 = WebDriverWaits.WaitUntilVisibleList(ModalHeaders);
			if(ModalHeaders4.size()>1) {
				WebDriverWaits.WaitUntilVisible(CreateAnyway);
				WebDriverWaits.ClickOn(CreateAnyway);
			}
			}
			List <WebElement> AfterAdding = WebDriverWaits.WaitUntilVisibleList(CountContact);
			int b = AfterAdding.size();
			if((b>a)==false) {
				Assert.assertEquals(false, true);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 
	 @Test(priority = 43)
	 public static void TC_CCP_42() {
	     extentTest = extent.startTest(" TC_CCP_42 ");
	 	  extentTest.setDescription(" Verify that 'Edit Contact' popup opens up for newly created contact, when user clicks on 'Edit' icon, on 'Create Case' page. ");
		 try {
			Thread.sleep(0000);
			WebDriverWaits.ClickOn(EditContact);
			String ContactEditPopup = WebDriverWaits.GetText(EditContactPopup);
			Assert.assertEquals(ContactEditPopup, "Edit Contact");
			WebDriverWaits.ClickOn(CancelEditPopup);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 @Test(priority = 44)
	 public static void TC_CCP_43() {
	     extentTest = extent.startTest(" TC_CCP_43 ");
	 	  extentTest.setDescription(" Verify that previously added contact gets deleted, when user clicks on the 'Delete' icon, on 'Create Case' page. ");
		 try {
			Thread.sleep(0000);
			List <WebElement> BeforeDeleting = WebDriverWaits.WaitUntilVisibleList(CountContact);
			int a1 = BeforeDeleting.size();
			WebDriverWaits.ClickOn(DeleteContact);
//			Thread.sleep(2000);
			List <WebElement> AfterDeleting = WebDriverWaits.WaitUntilVisibleList(CountContact);
			int b1 = AfterDeleting.size();
			if((b1==(a1-1))==false) {
				Assert.assertEquals(false, true);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 
	 @Test(priority = 45)
	 public static void TC_CCP_44() {
	     extentTest = extent.startTest(" TC_CCP_44 ");
	 	  extentTest.setDescription(" Verify that accurate count of added contacts appear beside 'Contacts' tile's header, on 'Create Case' popup. ");
		 try {
			Thread.sleep(0000);
			String ContactTile = WebDriverWaits.GetText(CountContactTile);
//			Thread.sleep(2000);
			List <WebElement> CountContacts = WebDriverWaits.WaitUntilVisibleList(CountContact);
			int k = CountContacts.size();
			String FinalCountContacts = "Contacts ("+k+")";
			Assert.assertEquals(ContactTile, FinalCountContacts);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 

	 
//------------------------------------------------------------------- Attachments Tile ---------------------------------------------------------///


    	 @Test(priority = 47)
	 public static void TC_CCP_46() {
	     extentTest = extent.startTest(" TC_CCP_46 ");
	 	  extentTest.setDescription(" Verify that 'Add Attachments' popup opens up, when user clicks on the 'Image' icon under 'Attachments' tile, on 'Create Case' page. ");
		 try {
			Thread.sleep(0000);
			WebDriverWaits.ClickOn(ImageIcon);
			String Title = WebDriverWaits.GetText(AttachmentTitle);
						String AttachTitle = "Add Attachments";
						Assert.assertEquals(AttachTitle, Title);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	 }

    	 
    	 
    	 @Test(priority = 48)
    	 public static void TC_CCP_47() {
    	     extentTest = extent.startTest(" TC_CCP_47 ");
    	 	  extentTest.setDescription(" Verify that attachment's preview appears, when user selects an attachment after clicking on 'Browse file' link or 'Camera' button, on 'Add Attachments' popup. ");
    		 try {
    			Thread.sleep(0000);
    			WebDriverWaits.ClickOn(CameraButton);
    			Thread.sleep(1000);
    			RobotClassUploadMedia.RobotClassUploadMedia("//home//sqe//Downloads//Cat_11zon.jpg");
    			Thread.sleep(2000);
    			WebElement ImageThumb = WebDriverWaits.WaitUntilVisibleWE(ImgThumb);
    			if((ImageThumb.isDisplayed())==false) {
    			Assert.assertEquals("Fail", "")   ;	 			
    			}		
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		} catch (AWTException e) {
				e.printStackTrace();
			}
    
    	 }

    	 
    	 
    	 @Test(priority = 49)
    	 public static void TC_CCP_48() {
    	     extentTest = extent.startTest(" TC_CCP_48 ");
    	 	  extentTest.setDescription(" Verify that 'Close Add Attachments' confirmation popup opens up, when user clicks on 'Cross' icon or 'Cancel' button after selecting an attachment, on 'Add Attachments' popup. ");
    		 try {
    		Thread.sleep(1000);
			WebDriverWaits.ClickOn(CrossIcon2);
    		Thread.sleep(1000);
			String PopupTitle2 = WebDriverWaits.GetText(AttachmentTitle);
			String PopupTitle3 = "Close Add Attachments";
			Assert.assertEquals(PopupTitle3, PopupTitle2);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    
    	 }
    	 
    	 
    	 @Test(priority = 50)
    	 public static void TC_CCP_49() {
    	     extentTest = extent.startTest(" TC_CCP_49 ");
    	 	  extentTest.setDescription(" Verify that 'Add Attachments' popup gets closed, when user clicks on 'Yes, Close' button, on 'Close Add Attachment' confirmation popup. ");
    		 try {
    		Thread.sleep(0000);
			WebDriverWaits.ClickOn(YesCloseBtn);
			Thread.sleep(5000);
//			WebElement Tile = driver.findElement(AttachmentTile);
			List <WebElement> ModalHeaders2 = WebDriverWaits.WaitUntilVisibleList(ModalHeaders);
			if((ModalHeaders2.size()<=1)==false) {
				Assert.assertEquals("Fail", "");
			}
			
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    	 }
   	 
    	 
    	 @Test(priority = 51)
    	 public static void TC_CCP_50() {
    	     extentTest = extent.startTest(" TC_CCP_50 ");
    	 	  extentTest.setDescription(" Verify that 'Add Attachments' popup reopens, when user clicks on 'No, Don't Close' button, on 'Close Add Attachment' confirmation popup. ");
//    	 	 TC_CCP_48();
// 			TC_CCP_49();
 			try {
 				WebDriverWaits.ClickOn(ImageIcon);
 				WebDriverWaits.ClickOn(CameraButton);
    			Thread.sleep(1000);
    			RobotClassUploadMedia.RobotClassUploadMedia("//home//sqe//Downloads//Jellyfish_11zon.jpg"); 			
    			Thread.sleep(1000);
    			WebDriverWaits.WaitUntilVisible(CrossIcon2);
    			WebDriverWaits.ClickOn(CrossIcon2);
    			WebDriverWaits.WaitUntilVisible(DontCloseBtn);
    			WebDriverWaits.ClickOn(DontCloseBtn);
    			String Title4 = WebDriverWaits.GetText(AttachmentTitle);
    			String AttachTitle = "Add Attachments";
				Assert.assertEquals(AttachTitle, Title4);		
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		} catch (AWTException e) {
				e.printStackTrace();
			}
    	 }
    	 
    	 
    	 @Test(priority = 52)
    	 public static void TC_CCP_51() {
    	     extentTest = extent.startTest(" TC_CCP_51 ");
    	 	 extentTest.setDescription(" Verify that an attachment gets added under 'Attachments' tile, when user clicks on 'Add' button after selecting an attachment, on 'Add Attachments' popup. ");
    		 try {
    		Thread.sleep(0000);
			WebDriverWaits.ClickOn(AddButton2);
			WebElement AddedImgThumb = WebDriverWaits.WaitUntilVisibleWE(ImgThumb2);
			if((AddedImgThumb.isDisplayed())==false) {
			Assert.assertEquals("Fail", "");}
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    	 }
    	 
    	 
    	 @Test(priority = 53)
    	 public static void TC_CCP_52() {
    	     extentTest = extent.startTest(" TC_CCP_52 ");
    	 	  extentTest.setDescription(" Verify that user is able to add multiple attachments under 'Attachments' tile, on 'Create Case' popup. ");
    		 try {
    			Thread.sleep(0000);
    			WebDriverWaits.ClickOn(ImageIcon);
    			WebDriverWaits.ClickOn(CameraButton);
    			Thread.sleep(1000);
    			RobotClassUploadMedia.RobotClassUploadMedia("//home//sqe//Downloads//Panda_11zon.jpg"); 			
    			Thread.sleep(1000);
    			WebDriverWaits.ClickOn(CameraButton);
    			Thread.sleep(1000);
    			RobotClassUploadMedia.RobotClassUploadMedia("//home//sqe//Downloads//Jellyfish_11zon.jpg"); 			
    			Thread.sleep(1000);
    			WebDriverWaits.ClickOn(AddButton2);
    		 } catch (InterruptedException e) {
    			e.printStackTrace();
    		} catch (AWTException e) {
				e.printStackTrace();
			}
    	 } 	 
    	  
    	 
    	 
    	 @Test(priority = 54)
    	 public static void TC_CCP_53() {
    	     extentTest = extent.startTest(" TC_CCP_53 ");
    	 	  extentTest.setDescription(" Verify that 'Attachments Details' popup opens up, when user clicks on the added attachment, on 'Create Case' popup. ");
    		 try {
    			Thread.sleep(1000);
    			WebDriverWaits.ClickOn(AddedImage);
//    			WebElement AddedImg = WebDriverWaits.WaitUntilVisibleWE(AddedImage);
//    			Actions action4 = new Actions(driver);
//    			Thread.sleep(3000);
//   			action4.moveToElement(AddedImg).click().build().perform();
//    		Thread.sleep(5000);
    		String AttachTitle1 = WebDriverWaits.GetText(AttachmentTitle);
    		String AttachTitle2 = "Attachments Details";
    		Assert.assertEquals(AttachTitle1, AttachTitle2);
    						
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    	 }
    	 
    	 
    	 
    	 @Test(priority = 55)
    	 public static void TC_CCP_54() {
    	     extentTest = extent.startTest(" TC_CCP_54 ");
    	 	  extentTest.setDescription(" Verify that attachment details get updated, when user clicks on 'Update' button, on 'Attachment Details' popup. ");
    		 try {
    			Thread.sleep(0000);
   			 String RandomReason2 = RandomStrings.RequiredString(15);
   			WebDriverWaits.SendKeys(Description, RandomReason2);
   			WebDriverWaits.ClickOn(UpdateBtn);
    		 } catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    	 }
    	 
    	 
    	 
    	 @Test(priority = 56)
    	 public static void TC_CCP_55() {
    	     extentTest = extent.startTest(" TC_CCP_55 ");
    	 	  extentTest.setDescription(" Verify that an attachment gets deleted, when user clicks on 'Update' button after clicking on 'Delete' icon, on 'Attachment Details' popup ");
    		 try {
    			Thread.sleep(2000);
    			List<WebElement> countAttach0 = WebDriverWaits.WaitUntilVisibleList(AddedImage);
   			 int i = countAttach0.size();
       			WebDriverWaits.ClickOn(AddedImage);
       			WebDriverWaits.ClickOn(DeleteAttach);
    			Thread.sleep(1000);
       			WebDriverWaits.ClickOn(YesDelete);
       			WebDriverWaits.ClickOn(UpdateBtn);
       			List<WebElement> countAttach1 = WebDriverWaits.WaitUntilVisibleList(AddedImage);
      			 int j = countAttach1.size();
      			 if((j==(i-1))==false) {
      				 Assert.assertEquals("Fail", "");
      			 }
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    	 }
    	 

    	 
    	 
    	 @Test(priority = 57)
    	 public static void TC_CCP_56() {
    	     extentTest = extent.startTest(" TC_CCP_56 ");
   	 	  extentTest.setDescription(" Verify that accurate count of added attachments appear beside 'Attachments' tile's header, on 'Create Case' popup. ");
    		 try {
    			Thread.sleep(2000);
    		String AttachCount = WebDriverWaits.GetText(CountAttachment);
			List<WebElement> countAttach = WebDriverWaits.WaitUntilVisibleList(AddedImage);
			 int i = countAttach.size();
			 String FinalCount1 = "Attachments ("+(i)+")";
			 Assert.assertEquals(AttachCount, FinalCount1);
			} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    	 }
    	 
    	 
   //------------------------------------------------------------------- Create Case ---------------------------------------------------------///

    	 
//    	 @Test(priority = 50)
//    	 public static void TC_CCP_03() {
//    	     extentTest = extent.startTest("  ");
//    	 	  extentTest.setDescription("  ");
//    		 try {
//    			Thread.sleep(3000);
//    						
//    		} catch (InterruptedException e) {
//    			e.printStackTrace();
//    		}
//    	 }
    	 
//    	 @Test(priority = 50)
//    	 public static void TC_CCP_03() {
//    	     extentTest = extent.startTest("  ");
//    	 	  extentTest.setDescription("  ");
//    		 try {
//    			Thread.sleep(3000);
//    						
//    		} catch (InterruptedException e) {
//    			e.printStackTrace();
//    		}
//    	 }
    	 
//    	 @Test(priority = 50)
//    	 public static void TC_CCP_03() {
//    	     extentTest = extent.startTest("  ");
//    	 	  extentTest.setDescription("  ");
//    		 try {
//    			Thread.sleep(3000);
//    						
//    		} catch (InterruptedException e) {
//    			e.printStackTrace();
//    		}
//    	 }
    	 
//    	 @Test(priority = 50)
//    	 public static void TC_CCP_03() {
//    	     extentTest = extent.startTest("  ");
//    	 	  extentTest.setDescription("  ");
//    		 try {
//    			Thread.sleep(3000);
//    						
//    		} catch (InterruptedException e) {
//    			e.printStackTrace();
//    		}
//    	 }
    	 
		 
}




