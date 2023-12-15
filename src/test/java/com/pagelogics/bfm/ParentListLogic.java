package com.pagelogics.bfm;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.base.util.Baseclass;
import com.pagefactory.bfm.ParentList;

public class ParentListLogic extends Baseclass {
public static void prntlist() throws InterruptedException
{
try {
	LoginPageLogics.login();
	moveToElement(new ParentList().getPrnt());
	new ParentList().getPrntList().click();
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(new ParentList().getCrntBtn()));
	jsclick(new ParentList().getCrntBtn());
	new ParentList().getSltCmpny().click();
	wait.until(ExpectedConditions.elementToBeClickable(new ParentList().getClickCmpny()));
	new ParentList().getClickCmpny().click();
	wait.until(ExpectedConditions.elementToBeClickable(new ParentList().getSltCnter()));
	jsclick(new ParentList().getSltCnter());
	Thread.sleep(3000);
	new ParentList().getClickCnter().click();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

}
