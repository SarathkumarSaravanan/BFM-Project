package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class EditCmpnyAdminProf extends Baseclass {
public EditCmpnyAdminProf()
{
PageFactory.initElements(driver, this);
}
@FindBy(id="FirstName")
private WebElement fName;
public WebElement getfName() {
	return fName;
}
@FindBy(xpath="//input[@id='submit']")
private WebElement updatebtn;
public WebElement getUpdatebtn() {
	return updatebtn;
}


}
