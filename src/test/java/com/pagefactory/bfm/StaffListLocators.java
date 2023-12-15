package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class StaffListLocators extends Baseclass {
public StaffListLocators()
{
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='Staff']")
private WebElement staf;
public WebElement getStaf() {
	return staf;
}
@FindBy(xpath="//a[text()='Staff List']")
private WebElement stafList;
public WebElement getStafList() {
	return stafList;
}
@FindBy(xpath="(//button[@type='button'])[3]")
private WebElement slctCmp;
public WebElement getSlctCmp() {
	return slctCmp;
}
@FindBy(xpath="(//button[@type='button'])[4]")
private WebElement slctCntre;
public WebElement getSlctCntre() {
	return slctCntre;
}
@FindBy(xpath="//a[contains(text(),'Add New Staff')]")
private WebElement addNewStf;
public WebElement getAddNewStf() {
	return addNewStf;
}
}
