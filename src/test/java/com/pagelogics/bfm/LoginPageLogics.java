package com.pagelogics.bfm;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.base.util.Baseclass;
import com.pagefactory.bfm.LoginPageLocators;

public class LoginPageLogics extends Baseclass {
public static void login() throws IOException, InterruptedException
{
	createTest("C-1_Sign In");
	openbrowser("chrome");
	teststatus("pass", "chrome browser opened");
	winmax();
	teststatus("pass", "window maximized");
	openURL("https://dev.yourchildsday.com/authentication/");
	teststatus("pass", "ycd url launched successfully");
	String uname=readexcel("C:\\Users\\TSI\\eclipse-workspace\\BFMRegression\\src\\test\\resources\\TestData\\BFM Credential.xlsx", "Sheet1",1,0);
	teststatus("pass", "read username from excel");
	String psw=readexcel("C:\\Users\\TSI\\eclipse-workspace\\BFMRegression\\src\\test\\resources\\TestData\\BFM Credential.xlsx", "Sheet1",1,1);
	teststatus("pass", "read password from excel");
	new LoginPageLocators().getEmail().sendKeys(uname);
	teststatus("pass", "username entered successfully");
	new LoginPageLocators().getPsw().sendKeys(psw);
	teststatus("pass", "password entered successfully");
	new LoginPageLocators().getBtn().click();
//	Thread.sleep(2000);
//	selectbyname(new LoginPageLocators().getSlctSite(), "Development");
//	new LoginPageLocators().getOkBtn();
	teststatus("pass", "login button clicked successfully");
	implicitewait(20);
	String expected="Child";
	String actual=driver.findElement(By.xpath("(//a[@id='hideclass'])[1]")).getText();
	if(actual.equals(expected))
	{
		teststatus("pass", "login successfully");
		System.out.println("Login successfully");
	}else
	{
		teststatus("fail", "login are not successfully");
	}
	stop();
	}

}
