package com.pagelogics.bfm;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.base.util.Baseclass;
import com.pagefactory.bfm.ChildListLocators;

public class ChildListLogic extends Baseclass{
public static void chldlst()
{
	try {
		LoginPageLogics.login();
		moveToElement(new ChildListLocators().getChild());
		new ChildListLocators().getChildList().click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(new ChildListLocators().getSelectcmpny()));
		jsclick(new ChildListLocators().getSelectcmpny());
		new ChildListLocators().getClickCompany().click();
		wait.until(ExpectedConditions.elementToBeClickable(new ChildListLocators().getSelectcntr()));
		jsclick(new ChildListLocators().getSelectcntr());
		wait.until(ExpectedConditions.elementToBeClickable(new ChildListLocators().getClickCenter()));
		jsclick(new ChildListLocators().getClickCenter());
		wait.until(ExpectedConditions.elementToBeClickable(new ChildListLocators().getTgglbtn()));
		jsclick(new ChildListLocators().getTgglbtn());
		implicitewait(20);
		new ChildListLocators().getSrchText().sendKeys("Test");
		new ChildListLocators().getSrchText().sendKeys(Keys.ENTER);
		System.out.println("Child are listed and Search function works properly");
	} catch (IOException | InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
