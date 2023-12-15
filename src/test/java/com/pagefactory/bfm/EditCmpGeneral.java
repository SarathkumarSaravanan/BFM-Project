package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class EditCmpGeneral extends Baseclass {
public EditCmpGeneral()
{
PageFactory.initElements(driver, this);
}
@FindBy(id="CompanyName")
private WebElement busiName;
public WebElement getbusiName() {
	return busiName;
}
@FindBy(xpath="(//span[@role='combobox'])[1]")
private WebElement proEnTy;
public WebElement getProEnTy() {
	return proEnTy;
}
@FindBy(id="CharitAsofDateofEvent")
private WebElement asOfDate;
public WebElement getAsOfDate() {
	return asOfDate;
}
@FindBy(id="Phone")
private WebElement phone;
public WebElement getPhone() {
	return phone;
}
@FindBy(id="Mobile")
private WebElement mob;
public WebElement getMob() {
	return mob;
}
@FindBy(id="Email")
private WebElement email;
public WebElement getEmail() {
	return email;
}
@FindBy(id="EmailforallCentre")
private WebElement emailcntre;
public WebElement getEmailcntre() {
	return emailcntre;
}
@FindBy(id="addaddress")
private WebElement addadr;
public WebElement getAddadr() {
	return addadr;
}
@FindBy(xpath="(//span[@role='combobox'])[2]")
private WebElement slctAdrTyp;
public WebElement getSlctAdrTyp() {
	return slctAdrTyp;
}
@FindBy(id="GenericAddress_StreetLine1")
private WebElement address1;
public WebElement getAddress1() {
	return address1;
}
@FindBy(id="GenericAddress_StreetLine2")
private WebElement address2;
public WebElement getAddress2() {
	return address2;
}
@FindBy(id="GenericAddress_Suburb")
private WebElement subAdd;
public WebElement getSubAdd() {
	return subAdd;
}
@FindBy(xpath="(//span[@role='combobox'])[3]")
private WebElement slctState;
public WebElement getSlctState() {
	return slctState;
}
@FindBy(id="GenericAddress_Postcode")
private WebElement postcode;
public WebElement getPostcode() {
	return postcode;
}
@FindBy(id="GenericAddress_StartDate")
private WebElement startDate;
public WebElement getStartDate() {
	return startDate;
}
@FindBy(id="GenericAddress_EndDate")
private WebElement endDate;
public WebElement getEndDate() {
	return endDate;
}
@FindBy(id="save")
private WebElement savebtn;
public WebElement getSavebtn() {
	return savebtn;
}
@FindBy(xpath="(//button[@id='remove'])[1]")
private WebElement cancelbtn1;
public WebElement getCancelbtn1() {
	return cancelbtn1;
}
@FindBy(xpath="//button[@type='submit']")
private WebElement updtCpny;
public WebElement getUpdtCpny() {
	return updtCpny;
}
@FindBy(xpath="(//button[@id='remove'])[2]")
private WebElement cancelbtn2;
public WebElement getCancelbtn2() {
	return cancelbtn2;
}
@FindBy(xpath="(//button[contains(text(),'Yes')])[2]")
private WebElement yesbtn;
public WebElement getYesbtn() {
	return yesbtn;
}
@FindBy(xpath="//a[@title='Go to the next page']")
private WebElement nxtPage;
public WebElement getNxtPage() {
	return nxtPage;
}
}
