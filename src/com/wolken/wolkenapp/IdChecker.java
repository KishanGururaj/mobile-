package com.wolken.wolkenapp;

import com.wolken.wolkenapp.exception.MobileIdException;

public class IdChecker {
	public void check(int  id )throws MobileIdException {
		if(id!=0 && id >0) {
			System.out.println("ID is proper");
		}
		else {
			throw new MobileIdException();
		}
	}

}
