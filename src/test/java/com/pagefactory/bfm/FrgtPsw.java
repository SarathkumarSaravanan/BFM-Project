package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class FrgtPsw extends Baseclass {
public FrgtPsw()
{
PageFactory.initElements(driver, this);
}
@FindBy(id="Email")
private WebElement email;
public WebElement getEmail() {
	return email;
}
@FindBy(xpath="//input[@type='submit']")
private WebElement sbmt;
public WebElement getSbmt() {
	return sbmt;
	}
@FindBy(xpath="//input[@type='button']")
private WebElement cnclbtn;
public WebElement getCnclbtn() {
	return cnclbtn;
}
@FindBy(xpath="//a[text()='Sign In >']")
private WebElement sgnin;
public WebElement getSgnin() {
	return sgnin;
}
}
