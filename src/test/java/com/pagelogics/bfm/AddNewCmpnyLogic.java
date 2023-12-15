package com.pagelogics.bfm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.base.util.Baseclass;
import com.pagefactory.bfm.AddNewCompany;
import com.pagefactory.bfm.LoginPageLocators;

public class AddNewCmpnyLogic extends Baseclass {
public static void addNewCmpy() throws InterruptedException
{
	openbrowser("chrome");
	winmax();
	openURL("https://dev.yourchildsday.com/");
	new LoginPageLocators().getEmail().sendKeys("inntechadmin@yourchildsday.com");
	new LoginPageLocators().getPsw().sendKeys("02xU^lA4e4gz");
	new LoginPageLocators().getBtn().click();
	implicitewait(20);
	moveToElement(new AddNewCompany().getAdm());
	implicitewait(20);
	new AddNewCompany().getCmpy().click();
	implicitewait(20);
	new AddNewCompany().getAsnewcmp().click();
	String dt1=dat();
	implicitewait(20);
	new AddNewCompany().getBusiname().sendKeys("Testing"+dt1+"");
	implicitewait(20);
	new AddNewCompany().getProvEntType().click();
	Thread.sleep(3000);
	new AddNewCompany().getIndigcorp().click();
	String mn=mnth();
	Thread.sleep(3000);
	new AddNewCompany().getAsOfDate().sendKeys(mn);
	new AddNewCompany().getPhoneno().sendKeys("0413757898");
	new AddNewCompany().getMobi().sendKeys("0413253623");
	new AddNewCompany().getEmail().sendKeys("Testing"+dt1+"@yopmail.com");
	jsclick(new AddNewCompany().getSbmt());
	implicitewait(20);
	new AddNewCompany().getYesbtn().click();
	Thread.sleep(5000);
	String expected="Edit Testing"+dt1+"";
	String actual=driver.findElement(By.xpath("//div[text()='Edit Testing"+dt1+"']")).getText();
	Assert.assertEquals(expected, actual);
	System.out.println("New Company Added Successfully");
//	String expected="Add New Company";
//	implicitewait(20);
//	String actual=driver.findElement(By.xpath("//a[contains(text(),'Add New Company')]")).getText();
//	if(actual.equals(expected))
//	{
//		System.out.println("New User Created successfully");
//	}
	
}

}
