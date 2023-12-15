package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class ChildListLocators extends Baseclass {
public ChildListLocators()
{
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='Child']")
private WebElement child;
public WebElement getChild() {
	return child;
}
@FindBy(xpath="//a[text()='Child List']")
private WebElement childList;
public WebElement getChildList() {
	return childList;
}
@FindBy(xpath="//input[@id='toggleB']")
private WebElement tgglbtn;
public WebElement getTgglbtn() {
	return tgglbtn;
}
@FindBy(id="SearchText")
private WebElement srchText;
public WebElement getSrchText() {
	return srchText;
}
@FindBy(xpath="(//button[@type='button'])[3]")
private WebElement selectcmpny;
public WebElement getSelectcmpny() {
	return selectcmpny;
}
@FindBy(xpath="(//button[@type='button'])[4]")
private WebElement selectcntr;
public WebElement getSelectcntr() {
	return selectcntr;
}
@FindBy(xpath="//a[contains(text(),'Add New Child')]")
private WebElement addNewChile;
public WebElement getAddNewChile() {
	return addNewChile;
}
@FindBy(xpath="//span[text()='Building Futures Pty Ltd']")
private WebElement clickCompany;
public WebElement getClickCompany() {
	return clickCompany;
}
@FindBy(xpath="//span[text()='Building Futures Montessori - Forest Lake']")
private WebElement clickCenter;
public WebElement getClickCenter() {
	return clickCenter;
}

}
