package com.pagelogics.bfm;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.util.Baseclass;
import com.pagefactory.bfm.CenterList;
import com.pagefactory.bfm.StaffListLocators;

public class StaffListLogics extends Baseclass {
public static void staflist() throws InterruptedException
{
try {
	LoginPageLogics.login();	
	moveToElement(new StaffListLocators().getStaf());
	new StaffListLocators().getStafList().click();
	Thread.sleep(3000);
	new StaffListLocators().getSlctCmp().click();
	Thread.sleep(2000);
	new StaffListLocators().getSlctCmp().sendKeys(Keys.DOWN);
	new StaffListLocators().getSlctCmp().sendKeys(Keys.DOWN);
	new StaffListLocators().getSlctCmp().sendKeys(Keys.ENTER);
	new StaffListLocators().getSlctCntre().click();
	Thread.sleep(2000);
	new StaffListLocators().getSlctCntre().sendKeys(Keys.DOWN);
	new StaffListLocators().getSlctCntre().sendKeys(Keys.ENTER);
	close();
	} catch (IOException e) {
	
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
	
	

}
