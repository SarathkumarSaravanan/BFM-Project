package com.pagefactory.bfm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class AddNewStaff extends Baseclass {
public AddNewStaff()
{
PageFactory.initElements(driver, this);
}
@FindBy(id="FirstName")
private WebElement frstName;
public WebElement getFrstName() {
	return frstName;
}
@FindBy(id="LastName")
private WebElement lstName;
public WebElement getLstName() {
	return lstName;
}
@FindBy(xpath="//*[@id=\"form0\"]/div[3]/div[1]/div/div/span[1]/button/span")
private WebElement cmpName;
public WebElement getCmpName() {
	return cmpName;
}
@FindBy(xpath="/html/body/div[2]/div/main/div[4]/div[1]/div/div[2]/div/form/div[3]/div[2]/div/div/span[1]/button")
private WebElement cntrName;
public WebElement getCntrName() {
	return cntrName;
}
@FindBy(xpath="//*[@id=\"form0\"]/div[3]/div[3]/div[1]/div/span[1]/button/span")
private WebElement empType;
public WebElement getEmpType() {
	return empType;
}
@FindBy(xpath="/html/body/div[2]/div/main/div[4]/div[1]/div/div[2]/div/form/div[3]/div[3]/div[2]/div/span[1]/span/span")
private WebElement secAccesLvl;
public WebElement getSecAccesLvl() {
	return secAccesLvl;
}
@FindBy(xpath="/html/body/div[2]/div/main/div[4]/div[1]/div/div[2]/div/form/div[3]/div[4]/div[1]/div/span[1]")
private WebElement position;
public WebElement getPosition() {
	return position;
}
@FindBy(xpath="/html/body/div[2]/div/main/div[4]/div[1]/div/div[2]/div/form/div[3]/div[4]/div[2]/div/span[1]/span/span")
private WebElement crntRoom;
public WebElement getCrntRoom() {
	return crntRoom;
}
@FindBy(xpath="//button[@type='submit']")
private WebElement svbtn;
public WebElement getSvbtn() {
	return svbtn;
}
@FindBy(xpath="(//button[@id='Yes'])[2]")
private WebElement cnfYes;
public WebElement getCnfYes() {
	return cnfYes;
}

}
