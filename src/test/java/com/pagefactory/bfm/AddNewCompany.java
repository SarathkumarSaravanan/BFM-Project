package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class AddNewCompany extends Baseclass {
public AddNewCompany()
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
@FindBy(id="CompanyName")
private WebElement businame;
public WebElement getBusiname() {
	return businame;
}
@FindBy(xpath="//span[contains(text(),' Provider Entity')]")
private WebElement provEntType;
public WebElement getProvEntType() {
	return provEntType;
}
@FindBy(xpath="//span[text()='Indigenous Corporation']")
private WebElement indigcorp;
public WebElement getIndigcorp() {
	return indigcorp;
}
@FindBy(id="CharitAsofDateofEvent")
private WebElement asOfDate;
public WebElement getAsOfDate() {
	return asOfDate;
}
@FindBy(id="Phone")
private WebElement phoneno;
public WebElement getPhoneno() {
	return phoneno;
}
@FindBy(id="Mobile")
private WebElement mobi;
public WebElement getMobi() {
	return mobi;
}
@FindBy(id="Email")
private WebElement email;
public WebElement getEmail() {
	return email;
	}	
@FindBy(xpath="//button[@type='submit']")
private WebElement sbmt;
public WebElement getSbmt() {
	return sbmt;
}
@FindBy(id="LegalName")
private WebElement lglName;
public WebElement getLglName() {
	return lglName;
}
@FindBy(id="ABN")
private WebElement abn;
public WebElement getAbn() {
	return abn;
}
@FindBy(id="ProviderID")
private WebElement provid;
public WebElement getProvid() {
	return provid;
}
@FindBy(xpath="(//input[@id='IsforProfit'])[1]")
private WebElement isforProf;
public WebElement getIsforProf() {
	return isforProf;
}
@FindBy(xpath="(//input[@id='IsforProfit'])[2]")
private WebElement  IsChar;
public WebElement getIsChar() {
	return IsChar;
}
@FindBy(id="EmailforallCentre")
private WebElement emailForCentre;
public WebElement getEmailForCentre() {
	return emailForCentre;
}
@FindBy(id="remove")
private WebElement cancle;
public WebElement getCancle() {
	return cancle;
}
@FindBy(xpath="(//button[@id='Yes'])[2]")
private WebElement yesbtn;
public WebElement getYesbtn() {
	return yesbtn;
}


}
