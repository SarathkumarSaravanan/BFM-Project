package com.pagelogics.bfm;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.base.util.Baseclass;
import com.pagefactory.bfm.EditParentProf;
import com.pagefactory.bfm.LoginPageLocators;

public class EditPrntProfLogics extends Baseclass {
	public static void editParent()
	{
		
		try {
			openbrowser("chrome");
			winmax();
			openURL("https://dev.yourchildsday.com/");
			String uname=readexcel("C:\\Users\\TSI\\eclipse-workspace\\BFMRegression\\src\\test\\resources\\TestData\\BFM Credential.xlsx", "Sheet1",4,0);
			String psw=readexcel("C:\\Users\\TSI\\eclipse-workspace\\BFMRegression\\src\\test\\resources\\TestData\\BFM Credential.xlsx", "Sheet1",4,1);
			new LoginPageLocators().getEmail().sendKeys(uname);
			new LoginPageLocators().getPsw().sendKeys(psw);
			new LoginPageLocators().getBtn().click();
			implicitewait(20);
			new EditParentProf().getFname().clear();
			new EditParentProf().getFname().sendKeys("Testingtest1");
//			new EditParentProf().getLname().clear();
//			new EditParentProf().getLname().sendKeys("Test1");
//			new EditParentProf().getDob().click();
			new EditParentProf().getDob().sendKeys("27/06/2023");
			new EditParentProf().getCrnNumbr().sendKeys("425817524A");
			implicitewait(20);
			new EditParentProf().getUpdate().click();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
	

}
