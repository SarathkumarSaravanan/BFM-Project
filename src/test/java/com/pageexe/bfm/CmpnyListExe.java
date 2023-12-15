package com.pageexe.bfm;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pagelogics.bfm.CompanyListLogic;

public class CmpnyListExe extends CompanyListLogic {
@Test
public void compList()
{
	try {
		cmpnyList();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
