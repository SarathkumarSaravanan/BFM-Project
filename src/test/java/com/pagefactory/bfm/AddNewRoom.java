package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class AddNewRoom extends Baseclass {
public AddNewRoom()
{
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[contains(text(),'Add new Room')]")
private WebElement addnewRoom;
public WebElement getAddnewRoom() {
	return addnewRoom;
}
@FindBy(xpath="(//button[@type='button'])[3]")
private WebElement cmpanyName;
public WebElement getCmpanyName() {
	return cmpanyName;
}
@FindBy(xpath="(//button[@type='button'])[4]")
private WebElement cntreName;
public WebElement getCntreName() {
	return cntreName;
}
@FindBy(id="GroupName")
private WebElement grpName;
public WebElement getGrpName() {
	return grpName;
}
@FindBy(xpath="//button[@type='submit']")
private WebElement savebtn;
public WebElement getSavebtn() {
	return savebtn;
}
@FindBy(id="IsVisible")
private WebElement roomVisible;
public WebElement getRoomVisible() {
	return roomVisible;
}
@FindBy(xpath="(//button[@role='button'])[1]")
private WebElement uprAge;
public WebElement getUprAge() {
	return uprAge;
}
@FindBy(xpath="(//button[@role='button'])[3]")
private WebElement sessionpDay;
public WebElement getSessionpDay() {
	return sessionpDay;
}
@FindBy(xpath="(//button[@role='button'])[5]")
private WebElement chldNo;
public WebElement getChldNo() {
	return chldNo;
}
@FindBy(xpath="(//button[@role='button'])[7]")
private WebElement lowBond;
public WebElement getLowBond() {
	return lowBond;
}


}
