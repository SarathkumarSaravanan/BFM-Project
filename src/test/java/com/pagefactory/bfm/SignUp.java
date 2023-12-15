package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class SignUp extends Baseclass {
public SignUp()
{
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@placeholder='First name']")
private WebElement fname;
public WebElement getFname() {
	return fname;
}
@FindBy(id="LastName")
private WebElement lname;
public WebElement getLname() {
	return lname;
}
@FindBy(id="Email")
private WebElement email;
public WebElement getEmail() {
	return email;
}
@FindBy(id="MobileNumber")
private WebElement mbNo;
public WebElement getmbNo() {
	return mbNo;
}
@FindBy(xpath="(//span[@role='combobox'])[1]")
private WebElement slctCmpny;
public WebElement getSlctCmpny() {
	return slctCmpny;
}
@FindBy(xpath="//span[text()='Building Futures Pty Ltd']")
private WebElement bldfut;
public WebElement getBldfut() {
	return bldfut;
}
@FindBy(xpath="(//span[@role='combobox'])[2]")
private WebElement slctCntr;
public WebElement getSlctCntr() {
	return slctCntr;
}
@FindBy(xpath="//span[text()='Building Futures Montessori - Forest Lake']")
private WebElement frstLake;
public WebElement getFrstLake() {
	return frstLake;
	
}
@FindBy(id="UserName")
private WebElement uName;
public WebElement getuName() {
	return uName;
}
@FindBy(id="Password")
private WebElement psw;
public WebElement getPsw() {
	return psw;
}
@FindBy(id="ConfirmPassword")
private WebElement cnfPsw;
public WebElement getCnfPsw() {
	return cnfPsw;
}
@FindBy(xpath="//input[@type='submit']")
private WebElement sbmt;
public WebElement getSbmt() {
	return sbmt;
}
@FindBy(xpath="//input[@type='button']")
private WebElement cncl;
public WebElement getCncl() {
	return cncl;
}
@FindBy(xpath="//a[text()='Sign in >']")
private WebElement sgin;
public WebElement getSgin() {
	return sgin;
}
}
