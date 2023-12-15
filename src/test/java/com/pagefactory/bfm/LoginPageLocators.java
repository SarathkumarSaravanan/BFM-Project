package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class LoginPageLocators extends Baseclass {
public LoginPageLocators()
{
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@type='text']")
private WebElement email;
public WebElement getEmail() {
	return email;
}
@FindBy(xpath="//input[@type='password']")
private WebElement psw;
public WebElement getPsw() {
	return psw;
}
@FindBy(xpath="//button[@type='submit']")
private WebElement btn;
public WebElement getBtn() {
	return btn;
}
@FindBy(id="RememberMe")
private WebElement rememberme;
public WebElement getRememberme() {
	return rememberme;
}
@FindBy(xpath="//a[text()='Forgot your password?']")
private WebElement frgpsw;
public WebElement getFrgpsw() {
	return frgpsw;
}
@FindBy(xpath="//a[text()='Create a new account >']")
private WebElement cretNewAcc;
public WebElement getCretNewAcc() {
	return cretNewAcc;
}
@FindBy(xpath="//span[@role='combobox']")
private WebElement slctSite;
public WebElement getSlctSite() {
	return slctSite;
}
@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/span/select")
private WebElement choseSite;
public WebElement getChoseSite() {
	return choseSite;
}
@FindBy(xpath="//button[text()='OK']")
private WebElement okBtn;
public WebElement getOkBtn() {
	return okBtn;
}


}
