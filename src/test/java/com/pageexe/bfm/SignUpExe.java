package com.pageexe.bfm;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pagelogics.bfm.SignupLogics;
public class SignUpExe extends SignupLogics{
	@Test
	public void exe() throws IOException, InterruptedException
	{
		signup();
		}
	

}
