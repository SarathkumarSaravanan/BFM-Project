package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class YopMailLocator extends Baseclass{
public YopMailLocator()
{
PageFactory.initElements(driver, this);	
}
@FindBy(id="login")
private WebElement usrname;
public WebElement getUsrname() {
	return usrname;
}
@FindBy(xpath="//i[@class='material-icons-outlined f36']")
private WebElement btn;
public WebElement getBtn() {
	return btn;
}
@FindBy(xpath="//div[@class='lmfd']/following::div[text()='Confirm your account']")
private WebElement confrimAcc;
public WebElement getConfrimAcc() {
	return confrimAcc;
}
@FindBy(xpath="//*[@id=\"mail\"]/div/table/tbody/tr/td[2]/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/a")
private WebElement cnfrmEmailAdd;
public WebElement getCnfrmEmailAdd() {
	return cnfrmEmailAdd;
}
@FindBy(id="ifmail")
private WebElement frame;
public WebElement getFrame() {
	return frame;
}
@FindBy(xpath="//*[@id=\"recaptcha-anchor\"]/div[1]")
private WebElement capta;
public WebElement getCapta() {
	return capta;
}
@FindBy(xpath="//a[text()='RESET MY PASSWORD']")
private WebElement reseMyPsw;
public WebElement getReseMyPsw() {
	return reseMyPsw;
}
}
