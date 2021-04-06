package com.wolken.wolkenapp.exception;

public class MobileIdException extends Exception {
	@Override 
	public String getMessage() {
		return "id given is already present or id can't be negative";
	}

}
