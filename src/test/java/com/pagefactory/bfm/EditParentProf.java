package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class EditParentProf extends Baseclass {
public EditParentProf()
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
@FindBy(id="Email")
private WebElement email;
public WebElement getEmail() {
	return email;
}
@FindBy(id="UserName")
private WebElement usname;
public WebElement getUsname() {
	return usname;
}
@FindBy(id="MobileNumber")
private WebElement mbno;
public WebElement getMbno() {
	return mbno;
}
@FindBy(xpath="(//span[contains(@class,'k-button-icon')])[2]")
private WebElement slCmpny;
public WebElement getSlCmpny() {
	return slCmpny;
}
@FindBy(xpath="(//span[contains(@class,'k-button-icon')])[3]")
private WebElement slCentre;
public WebElement getSlCentre() {
	return slCentre;
}
@FindBy(id="CRNNumber")
private WebElement crnNumbr;
public WebElement getCrnNumbr() {
	return crnNumbr;
}
@FindBy(id="DateOfBirth")
private WebElement dob;
public WebElement getDob() {
	return dob;
}
@FindBy(id="submit")
private WebElement update;
public WebElement getUpdate() {
	return update;
}
@FindBy(xpath="(//a[text()='Change Password'])[2]")
private WebElement chngPass;
public WebElement getChngPass() {
	return chngPass;
}
}
