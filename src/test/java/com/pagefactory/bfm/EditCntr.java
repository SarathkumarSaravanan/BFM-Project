package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class EditCntr extends Baseclass {
public EditCntr()
{
PageFactory.initElements(driver, this);
}
@FindBy(id="Name")
private WebElement centerName;
public WebElement getCenterName() {
	return centerName;
}
@FindBy(xpath="//button[@class='btn-blue-withicon']")
private WebElement updat;
public WebElement getUpdat() {
	return updat;
}
@FindBy(xpath="(//button[@id='Yes'])[2]")
private WebElement yes;
public WebElement getYes() {
	return yes;
}



}
