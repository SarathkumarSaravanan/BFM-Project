package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class CompanyList extends Baseclass {
public CompanyList()
{
PageFactory.initElements(driver, this);
}
@FindBy(id="Admin")
private WebElement adm;
public WebElement getAdm() {
	return adm;
}
@FindBy(xpath="//a[text()='Companies']")
private WebElement cmpy;
public WebElement getCmpy() {
	return cmpy;
}
@FindBy(xpath="//a[contains(text(),'Add New Company')]")
private WebElement asnewcmp;
public WebElement getAsnewcmp() {
	return asnewcmp;
}
}
