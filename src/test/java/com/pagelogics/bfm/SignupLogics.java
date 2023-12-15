package com.pagelogics.bfm;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.base.util.Baseclass;
import com.pagefactory.bfm.LoginPageLocators;
import com.pagefactory.bfm.SignUp;
import com.pagefactory.bfm.YopMailLocator;

public class SignupLogics extends Baseclass {
public static void signup() throws IOException, InterruptedException
	{
		
		openbrowser("chrome");
		winmax();
		openURL("https://dev.yourchildsday.com/v1/Account/Login");
		new LoginPageLocators().getCretNewAcc().click();
		String dt1=dat();
		Thread.sleep(5000);
		new SignUp().getFname().sendKeys("Testing"+dt1+"");
		new SignUp().getLname().sendKeys("Testing"+dt1+"");
		new SignUp().getEmail().sendKeys("Testing"+dt1+"@yopmail.com");
		new SignUp().getmbNo().sendKeys("9845"+dt1+"");
		new SignUp().getSlctCmpny().click();
		Thread.sleep(3000);
		new SignUp().getSlctCmpny().sendKeys(Keys.DOWN);
//		new SignUp().getSlctCmpny().sendKeys(Keys.DOWN);
		new SignUp().getSlctCmpny().sendKeys(Keys.ENTER);
		implicitewait(20);
		jsclick(new SignUp().getSlctCntr());
		Thread.sleep(3000);
		new SignUp().getSlctCntr().sendKeys(Keys.DOWN);
		new SignUp().getSlctCntr().sendKeys(Keys.ENTER);
		new SignUp().getuName().sendKeys("Test"+dt1+"");
		new SignUp().getPsw().sendKeys("Testing@"+dt1+"");
		new SignUp().getCnfPsw().sendKeys("Testing@"+dt1+"");
		new SignUp().getSbmt().click();
		Thread.sleep(10000);
		String actual="Thank you for registering. Please click the link in the email we have just sent to confirm your details.";
		String expected=driver.findElement(By.xpath("//*[text()='Thank you for registering. Please click the link in the email we have just sent to confirm your details.']")).getText();
		Assert.assertEquals(actual, expected);
		System.out.println("New User Created successfully");
		
		openURL("https://yopmail.com/en/");
		new YopMailLocator().getUsrname().sendKeys("Testing"+dt1+"@yopmail.com");
		new YopMailLocator().getBtn().click();
		Thread.sleep(5000);
		driver.switchTo().frame("ifmail");
		new YopMailLocator().getCnfrmEmailAdd().click();
		Thread.sleep(2000);
	String parent=driver.getWindowHandle();
	Set<String>child=driver.getWindowHandles();
	for(String chId:child)
	{
		if(!parent.equals(chId))
		{
		driver.switchTo().window(chId);
		}
	}
		String exptd="Thanks for confirming your email address.";
		String actl=driver.findElement(By.xpath("//p[text()='Thanks for confirming your email address.']")).getText();
		Assert.assertEquals(exptd, actl);
		System.out.println("Email verified successfully");
		

	}

}
