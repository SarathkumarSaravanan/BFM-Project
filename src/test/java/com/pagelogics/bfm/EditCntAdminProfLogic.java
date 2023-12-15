package com.pagelogics.bfm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.base.util.Baseclass;
import com.pagefactory.bfm.EditCntAdminProf;
import com.pagefactory.bfm.LoginPageLocators;

public class EditCntAdminProfLogic extends Baseclass {
public static void editcntprof() throws InterruptedException
{
try {
	openbrowser("chrome");
	winmax();
	openURL("https://dev.yourchildsday.com/v1/Account/Login");
	String uname = readexcel("C:\\Users\\TSI\\eclipse-workspace\\BFMRegression\\src\\test\\resources\\TestData\\BFM Credential.xlsx", "Sheet1",5,0);
	String psw=readexcel("C:\\Users\\TSI\\eclipse-workspace\\BFMRegression\\src\\test\\resources\\TestData\\BFM Credential.xlsx", "Sheet1",5,1);
	new LoginPageLocators().getEmail().sendKeys(uname);
	new LoginPageLocators().getPsw().sendKeys(psw);
	new LoginPageLocators().getBtn().click();
	Thread.sleep(2000);
	new EditCntAdminProf().getFname().clear();
	new EditCntAdminProf().getFname().sendKeys("centre1");
	Thread.sleep(4000);
	jsclick(new EditCntAdminProf().getUpdatbtn());
	Thread.sleep(5000);
	String expted="Profile Updated Successfully";
	String actl=driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
	Assert.assertEquals(expted, actl);
	System.out.println("Center Admin Profile Updated Successfully");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}

}
