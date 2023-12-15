package com.pagelogics.bfm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.base.util.Baseclass;
import com.pagefactory.bfm.EditGroupAdminProf;
import com.pagefactory.bfm.LoginPageLocators;

public class EditGroupAdminProfLogic extends  Baseclass {
public static void editGrpAdminProf() throws InterruptedException
{

try {
	openbrowser("chrome");
	winmax();
	openURL("https://dev.yourchildsday.com/v1/Account/Login");
	String uname=readexcel("C:\\Users\\TSI\\eclipse-workspace\\BFMRegression\\src\\test\\resources\\TestData\\BFM Credential.xlsx", "Sheet1",2,0);
	String psw=readexcel("C:\\Users\\TSI\\eclipse-workspace\\BFMRegression\\src\\test\\resources\\TestData\\BFM Credential.xlsx", "Sheet1",2,1);
	new LoginPageLocators().getEmail().sendKeys(uname);
	new LoginPageLocators().getPsw().sendKeys(psw);
	new LoginPageLocators().getBtn().click();
	implicitewait(20);
	new EditGroupAdminProf().getFname().clear();
	new EditGroupAdminProf().getFname().sendKeys("Group1");
	Thread.sleep(2000);
	jsclick(new EditGroupAdminProf().getUpdate());
	Thread.sleep(5000);
	String expt="Profile Updated Successfully";
	String actul=driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
	Assert.assertEquals(expt, actul);
	System.out.println("Profile Updated Successfully");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
	

}
