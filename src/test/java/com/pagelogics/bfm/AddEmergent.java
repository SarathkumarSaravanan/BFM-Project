package com.pagelogics.bfm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.base.util.Baseclass;
import com.pagefactory.bfm.ChildListLocators;
import com.pagefactory.bfm.DailyTaskLocators;

public class AddEmergent extends Baseclass {
	public static WebDriverWait wait;
	public static String dt1=dat();
	public StringSelection ss;
	@Test
	public static void lgnLogic()
	{
		
		try {
			LoginPageLogics.login();
			moveToElement(new ChildListLocators().getChild());
			implicitewait(10);
			click(new DailyTaskLocators().getDailytsk());
			click(new DailyTaskLocators().getPreschool());
			for(int i=0;i<30;i++)
			{System.out.println(i);
//				Thread.sleep(2000);
			
			wait =new WebDriverWait(driver,Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOf(new DailyTaskLocators().getActivities()));//elementToBeClickable(new DailyTaskLocators().getActivities()));//());
			click(new DailyTaskLocators().getActivities());
			click(new DailyTaskLocators().getAddActivitiesBtn());
//			click(new DailyTaskLocators().getAddMontessori());
			click(new DailyTaskLocators().getAddEmergent());
//			click(new DailyTaskLocators().getAddImplementedBy());
//			click(new DailyTaskLocators().getSlctStaffBtn());
			click(new DailyTaskLocators().getSlctChild());
			click(new DailyTaskLocators().getSltOther());
			click(new DailyTaskLocators().getAddPlunket());
			click(new DailyTaskLocators().getSveChild());
			new WebDriverWait(driver,Duration.ofSeconds(2));
			wait.until(ExpectedConditions.visibilityOf(new DailyTaskLocators().getAddActivity()));
			click(new DailyTaskLocators().getAddActivity());
			new WebDriverWait(driver,Duration.ofSeconds(1));
			wait.until(ExpectedConditions.visibilityOf(new DailyTaskLocators().getAddCultural()));
			click(new DailyTaskLocators().getAddCultural());
			new WebDriverWait(driver,Duration.ofSeconds(1));
			wait.until(ExpectedConditions.visibilityOf(new DailyTaskLocators().getAddAstronomy()));
			click(new DailyTaskLocators().getAddAstronomy());
			new WebDriverWait(driver,Duration.ofSeconds(1));
			wait.until(ExpectedConditions.visibilityOf(new DailyTaskLocators().getSlctSolarCards()));
			click(new DailyTaskLocators().getSlctSolarCards());
//			Thread.sleep(1000);
//			click(new DailyTaskLocators().getSaveActivitybtn());
			new WebDriverWait(driver,Duration.ofSeconds(2));
			wait.until(ExpectedConditions.elementToBeClickable(new DailyTaskLocators().getSlctFile()));
//			click(new DailyTaskLocators().getSlctActivityLvl());
			click(new DailyTaskLocators().getSlctFile());
			try {
				Robot rbt = new Robot();
				rbt.delay(2000);
				StringSelection st = new StringSelection("C:\\Users\\TSI\\Downloads\\Sample Images\\For Automation\\file_example_JPG_2500kB.jpg");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st,null);
//				StringSelection st2 = new StringSelection("C:\\Users\\TSI\\Downloads\\Sample Images\\For Automation\\Sample-jpg-image-15mb - Copy (3).jpeg");
//				StringSelection st3 = new StringSelection("C:\\Users\\TSI\\Downloads\\Sample Images\\For Automation\\Sample-png-image-5mb - Copy.png");
				
//				
//				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st2,null);
//				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st3,null);
			    rbt.keyPress(KeyEvent.VK_CONTROL);
				rbt.keyPress(KeyEvent.VK_V);
				rbt.keyPress(KeyEvent.VK_CONTROL);
				rbt.keyPress(KeyEvent.VK_ENTER);
				rbt.keyRelease(KeyEvent.VK_ENTER);
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread.sleep(13000);
//			new WebDriverWait(driver,Duration.ofSeconds(20));
//			wait.until(ExpectedConditions.elementToBeClickable(new DailyTaskLocators().getSlctFile()));
			click(new DailyTaskLocators().getSlctFile());
			Robot rbt1;
			try {
				rbt1 = new Robot();
				rbt1.delay(2000);
				StringSelection st1 = new StringSelection("C:\\Users\\TSI\\Downloads\\Sample Images\\For Automation\\Sample-jpg-image-5mb.jpg");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st1,null);
				 rbt1.keyPress(KeyEvent.VK_CONTROL);
					rbt1.keyPress(KeyEvent.VK_V);
					rbt1.keyPress(KeyEvent.VK_CONTROL);
					rbt1.keyPress(KeyEvent.VK_ENTER);
					rbt1.keyRelease(KeyEvent.VK_ENTER);
					} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread.sleep(13000);
//			new WebDriverWait(driver,Duration.ofSeconds(12));
//			wait.until(ExpectedConditions.elementToBeClickable(new DailyTaskLocators().getSlctFile()));
			click(new DailyTaskLocators().getSlctFile());
			Robot rbt2;
			try {
				rbt2 = new Robot();
				rbt2.delay(2000);
				StringSelection st2 = new StringSelection("C:\\Users\\TSI\\Downloads\\Sample Images\\For Automation\\Sample-png-image-5mb.png");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st2,null);
				 rbt2.keyPress(KeyEvent.VK_CONTROL);
				 rbt2.keyPress(KeyEvent.VK_V);
				 rbt2.keyPress(KeyEvent.VK_CONTROL);
				 rbt2.keyPress(KeyEvent.VK_ENTER);
				 rbt2.keyRelease(KeyEvent.VK_ENTER);
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			new WebDriverWait(driver,Duration.ofSeconds(12));
//			wait.until(ExpectedConditions.elementToBeClickable(new DailyTaskLocators().getMainSave()));
			Thread.sleep(10000);
//			for Four Images to upload
			//			click(new DailyTaskLocators().getSlctFile());
//			Robot rbt3;
//			
//				try {
//					rbt3 = new Robot();
//					rbt3.delay(2000);
//					StringSelection st3 = new StringSelection("C:\\Users\\TSI\\Downloads\\Sample Images\\For Automation\\Sample-jpg-image-15mb - Copy (2).jpeg");
//					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st3,null);
//					 rbt3.keyPress(KeyEvent.VK_CONTROL);
//					 rbt3.keyPress(KeyEvent.VK_V);
//					 rbt3.keyPress(KeyEvent.VK_CONTROL);
//					 rbt3.keyPress(KeyEvent.VK_ENTER);
//					 rbt3.keyRelease(KeyEvent.VK_ENTER);
//				} catch (AWTException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				
//			new DailyTaskLocators().getAddcmtTxt().sendKeys("Testing"+dt1+"");
//			new DailyTaskLocators().getInternalNote().sendKeys("Testing"+dt1+"");
//			click(new DailyTaskLocators().getSelectChild());
//			click(new DailyTaskLocators().getChildSave());
			click(new DailyTaskLocators().getMainSave());
			
			}
			
			} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		
	}}
