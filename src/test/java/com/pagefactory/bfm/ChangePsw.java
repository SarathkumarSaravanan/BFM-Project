package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class ChangePsw extends Baseclass{
public ChangePsw()
{
PageFactory.initElements(driver, this);
}
@FindBy(id="Inititals")
private WebElement initial;
public WebElement getinitial() {
	return initial;
}
@FindBy(xpath="(//a[text()='Change Password'])[1]")
private WebElement chgpsw;
public WebElement getChgpsw() {
	return chgpsw;
}
@FindBy(id="OldPassword")
private WebElement oldpsw;
public WebElement getOldpsw() {
	return oldpsw;
}
@FindBy(id="NewPassword")
private WebElement newpsw;
public WebElement getNewpsw() {
	return newpsw;
}
@FindBy(id="ConfirmPassword")
private WebElement cnfpsw;
public WebElement getCnfpsw() {
	return cnfpsw;
}
@FindBy(xpath="//button[@value='Change password']")
private WebElement chgpswd;
public WebElement getChgpswd() {
	return chgpswd;
}
}
