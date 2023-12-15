package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class ParentList extends Baseclass{
public ParentList()
{
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='Parent']")
private WebElement prnt;
public WebElement getPrnt() {
	return prnt;
}
@FindBy(xpath="//a[text()='Parent List']")
private WebElement prntList;
public WebElement getPrntList() {
	return prntList;
}
@FindBy(xpath="/html/body/div[2]/div/main/div[2]/div/div/div/div[1]/div/div/div[1]/label[1]/div/div[1]")
private WebElement CrntBtn;
public WebElement getCrntBtn() {
	return CrntBtn;
}
@FindBy(id="SearchText")
private WebElement srchText;
public WebElement getSrchText() {
	return srchText;
}
@FindBy(xpath="//label[text()='Company:']")
private WebElement sltCmpny;
public WebElement getSltCmpny() {
	return sltCmpny;
}
@FindBy(xpath="//label[text()='Centre:']")
private WebElement sltCnter;
public WebElement getSltCnter() {
	return sltCnter;
}
@FindBy(xpath="//a[contains(text(),'Add New Parent')]")
private WebElement addNwPrnt;
public WebElement getAddNwPrnt() {
	return addNwPrnt;
}
@FindBy(xpath="//span[text()='Building Futures Pty Ltd']")
private WebElement clickCmpny;
public WebElement getClickCmpny() {
	return clickCmpny;
}
@FindBy(xpath="//span[text()='Building Futures Montessori - Forest Lake']")
private WebElement clickCnter;
public WebElement getClickCnter() {
	return clickCnter;
}
@FindBy(xpath="//a[contains(text(),'Add New Parent')]")
private WebElement addNewPrnt;
public WebElement getAddNewPrnt() {
	return addNewPrnt;
}

}
