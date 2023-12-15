package com.pagelogics.bfm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.base.util.Baseclass;
import com.pagefactory.bfm.EditAdminProf;
import com.pagefactory.bfm.LoginPageLocators;

public class EditAdminLogics extends Baseclass {
public static void editAdmin() throws IOException, InterruptedException
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
new EditAdminProf().getFname().clear();
new EditAdminProf().getFname().sendKeys("Inntech1");
new EditAdminProf().getLname().clear();
new EditAdminProf().getLname().sendKeys("Admin1");
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
WebElement update=driver.findElement(By.xpath("//input[@id='submit']"));
wait.until(ExpectedConditions.elementToBeClickable(update));
jsclick(update);
Thread.sleep(5000);
String actual="Profile Updated Successfully";
String expected=driver.findElement(By.xpath("//div[text()='Profile Updated Successfully']")).getText();
Assert.assertEquals(expected, actual);
System.out.println("Admin Profile Updated Successfully");
}

}
