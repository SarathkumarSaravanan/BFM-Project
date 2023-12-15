package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class StaffSignIn extends Baseclass {
public StaffSignIn()
{
PageFactory.initElements(driver, this);
}

@FindBy(xpath="//a[text()='Staff Sign In']")
private WebElement stafsigin;
public WebElement getStafsigin() {
	return stafsigin;
}
@FindBy(xpath="//button[@id='headlessui-listbox-button-:r0:']")
private WebElement slcntr;
public WebElement getSlcntr() {
	return slcntr;
}
@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div")
private WebElement allRoom;
public WebElement getAllRoom() {
	return allRoom;
}


}
