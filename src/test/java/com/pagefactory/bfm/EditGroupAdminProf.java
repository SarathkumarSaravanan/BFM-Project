package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class EditGroupAdminProf extends Baseclass {
public EditGroupAdminProf()
{
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//span[text()='Please select a room']")
private WebElement selctroom;
public WebElement getSelctroom() {
	return selctroom;
}
@FindBy(id="FirstName")
private WebElement fname;
public WebElement getFname() {
	return fname;
}
@FindBy(xpath="//input[@id='submit']")
private WebElement update;
public WebElement getUpdate() {
	return update;
}
}
