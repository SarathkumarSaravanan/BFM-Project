package com.bfm.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class login {
	public static WebDriver driver;
	@Test()
public static void login()
	{
	driver = new ChromeDriver();
	driver.get("https://dev.yourchildsday.com/");
	driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
WebElement usname= driver.findElement(By.xpath("(//input[@data-val='true'])[1]"));
usname.sendKeys("inntechadmin@yourchildsday.com");
WebElement psw=driver.findElement(By.xpath("//input[@id='Password']"));
psw.sendKeys("02xU^lA4e4gz");
WebElement btn=driver.findElement(By.xpath("//input[@type='submit']"));
btn.click();
String actual="My Profile";
WebElement text=driver.findElement(By.xpath("//h2[@class='page-title']"));
String expected=text.getText();
Assert.assertEquals(actual, expected);
System.out.println("Login suceesfully move to home page");
	
}

}
