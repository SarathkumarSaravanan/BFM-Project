package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class CenterList extends Baseclass {
public CenterList()
{
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='Centre']")
private WebElement centre;
public WebElement getCentre() {
	return centre;
}
@FindBy(xpath="//a[text()='Centre List']")
private WebElement cntreList;
public WebElement getCntreList() {
	return cntreList;
}
@FindBy(xpath="//label[text()='Company:']")
private WebElement cpnyDropDown;
public WebElement getCpnyDropDown() {
	return cpnyDropDown;
}
@FindBy(xpath="//a[contains(text(),'Add New Centre')]")
private WebElement addNewCenter;
public WebElement getAddNewCenter() {
	return addNewCenter;
}

}
