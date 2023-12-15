package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class EditAdminProf extends Baseclass{
public EditAdminProf()
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
@FindBy(xpath="/html/body/div[2]/div/div/form/section/div/div[7]/input")
private WebElement updt;
public WebElement getUpdt() {
	return updt;
}

}
