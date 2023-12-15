package com.pagelogics.bfm;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.util.Baseclass;
import com.pagefactory.bfm.AddNewRoom;
import com.pagefactory.bfm.CenterList;
import com.pagefactory.bfm.RoomList;

public class AddNewRoomLogic extends Baseclass{
public static void addNewRoom() throws InterruptedException
{
try {
	LoginPageLogics.login();
	Thread.sleep(5000);
	moveToElement(new CenterList().getCentre() );
	new RoomList().getRoomlist().click();
	jsclick(new AddNewRoom().getAddnewRoom());
	implicitewait(20);
	new AddNewRoom().getCmpanyName().click();
	new AddNewRoom().getCmpanyName().sendKeys(Keys.DOWN);
	new AddNewRoom().getCmpanyName().sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	new AddNewRoom().getCntreName().click();
	Thread.sleep(2000);
	new AddNewRoom().getCntreName().sendKeys(Keys.DOWN);
	new AddNewRoom().getCntreName().sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	String dt1=dat();
	new AddNewRoom().getGrpName().sendKeys("Little Heros"+dt1+"");
	new AddNewRoom().getSessionpDay().click();
	implicitewait(20);
	new AddNewRoom().getLowBond().click();
	implicitewait(20);
	for (int i=1;i<=2;i++)
	{
		new AddNewRoom().getUprAge().click();	
	}
	implicitewait(20);
	for(int i=1;i<=2;i++)
	{
		new AddNewRoom().getChldNo().click();	
	}	
	new AddNewRoom().getRoomVisible().click();
	jsclick(new AddNewRoom().getSavebtn());
	Thread.sleep(5000);
	String expet="ADD NEW ROOM";
	String actul=(new AddNewRoom().getAddnewRoom()).getText();
	Assert.assertEquals(expet, actul);
	System.out.println("New Room Created Successfully");
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

}
