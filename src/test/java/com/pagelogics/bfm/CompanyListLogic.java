package com.pagelogics.bfm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.base.util.Baseclass;
import com.pagefactory.bfm.CompanyList;
import com.pagefactory.bfm.LoginPageLocators;

public class CompanyListLogic extends Baseclass {
public static void cmpnyList() throws IOException
{
openbrowser("chrome");
winmax();
openURL("https://dev.yourchildsday.com/");
String uname=readexcel("C:\\Users\\TSI\\eclipse-workspace\\BFMRegression\\src\\test\\resources\\TestData\\BFM Credential.xlsx", "Sheet1",1,0);
String psw=readexcel("C:\\Users\\TSI\\eclipse-workspace\\BFMRegression\\src\\test\\resources\\TestData\\BFM Credential.xlsx", "Sheet1",1,1);
new LoginPageLocators().getEmail().sendKeys(uname);
new LoginPageLocators().getPsw().sendKeys(psw);
new LoginPageLocators().getBtn().click();
implicitewait(20);
moveToElement(new CompanyList().getAdm());
new CompanyList().getCmpy().click();
String expected="ADD NEW COMPANY";
String actual=driver.findElement(By.xpath("//a[contains(text(),'Add New Company')]")).getText();
Assert.assertEquals(expected, actual);
System.out.println("Companies are Listed");

}

}
