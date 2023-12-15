package com.pagelogics.bfm;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.base.util.Baseclass;
import com.pagefactory.bfm.AddNewPrnt;
import com.pagefactory.bfm.ParentList;

public class AddNewPrntLogics extends Baseclass {
public static void addnewparent()
{
try {
	LoginPageLogics.login();
	moveToElement(new ParentList().getPrnt());
	new ParentList().getPrntList().click();
	new ParentList().getAddNewPrnt().click();
	String dt1=dat();
	new AddNewPrnt().getFname().sendKeys("Test"+dt1+"");
	new AddNewPrnt().getLname().sendKeys("Testing"+dt1+"");
	new AddNewPrnt().getSignInpin().sendKeys("12345");
	new AddNewPrnt().getEmail().sendKeys("Testing"+dt1+"@yopmail.com");
	new AddNewPrnt().getSlctCenter().click();
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(new AddNewPrnt().getClickCenter()));
	new AddNewPrnt().getClickCenter().click();
	new AddNewPrnt().getSavebtn().click();
	wait.until(ExpectedConditions.elementToBeClickable(new AddNewPrnt().getCnfyesbtn()));
	new AddNewPrnt().getCnfyesbtn().click();
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast-message']"))));
	String expt="Record Updated Successfully";
	String tstmsg=driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
	Assert.assertEquals(expt, tstmsg);
	System.out.println("New Parent Created Successfully");
	} catch (IOException | InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}


}
