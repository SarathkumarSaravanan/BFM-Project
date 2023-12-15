package com.pagelogics.bfm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.base.util.Baseclass;
import com.pagefactory.bfm.EditCmpnyAdminProf;
import com.pagefactory.bfm.LoginPageLocators;

public class EditCmpnyAdminLogic extends Baseclass{
public static void editCpnyAdmLogic() throws InterruptedException
{

try {
	openbrowser("chrome");
	openURL("https://dev.yourchildsday.com/");
	String uname = readexcel("C:\\Users\\TSI\\eclipse-workspace\\BFMRegression\\src\\test\\resources\\TestData\\BFM Credential.xlsx", "Sheet1",3,0);
	String psw=readexcel("C:\\Users\\TSI\\eclipse-workspace\\BFMRegression\\src\\test\\resources\\TestData\\BFM Credential.xlsx", "Sheet1",3,1);
	new LoginPageLocators().getEmail().sendKeys(uname);
	new LoginPageLocators().getPsw().sendKeys(psw);
	new LoginPageLocators().getBtn().click();
	implicitewait(20);
	new EditCmpnyAdminProf().getfName().clear();
	new EditCmpnyAdminProf().getfName().sendKeys("Company1");
	Thread.sleep(5000);
	jsclick(new EditCmpnyAdminProf().getUpdatebtn());
	Thread.sleep(5000);
	String expt="Profile Updated Successfully";
	String act=driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
	Assert.assertEquals(expt, act);
	System.out.println("Company Admin Profile Updated Successfully");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}




}
}
