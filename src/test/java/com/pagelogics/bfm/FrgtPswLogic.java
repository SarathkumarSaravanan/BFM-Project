package com.pagelogics.bfm;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.base.util.Baseclass;
import com.pagefactory.bfm.FrgtPsw;
import com.pagefactory.bfm.LoginPageLocators;
import com.pagefactory.bfm.ResetPswPage;
import com.pagefactory.bfm.YopMailLocator;

public class FrgtPswLogic extends Baseclass {
public static void frgpsw() throws InterruptedException
{
openbrowser("chrome");
openURL("https://dev.yourchildsday.com/");
winmax();
new LoginPageLocators().getFrgpsw().click();
String dt1=dat();
new FrgtPsw().getEmail().sendKeys("testing092650@yopmail.com");
implicitewait(2000);
new FrgtPsw().getSbmt().click();
String expt="Please click the link in the email we have just sent to reset your password.";
String act=driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/form/div/div/div[1]/div[2]/div[2]/ul/li")).getText();
Assert.assertEquals(expt, act);
System.out.println("Email we have just sent to reset your password successfully");
Thread.sleep(2000);
driver.get("https://yopmail.com/en/");
new YopMailLocator().getUsrname().sendKeys("testing092650@yopmail.com");
new YopMailLocator().getBtn().click();
Thread.sleep(2000);
driver.switchTo().frame("ifmail");
//new YopMailLocator().getCapta().click();
//Thread.sleep(3000);
new YopMailLocator().getReseMyPsw().click();
String parent=driver.getWindowHandle();
Set<String>child=driver.getWindowHandles();
for(String chId:child)
{
	if(!parent.equals(chId))
	{
	driver.switchTo().window(chId);
	}
}
new ResetPswPage().getPsw().sendKeys("Testing@1234");
new ResetPswPage().getCnfirmpsw().sendKeys("Testing@1234");
new ResetPswPage().getSubmitbtn().click();
Thread.sleep(3000);
String exptd="Your password has been reset.";
String actul=driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div/div/div[1]/div[2]/form/div/div[2]/ul/li[1]")).getText();
Assert.assertEquals(exptd, actul);
System.out.println("Password has been reset successfully");
}

}
