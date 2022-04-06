package com.ComCate.CommonMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class RobotClassUploadMedia {
	public static String RobotClassUploadMedia(String Path) throws AWTException {
			Robot rb = new Robot();
		StringSelection str = new StringSelection(Path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		 rb.keyPress(KeyEvent.VK_CONTROL);
		 rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		return Path;
	}

}















//Thread.sleep(4000);
//Robot rb = new Robot();
//Thread.sleep(8000);
//StringSelection str = new StringSelection(Path);
//Thread.sleep(4000);
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//Thread.sleep(3000);
//rb.keyPress(KeyEvent.VK_CONTROL);
//Thread.sleep(3000);
//rb.keyPress(KeyEvent.VK_V);
//Thread.sleep(3000);
//rb.keyRelease(KeyEvent.VK_CONTROL);
//Thread.sleep(3000);
//rb.keyRelease(KeyEvent.VK_V);
//Thread.sleep(3000);
//rb.keyPress(KeyEvent.VK_ENTER);
//Thread.sleep(3000);
//rb.keyRelease(KeyEvent.VK_ENTER);
//return Path;