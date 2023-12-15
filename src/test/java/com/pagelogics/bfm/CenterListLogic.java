package com.pagelogics.bfm;

import java.io.IOException;

import com.base.util.Baseclass;
import com.pagefactory.bfm.CenterList;

public class CenterListLogic extends Baseclass {
public static void centerList() throws InterruptedException
{
	try {
		LoginPageLogics.login();
		moveToElement(new CenterList().getCentre());
		new CenterList().getCntreList().click();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
