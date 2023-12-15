package com.pagelogics.bfm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.util.Baseclass;
import com.pagefactory.bfm.AddNewPrnt;
import com.pagefactory.bfm.ParentList;

public class EditPrnt extends Baseclass{
public static void edtParent()
{
try {
	LoginPageLogics.login();
	moveToElement(new ParentList().getPrnt());
	new ParentList().getPrntList().click();
	new ParentList().getSrchText().sendKeys("test100");
	new ParentList().getSrchText().sendKeys(Keys.ENTER);
	Thread.sleep(5000);
	WebElement table=driver.findElement(By.xpath("//table[@role='treegrid']"));
	WebElement ele=table.findElement(By.xpath("/html/body/div[2]/div/main/div[2]/div/div/div/table/tbody/tr"));
	ele.click();
	new AddNewPrnt().getFname().clear();
	new AddNewPrnt().getFname().sendKeys("SqlV11");
	new AddNewPrnt().getSavebtn().click();
	new AddNewPrnt().getCnfyesbtn().click();
	String Expectexd="Record Updated Successfully";
	String actl=driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
	Assert.assertEquals(Expectexd, actl);
	System.out.println("Record Updated Successfully");
	} catch (IOException | InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

}
