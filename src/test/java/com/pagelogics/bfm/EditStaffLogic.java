package com.pagelogics.bfm;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.util.Baseclass;
import com.pagefactory.bfm.AddNewStaff;
import com.pagefactory.bfm.StaffListLocators;
public class EditStaffLogic extends Baseclass{
public static void editStfLogic() throws InterruptedException
{
	try {
		LoginPageLogics.login();
		new StaffListLocators().getStaf().click();
		new StaffListLocators().getStafList().click();
		Thread.sleep(5000);
		new StaffListLocators().getSlctCmp().click();
		
		WebElement slcCmp=driver.findElement(By.xpath("//span[text()='Building Futures Pty Ltd']"));
		slcCmp.click();
		new StaffListLocators().getSlctCntre().click();
		Thread.sleep(2000);
		WebElement slcCnt=driver.findElement(By.xpath("//span[text()='Building Futures Montessori - Forest Lake']"));
		slcCnt.click();
		Thread.sleep(2000);
		WebElement fname=driver.findElement(By.xpath("//a[contains(@aria-label,'First name filter')]"));
		jsclick(fname);
		WebElement contain=driver.findElement(By.xpath("//input[@title='Value']"));
		contain.sendKeys("Testing102847");
		WebElement filter=driver.findElement(By.xpath("//span[text()='Filter']"));
		filter.click();
		Thread.sleep(3000);
		WebElement slctStaf=driver.findElement(By.xpath("/html/body/div[2]/div/main/div[1]/div/div/div/table/tbody/tr/td[2]"));
		slctStaf.click();
		new AddNewStaff().getFrstName().clear();
		new AddNewStaff().getFrstName().sendKeys("Testing1028471");
		new AddNewStaff().getSvbtn().click();
		new AddNewStaff().getCnfYes().click();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Staff List"));
		String expt="Staff List";
		String title=driver.getTitle();
		Assert.assertEquals(expt, title);
		System.out.println("Record Updated Successfully");
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
