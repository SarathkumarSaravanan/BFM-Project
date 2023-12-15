package com.pageexe.bfm;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pagefactory.bfm.ChildListLocators;
import com.pagelogics.bfm.ChildListLogic;
import com.pagelogics.bfm.LoginPageLogics;

public class ChildListEXE extends ChildListLogic{
public static void childList()
{
try {
	LoginPageLogics.login();
	moveToElement(new ChildListLocators().getChild());
	new ChildListLocators().getChildList().click();
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(new ChildListLocators().getAddNewChile()));
	jsclick(new ChildListLocators().getAddNewChile());
	
} catch (IOException | InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

}
