package com.pagefactory.bfm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class RoomList extends Baseclass {
public RoomList()
{
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='Rooms List']")
private WebElement roomlist;
public WebElement getRoomlist() {
	return roomlist;
	}
@FindBy(xpath="//label[text()='Company:']")
private WebElement cmpny;
public WebElement getCmpny() {
	return cmpny;
}
@FindBy(xpath="//label[text()='Centre:']")
private WebElement centerlist;
public WebElement getCenterlist() {
	return centerlist;
}
@FindBy(xpath="//a[contains(text(),'Add new Room')]")
private WebElement  newRoom;
public WebElement getNewRoom() {
	return newRoom;
}
@FindBy(xpath="(//button[@type='button']/child::span)[2]")
private WebElement centre;
public WebElement getCentre() {
	return centre;
}
@FindBy(xpath="//div[@id='companies-list']")
private WebElement cmpnyList;
public WebElement getCmpnyList() {
	return cmpnyList;
}
@FindBy(id="centre_listbox")
private WebElement cntrList;
public WebElement getCntrList() {
	return cntrList;
}
@FindBy(xpath="//ul[@id='companies_listbox']")
private WebElement cmplist;
public WebElement getCmplist() {
	return cmplist;
}
}
