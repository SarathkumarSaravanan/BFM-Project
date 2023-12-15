package com.pagelogics.bfm;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.base.util.Baseclass;
import com.pagefactory.bfm.CenterList;
import com.pagefactory.bfm.EditCntr;

public class EditCenterLogic extends Baseclass {
public static void editcntrelogic() throws InterruptedException
{
try {
	LoginPageLogics.login();
	moveToElement(new CenterList().getCentre());
	new CenterList().getCntreList().click();
	Thread.sleep(5000);
	WebElement tab=driver.findElement(By.xpath("//*[@id=\"CentreGrid\"]/table"));
	List<WebElement>row=tab.findElements(By.tagName("tr"));
//	System.out.println(row.size());
	for(int i=1;i<=row.size()-1;i++)
	{
	String data=tab.findElement(By.xpath("/html/body/div[2]/div/main/div[1]/div/div/div/table/tbody/tr["+i+"]/td[1]")).getText();	
	if(data.equals("Test"))
	{
WebElement rw=	driver.findElement(By.xpath("/html/body/div[2]/div/main/div[1]/div/div/div/table/tbody/tr["+i+"]"));
WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
wait.until(ExpectedConditions.elementToBeClickable(rw));
rw.click();
break;
	}
	
	
//	else if(data!="Test")
//	{
//	driver.findElement(By.xpath("//a[@title='Go to the next page']")).click();
//	for(int j=1;j<=row.size()-1;j++)
//	{
//	String data2=driver.findElement(By.xpath("/html/body/div[2]/div/main/div[1]/div/div/div/table/tbody/tr["+j+"]/td[1]")).getText();
//	if(data2.equals("Test"))
//	{
//	WebElement tbrow=driver.findElement(By.xpath("/html/body/div[2]/div/main/div[1]/div/div/div/table/tbody/tr["+j+"]"));
//	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
//	wait.until(ExpectedConditions.elementToBeClickable(tbrow));
//	tbrow.click();
//	break;
//	}
//	}
//	}
	}
	Thread.sleep(2000);
	new EditCntr().getCenterName().clear();
	new EditCntr().getCenterName().sendKeys("Test1");
	new EditCntr().getUpdat().click();
	new EditCntr().getYes().click();
	String expected="ADD NEW CENTRE";
	String actual =driver.findElement(By.xpath("//a[contains(text(),'Add New Centre')]")).getText();
	Assert.assertEquals(expected, actual);
	System.out.println("Center Edited Successfully");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

}
