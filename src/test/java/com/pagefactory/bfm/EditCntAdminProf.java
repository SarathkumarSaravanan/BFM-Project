package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class EditCntAdminProf extends Baseclass {
public EditCntAdminProf()
{
PageFactory.initElements(driver, this);
}
@FindBy(id="FirstName")
private WebElement fname;
public WebElement getFname() {
	return fname;
	}
@FindBy(id="submit")
private WebElement updatbtn;
public WebElement getUpdatbtn() {
	return updatbtn;
}

}
