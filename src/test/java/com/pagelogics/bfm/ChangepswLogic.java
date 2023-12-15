package com.pagelogics.bfm;

import org.openqa.selenium.WebElement;

import com.base.util.Baseclass;
import com.pagefactory.bfm.ChangePsw;
import com.pagefactory.bfm.LoginPageLocators;

public class ChangepswLogic extends Baseclass {
public static void chngepswd()
{
openbrowser("chrome");
openURL("https://dev.yourchildsday.com/");
winmax();
new LoginPageLocators().getEmail().sendKeys("TestTe0121@yopmail.com");
new LoginPageLocators().getPsw().sendKeys("Testing@123");
new LoginPageLocators().getBtn().click();
implicitewait(20);
moveToElement(new ChangePsw().getinitial());
new ChangePsw().getChgpsw().click();
new ChangePsw().getOldpsw().sendKeys("Vss@1234");
new ChangePsw().getNewpsw().sendKeys("Testing@123");
new ChangePsw().getCnfpsw().sendKeys("Testing@123");
new ChangePsw().getChgpswd().click();
System.out.println("Change password successfully");

}


}
