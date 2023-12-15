package com.pagelogics.bfm;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.base.util.Baseclass;
import com.pagefactory.bfm.AddNewChildLocators;
import com.pagefactory.bfm.ChildListLocators;

public class EdiChildLogics extends Baseclass{
public static void editchld()
{
try {
	LoginPageLogics.login();
	Thread.sleep(3000);
	moveToElement(new ChildListLocators().getChild());
	new ChildListLocators().getChildList().click();
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(new ChildListLocators().getTgglbtn()));
	jsclick(new ChildListLocators().getTgglbtn());
	wait.until(ExpectedConditions.elementToBeClickable(new ChildListLocators().getSrchText()));
	new ChildListLocators().getSrchText().sendKeys("Testing060540");
	WebElement testing=driver.findElement(By.xpath("/html/body/div[2]/div/main/div[1]/div/div/div/table/tbody/tr/td[2]"));
	jsclick(testing);
	wait.until(ExpectedConditions.visibilityOf(new AddNewChildLocators().getFname()));
	new AddNewChildLocators().getFname().clear();
	new AddNewChildLocators().getFname().sendKeys("Testing060540");
	jsclick(new AddNewChildLocators().getSavebtn());
	new AddNewChildLocators().getConYes().click();
	System.out.println("Child Edited Successfullly");
	} catch (IOException | InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

}
