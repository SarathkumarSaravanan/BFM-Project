package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class AddNewChildLocators extends Baseclass{
public AddNewChildLocators()
{
PageFactory.initElements(driver, this);
}
@FindBy(id="FirstName")
private WebElement fname;
public WebElement getFname() {
	return fname;
}
@FindBy(xpath="(//button[@type='button'])[6]")
private WebElement selectCmpny;
public WebElement getSelectCmpny() {
	return selectCmpny;
}

@FindBy(xpath="//span[text()='Building Futures Pty Ltd']")
private WebElement clickCmpny;
public WebElement getClickCmpny() {
	return clickCmpny;
}
@FindBy(xpath="(//button[@unselectable='on'])[2]")
private WebElement sltcntr;
public WebElement getSltcntr() {
	return sltcntr;
}
@FindBy(xpath="//span[text()='Building Futures Montessori - Forest Lake']")
private WebElement clickCenter;
public WebElement getClickCenter() {
	return clickCenter;
}
@FindBy(id="LastName")
private WebElement lName;
public WebElement getlName() {
	return lName;
}
@FindBy(xpath="(//button[@type='button'])[8]")
private WebElement gender;
public WebElement getGender() {
	return gender;
}
@FindBy(xpath="//span[text()='Male']")
private WebElement male;
public WebElement getMale() {
	return male;
}
@FindBy(id="BirthDate")
private WebElement bDate;
public WebElement getbDate() {
	return bDate;
}
@FindBy(xpath="//button[contains(text(),' SAVE')]")
private WebElement savebtn;
public WebElement getSavebtn() {
	return savebtn;
}
@FindBy(xpath="(//button[@id='Yes'])[2]")
private WebElement conYes;
public WebElement getConYes() {
	return conYes;
}
}
