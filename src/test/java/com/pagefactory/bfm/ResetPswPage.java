package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class ResetPswPage extends Baseclass{
public ResetPswPage()
{
PageFactory.initElements(driver, this);
}
@FindBy(id="Password")
private WebElement psw;
public WebElement getPsw() {
	return psw;
}
@FindBy(id="ConfirmPassword")
private WebElement cnfirmpsw;
public WebElement getCnfirmpsw() {
	return cnfirmpsw;
}
@FindBy(xpath="(//input[@type='submit'])[1]")
private WebElement submitbtn;
public WebElement getSubmitbtn() {
	return submitbtn;
}

}
