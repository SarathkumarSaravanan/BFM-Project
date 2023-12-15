package com.pagelogics.bfm;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.base.util.Baseclass;
import com.pagefactory.bfm.CenterList;
import com.pagefactory.bfm.EditCntr;
import com.pagefactory.bfm.RoomList;

public class RoomListLogic extends Baseclass {
public static void roomlist() throws InterruptedException
{
try {
	LoginPageLogics.login();
	moveToElement(new CenterList().getCentre() );
	new RoomList().getRoomlist().click();
	implicitewait(20);
	new RoomList().getCmpny().click();
	implicitewait(20);
	String cmpname="Building Futures Pty Ltd";
	List<WebElement>list=driver.findElements(By.xpath("/html/body/div[3]/div/div/div[3]/ul/li"));
	for(int i=1;i<=list.size();i++)
	{
	String data	=new RoomList().getCmplist().findElement(By.xpath("/html/body/div[3]/div/div/div[3]/ul/li["+i+"]")).getText();
	if (data.contains(cmpname))
	{
		new RoomList().getCmplist().findElement(By.xpath("/html/body/div[3]/div/div/div[3]/ul/li["+i+"]")).click();
		break;
	}
	}
	Thread.sleep(3000);
	new RoomList().getCentre().click();
	implicitewait(10);
	String cntname="Test Centre 2";	
	List<WebElement>cntlist=driver.findElements(By.xpath("/html/body/div[4]/div/div/div[3]/ul/li"));
	for(int i=1;i<=cntlist.size();i++)
	{
	String data=new RoomList().getCntrList().findElement(By.xpath("/html/body/div[4]/div/div/div[3]/ul/li["+i+"]")).getText();
	if(data.contains(cntname))
	{
		new RoomList().getCntrList().findElement(By.xpath("/html/body/div[4]/div/div/div[3]/ul/li["+i+"]")).click();
		break;
	}
	}
	System.out.println("Enter the Room List successfully");
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

}
