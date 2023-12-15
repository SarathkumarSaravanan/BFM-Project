package com.pagelogics.bfm;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.util.Baseclass;
import com.pagefactory.bfm.AddNewRoom;
import com.pagefactory.bfm.CenterList;
import com.pagefactory.bfm.LoginPageLocators;
import com.pagefactory.bfm.RoomList;

public class EditRoomLogics extends Baseclass{
public static void editroomLogic() throws InterruptedException
{
	try {
		LoginPageLogics.login();
		moveToElement(new CenterList().getCentre());
		new RoomList().getRoomlist().click();
		WebElement table=driver.findElement(By.xpath("//table[@class='k-selectable']"));
		List<WebElement>row=table.findElements(By.xpath(".//tr"));
		String roomname="6 School CH";
		List<WebElement>nexpage=driver.findElements(By.xpath("/html/body/div[2]/div/main/div[1]/div/div/div/div[2]/a"));
		for(int j=1;j<=nexpage.size();j++)
		{
		for(int i=1;i<=row.size();i++)
		{
		String data = driver.findElement(By.xpath("/html/body/div[2]/div/main/div[1]/div/div/div/table/tbody/tr["+i+"]/td[3]")).getText();
		if(data.contains(roomname))
			{
			WebElement slctroom=table.findElement(By.xpath("/html/body/div[2]/div/main/div[1]/div/div/div/table/tbody/tr["+i+"]/td[3]"));
			Thread.sleep(2000);
			slctroom.click();
			break;
			}else if(i==20)
			{
				Thread.sleep(2000);
				WebElement nxtpage=driver.findElement(By.xpath("//a[@title='Go to the next page']"));
				jsclick(nxtpage);
				}
		}String data="Edit Room";
		if(data.equals(driver.findElement(By.xpath("//h1[contains(text(),'Edit Room')]")).getText()))
		{
		break;
		}			
		}
		Thread.sleep(2000);
		new AddNewRoom().getGrpName().clear();
		new AddNewRoom().getGrpName().sendKeys("6 School CH1");
		jsclick(new AddNewRoom().getSavebtn());
		System.out.println("Room Edited succesfully");
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
