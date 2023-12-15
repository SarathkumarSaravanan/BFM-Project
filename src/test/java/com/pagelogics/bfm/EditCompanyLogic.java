package com.pagelogics.bfm;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.util.Baseclass;
import com.pagefactory.bfm.CompanyList;
import com.pagefactory.bfm.EditCmpGeneral;

public class EditCompanyLogic extends Baseclass {
public static void editcmpny() throws InterruptedException, IOException
{

	LoginPageLogics.login();
	moveToElement(new CompanyList().getAdm());
	new CompanyList().getCmpy().click();
	Thread.sleep(5000);
	WebElement tbl=driver.findElement(By.xpath("//table[@role='grid']"));
	List<WebElement>tablerow=tbl.findElements(By.xpath(".//tr"));
	System.out.println(tablerow.size());
	String newcmp="cafeshop";
	for(int j=1;j<=3;j++)
	{
	for(int i=1;i<=tablerow.size()-1;i++)
	{
	String data=driver.findElement(By.xpath("//*[@id=\"CompaniesGrid\"]/table/tbody/tr["+i+"]/td[1]")).getText();
	System.out.println(i);
	System.out.println(data);
	if(data.contains(newcmp))
	{
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"CompaniesGrid\"]/table/tbody/tr["+i+"]/td[1]")).click();
	break;
	}
	else if (i==tablerow.size()-1) {
		jsclick(new EditCmpGeneral().getNxtPage());
		Thread.sleep(3000);
	}
	}
	}
	Thread.sleep(2000);
	new EditCmpGeneral().getbusiName().clear();
	new EditCmpGeneral().getbusiName().sendKeys("QA Company1");
	new EditCmpGeneral().getUpdtCpny().click();
	new EditCmpGeneral().getYesbtn().click();
	Thread.sleep(5000);
	String Expected="Record saved Successfully";
	String Actual=driver.findElement(By.xpath("//div[text()='Record saved Successfully']")).getText();
	Assert.assertEquals(Expected, Actual);
	System.out.println("Company details edited successfully");
	}}
	
