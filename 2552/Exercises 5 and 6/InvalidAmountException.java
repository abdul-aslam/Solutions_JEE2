package com.htc.cjavaexercises1.entity;

//Exercises 5 and 6
public class InvalidAmountException extends Exception {

	String cause;

	public InvalidAmountException(String cause) {
		super();
		this.cause = cause;
	}

	@Override
	public String toString() {
		return "InvalidAmountException [cause=" + cause + "]";
	}
	
	public String getMessage() {
		
		return cause;
	}
}
