package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class AddNewPrnt extends Baseclass {
public AddNewPrnt()
{
PageFactory.initElements(driver, this);
}
@FindBy(id="FirstName")
private WebElement fname;
public WebElement getFname() {
	return fname;
}
@FindBy(id="LastName")
private WebElement lname;
public WebElement getLname() {
	return lname;
}
@FindBy(id="SignInPIN")
private WebElement signInpin;
public WebElement getSignInpin() {
	return signInpin;
}
@FindBy(id="Email")
private WebElement email;
public WebElement getEmail() {
	return email;
}
@FindBy(xpath="(//span[@role='combobox'])[2]")
private WebElement slctCenter;
public WebElement getSlctCenter() {
	return slctCenter;
}
@FindBy(xpath="//span[text()='Building Futures Montessori - Forest Lake']")
private WebElement clickCenter;
public WebElement getClickCenter() {
	return clickCenter;
}
@FindBy(xpath="//button[contains(text(),'SAVE')]")
private WebElement savebtn;
public WebElement getSavebtn() {
	return savebtn;
}
@FindBy(xpath="(//button[@id='Yes'])[2]")
private WebElement cnfyesbtn;
public WebElement getCnfyesbtn() {
	return cnfyesbtn;
}
}
