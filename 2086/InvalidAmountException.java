package com.htc.trainingexcerise.week1;

public class InvalidAmountException extends Exception {
String errormsg;
	public InvalidAmountException() {
		this.errormsg="Invalid Amount.";
	}
	public InvalidAmountException(String errormsg) {
		super();
		this.errormsg = errormsg;
	}

	
}
