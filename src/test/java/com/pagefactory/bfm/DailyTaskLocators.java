package com.pagefactory.bfm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class DailyTaskLocators extends Baseclass {
public DailyTaskLocators()
{
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//a[contains(text(),'Daily Tasks')]")
private WebElement dailytsk;
public WebElement getDailytsk() {
	return dailytsk;
}
@FindBy(xpath="//h3[contains(text(),'Preschool')]")
private WebElement preschool;
public WebElement getPreschool() {
	return preschool;
}
@FindBy(xpath="(//span[contains(text(),'Activities')])[1]")
private WebElement activities;
public WebElement getActivities() {
	return activities;
}
@FindBy(xpath="(//button[@type='button'])[17]")
private WebElement addActivitiesBtn;
public WebElement getAddActivitiesBtn() {
	return addActivitiesBtn;
}
@FindBy(xpath="//button[text()='Montessori']")
private WebElement addMontessori;
public WebElement getAddMontessori() {
	return addMontessori;
}
@FindBy(xpath="//button[text()='Intentional']")
private WebElement addIntentional;
public WebElement getAddIntentional() {
	return addIntentional;
}
@FindBy(xpath="//button[@id='OpenStaffPopup']")
private WebElement addImplementedBy;
public WebElement getAddImplementedBy() {
	return addImplementedBy;
}
@FindBy(xpath="//span[text()='Amanda Zhang']")
private WebElement slctStaffBtn;
public WebElement getSlctStaffBtn() {
	return slctStaffBtn;
}
@FindBy(xpath="//span[text()='Select children']")
private WebElement slctChild;
public WebElement getSlctChild() {
	return slctChild;
}
@FindBy(xpath="//button[text()='Other']")
private WebElement sltOther;
public WebElement getSltOther() {
	return sltOther;
}
@FindBy(xpath="(//span[@class='font-light'])[9]")
private WebElement sltChildName;
public WebElement getSltChildName() {
	return sltChildName;
}
@FindBy(xpath="//button[text()='SAVE']")
private WebElement sveChild;
public WebElement getSveChild() {
	return sveChild;
}
@FindBy(xpath="//*[@id=\"Activity\"]/form/div/div[1]/div[2]/button/span")
private WebElement addActivity;
public WebElement getAddActivity() {
	return addActivity;
}
@FindBy(xpath="//div[text()='Cultural']")
private WebElement addCultural;
public WebElement getAddCultural() {
	return addCultural;
}
@FindBy(xpath="//div[text()='Astronomy']")
private WebElement addAstronomy;
public WebElement getAddAstronomy() {
	return addAstronomy;
}
@FindBy(xpath="(//input[@type='checkbox'])[3]")
private WebElement slctDayandNight;
public WebElement getSlctDayandNight() {
	return slctDayandNight;
}
@FindBy(xpath="//span[text()='Solar Systems (cards)']")
private WebElement slctSolarCards;
public WebElement getSlctSolarCards() {
	return slctSolarCards;
}
@FindBy(xpath="//span[text()='Presented']")
private WebElement slctActivityLvl;
public WebElement getSlctActivityLvl() {
	return slctActivityLvl;
}
@FindBy(xpath="//span[text()='SAVE']")
private WebElement mainSave;
public WebElement getMainSave() {
	return mainSave;
}
@FindBy(xpath="//span[text()='Select files...']")
private WebElement slctFile;
public WebElement getSlctFile() {
	return slctFile;
}
@FindBy(xpath="(//textarea[@id='description'])[5]")
private WebElement comment;
public WebElement getComment() {
	return comment;
}
@FindBy(xpath="(//textarea[@id='description'])[6]")
private WebElement internalNote;
public WebElement getInternalNote() {
	return internalNote;
}
@FindBy(xpath="//span[text()='Select children']")
private WebElement selectChild;
public WebElement getSelectChild() {
	return selectChild;
}
@FindBy(xpath="//button[text()='SAVE']")
private WebElement childSave;
public WebElement getChildSave() {
	return childSave;
}
@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement actTitle;
public WebElement getActTitle() {
	return actTitle;
}
@FindBy(xpath="(//textarea[@id='description'])[4]")
private WebElement aimDirect;
public WebElement getAimDirect() {
	return aimDirect;
}
@FindBy(xpath="(//textarea[@id='description'])[5]")
private WebElement aimInDirect;
public WebElement getAimInDirect() {
	return aimInDirect;
}
@FindBy(xpath="(//textarea[@id='description'])[6]")
private WebElement vocabulary;
public WebElement getVocabulary() {
	return vocabulary;
}
@FindBy(xpath="(//textarea[@id='description'])[8]")
private WebElement intentComment;
public WebElement getIntentComment() {
	return intentComment;
}
@FindBy(xpath="(//textarea[@id='description'])[9]")
private WebElement intentInternalNote;
public WebElement getIntentInternalNote() {
	return intentInternalNote;
}
@FindBy(xpath="//button[text()='SAVE']")
private WebElement saveActivitybtn;
public WebElement getSaveActivitybtn() {
	return saveActivitybtn;
}
@FindBy(xpath="//button[text()='Emergent']")
private WebElement addEmergent;
public WebElement getAddEmergent() {
	return addEmergent;
}
@FindBy(xpath="(//textarea[@id='description'])[4]")
private WebElement AddcmtTxt;
public WebElement getAddcmtTxt() {
	return AddcmtTxt;
}
@FindBy(xpath="(//span[@class='font-light'])[34]")
private WebElement AddPlunket;
public WebElement getAddPlunket() {
	return AddPlunket;
}
@FindBy(xpath="//button[text()='Moment']")
private WebElement Addmoment;
public WebElement getAddmoment() {
	return Addmoment;
}
@FindBy(xpath="(//input[@type='text'])[3]")
private WebElement addMomentActivityTitle;
public WebElement getAddMomentActivityTitle() {
	return addMomentActivityTitle;
}
@FindBy(xpath="(//textarea[@id='description'])[2]")
private WebElement addMomentComment;
public WebElement getAddMomentComment() {
	return addMomentComment;
}
@FindBy(xpath="(//textarea[@id='description'])[3]")
private WebElement addMomentInternalNote;
public WebElement getAddMomentInternalNote() {
	return addMomentInternalNote;
}
@FindBy(xpath="(//button[@type='button'])[8]")
private WebElement addImplementedDate;
public WebElement getAddImplementedDate() {
	return addImplementedDate;
}
@FindBy(xpath="//p[text()='27']")
private WebElement addDate27;
public WebElement getAddDate27() {
	return addDate27;
}
@FindBy(xpath="//span[text()='OK']")
private WebElement addOkBtn;
public WebElement getAddOkBtn() {
	return addOkBtn;
}
}
