package com.pagefactory.bfm;

import org.openqa.selenium.support.PageFactory;

import com.base.util.Baseclass;

public class ExpSecMaint extends Baseclass {
public ExpSecMaint()
{
PageFactory.initElements(driver, this);
}



}
