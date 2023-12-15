package com.pagelogics.bfm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.util.Baseclass;
import com.pagefactory.bfm.AddNewStaff;
import com.pagefactory.bfm.StaffListLocators;

public class AddNewStaffLogics extends Baseclass{
public static void addNewStf() throws InterruptedException
{
try {
	LoginPageLogics.login();
	moveToElement(new StaffListLocators().getStaf());
	new StaffListLocators().getStafList().click();
	implicitewait(20);
	jsclick(new StaffListLocators().getAddNewStf());
	Thread.sleep(3000);
	String dt1=dat();
	new AddNewStaff().getFrstName().sendKeys("Testing"+dt1+"");
	new AddNewStaff().getLstName().sendKeys("Test"+dt1+"");
	jsclick(new AddNewStaff().getCmpName());
	Thread.sleep(2000);
	WebElement cmp=driver.findElement(By.xpath("//span[text()='Building Futures Pty Ltd']"));
	cmp.click();
	implicitewait(20);
	jsclick(new AddNewStaff().getCntrName());
	Thread.sleep(2000);
	WebElement cntr=driver.findElement(By.xpath("//span[text()='Building Futures Montessori - Forest Lake']"));
	jsclick(cntr);
	new AddNewStaff().getEmpType().click();
	Thread.sleep(3000);
	WebElement empType=driver.findElement(By.xpath("//span[text()='Full Time']"));
	empType.click();
	new AddNewStaff().getSecAccesLvl().click();
	Thread.sleep(2000);
	WebElement roomDatCentre=driver.findElement(By.xpath("//span[text()='Room Data Creator']"));
	roomDatCentre.click();
	new AddNewStaff().getPosition().click();
	Thread.sleep(2000);
	WebElement assis=driver.findElement(By.xpath("//span[text()='Assistant']"));
	assis.click();
	new AddNewStaff().getCrntRoom().click();
	Thread.sleep(2000);
	WebElement lilbab=driver.findElement(By.xpath("//span[text()='1 Lilies Baby']"));
	lilbab.click();
	jsclick(new AddNewStaff().getSvbtn());
	new AddNewStaff().getCnfYes().click();
	Thread.sleep(10000);
	String exp="ADD NEW STAFF";
	String actual=new StaffListLocators().getAddNewStf().getText();
	Assert.assertEquals(exp, actual);
	System.out.println("New Staff Added Successfully");
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
	

}
