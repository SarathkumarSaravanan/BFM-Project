package com.pagelogics.bfm;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.util.Baseclass;
import com.pagefactory.bfm.CenterList;
import com.pagefactory.bfm.LoginPageLocators;
import com.pagefactory.bfm.StaffSignIn;

public class StaffSigInLogic extends Baseclass{
@Test
public static void stafSignIn() throws InterruptedException
{
try {
	openbrowser("chrome");
	openURL("https://dev.yourchildsday.com/");
	String uname=readexcel("C:\\Users\\TSI\\eclipse-workspace\\BFMRegression\\src\\test\\resources\\TestData\\BFM Credential.xlsx", "Sheet1",3,0);
	String psw=readexcel("C:\\Users\\TSI\\eclipse-workspace\\BFMRegression\\src\\test\\resources\\TestData\\BFM Credential.xlsx", "Sheet1",3,1);
	new LoginPageLocators().getEmail().sendKeys(uname);
	new LoginPageLocators().getPsw().sendKeys(psw);
	new LoginPageLocators().getBtn().click();
	Thread.sleep(3000);
	moveToElement(new CenterList().getCentre());
	new StaffSignIn().getStafsigin().click();
	new StaffSignIn().getSlcntr().click();
	Thread.sleep(3000);
	List<WebElement>list=driver.findElements(By.xpath(".//li"));
	for(int i=1;i<list.size();i++)
	{
	String data=driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/div/div/div/div/ul/li["+i+"]/span[1]")).getText();
	if(data.equals("Building Futures Montessori - Wavell Heights"))
	{
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/div/div/div/div/ul/li["+i+"]/span[1]")).click();
	break;
	}
	}Thread.sleep(5000);
	WebElement allroom=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div"));
	List<WebElement>rmtype=allroom.findElements(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div"));
	String dt="1 Lillies B";
	for(int i=1;i<rmtype.size();i++)
	{
	String rm=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div["+i+"]/span")).getText();
	if(dt.equals(rm)) {
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div["+i+"]/span")).click();
	break;
	}
	}Thread.sleep(3000);
	WebElement prnname=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div[3]/div/div/div[1]/div/div[2]/button"));
	prnname.click();
	Thread.sleep(3000);
	WebElement prnName1=driver.findElement(By.xpath("(//button[@type='button'])[6]"));
	prnName1.click();
	Thread.sleep(5000);
	System.out.println("Two Staff SignIn Successfully");
	WebElement signout=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div[1]/div/div[2]/button"));
	signout.click();
	Thread.sleep(3000);
	WebElement signout1=driver.findElement(By.xpath("(//button[@type='button'])[3]"));
	signout1.click();
	Thread.sleep(10000);
//	String Stafsigninater=driver.findElement(By.xpath("//span[text()='2']")).getText();
	System.out.println("Two Staff SignOut Successfully");
	
//	List<WebElement>button=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/div/div/div[2]/following::button[@type='button']"));	
//String cldname="Kelsey";
//for(int i=1;i<button.size();i++)
//{
//	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div[3]/div/div/div[2]/div/div[1]/div[2]/div[1]"));
//	
//}
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

}
