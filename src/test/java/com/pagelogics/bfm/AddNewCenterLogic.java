package com.pagelogics.bfm;

import java.io.IOException;

import org.openqa.selenium.Keys;

import com.base.util.Baseclass;
import com.pagefactory.bfm.AddNewCentre;
import com.pagefactory.bfm.CenterList;

public class AddNewCenterLogic extends Baseclass{
public static void addNewCenter() throws InterruptedException
{
try {
	LoginPageLogics.login();
	moveToElement(new CenterList().getCentre());
	new CenterList().getCntreList().click();
	new CenterList().getAddNewCenter().click();
	Thread.sleep(5000);
	String dt1=dat();
	new AddNewCentre().getCentreNames().sendKeys("Testing"+dt1+"");
	new AddNewCentre().getSlctCompy().click();
	Thread.sleep(2000);
	new AddNewCentre().getSlctCompy().sendKeys(Keys.DOWN);
	new AddNewCentre().getSlctCntre().sendKeys(Keys.DOWN);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

}
