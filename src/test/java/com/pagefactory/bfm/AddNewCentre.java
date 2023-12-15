package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class AddNewCentre extends Baseclass {
public AddNewCentre()
{
PageFactory.initElements(driver, this);
}
@FindBy(id="Name")
private WebElement centreNames;
public WebElement getCentreNames() {
	return centreNames;
}
@FindBy(xpath="//span[text()='Select Company']")
private WebElement slctCompy;
public WebElement getSlctCompy() {
	return slctCompy;
}
@FindBy(xpath="(//button[@unselectable='on'])[2]")
private WebElement slctCntre;
public WebElement getSlctCntre() {
	return slctCntre;
}
@FindBy(id="openingTime")
private WebElement openTime;
public WebElement getOpenTime() {
	return openTime;
}
@FindBy(id="closingTime")
private WebElement closingTime;
public WebElement getClosingTime() {
	return closingTime;
}
@FindBy(id="GeneralGenericContact_Phone")
private WebElement phone;
public WebElement getPhone() {
	return phone;
}
@FindBy(id="GeneralGenericContact_Mobile")
private WebElement mobile;
public WebElement getMobile() {
	return mobile;
}
@FindBy(id="GeneralGenericContact_Email")
private WebElement email;
public WebElement getEmail() {
	return email;
}
@FindBy(xpath="//button[@class='btn-blue-withicon']")
private WebElement createbtn;
public WebElement getCreatebtn() {
	return createbtn;
}
@FindBy(xpath="(//button[@id='Yes'])[2]")
private WebElement cnfrmBtn;
public WebElement getCnfrmBtn() {
	return cnfrmBtn;
}
}
