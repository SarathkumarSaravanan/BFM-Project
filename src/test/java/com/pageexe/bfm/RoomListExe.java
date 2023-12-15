package com.pageexe.bfm;

import org.testng.annotations.Test;

import com.pagelogics.bfm.RoomListLogic;

public class RoomListExe extends RoomListLogic {
@Test
public void roomList()
{
	try {
		roomlist();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
