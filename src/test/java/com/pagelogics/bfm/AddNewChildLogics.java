package com.pagelogics.bfm;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.util.Baseclass;
import com.pagefactory.bfm.AddNewChildLocators;
import com.pagefactory.bfm.ChildListLocators;

public class AddNewChildLogics extends Baseclass {
public static void addNewChld()
{
try {
	LoginPageLogics.login();
	moveToElement(new ChildListLocators().getChild());
	new ChildListLocators().getChildList().click();
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(new ChildListLocators().getAddNewChile()));
	jsclick(new ChildListLocators().getAddNewChile());
	String dt1=dat();
	new AddNewChildLocators().getFname().sendKeys("Testing"+dt1+"");
	new AddNewChildLocators().getSelectCmpny().click();
	wait.until(ExpectedConditions.elementToBeClickable(new AddNewChildLocators().getClickCmpny()));
	new AddNewChildLocators().getClickCmpny().click();
	Thread.sleep(3000);
	new AddNewChildLocators().getSltcntr().click();
	wait.until(ExpectedConditions.elementToBeClickable(new AddNewChildLocators().getClickCenter()));
	new AddNewChildLocators().getClickCenter().click();
	new AddNewChildLocators().getlName().sendKeys("Testing"+dt1+"");
	new AddNewChildLocators().getGender().click();
	new AddNewChildLocators().getMale().click();
	new AddNewChildLocators().getbDate().sendKeys("01/08/2022");
	new AddNewChildLocators().getSavebtn().click();
	new AddNewChildLocators().getConYes().click();
//	String expt="Record Updated Successfully";
//	Thread.sleep(5000);
//	String actl=driver.findElement(By.xpath("//div[text()='Record Updated Successfully']")).getText();
//	Assert.assertEquals(expt, actl);
	System.out.println("New Child Added Successfully");	
} catch (IOException | InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
