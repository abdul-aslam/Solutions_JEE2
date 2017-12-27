package com.htc.cjavaexercises1.entity;

//Exercises 5 and 6
public class InsufficientFundException extends Exception {

	String cause;

	
	public InsufficientFundException() {
		
		this.cause = "Insufficient funds";
	}
	
	public InsufficientFundException(String cause) {
		super();
		this.cause = cause;
	}

	@Override
	public String toString() {
		return "InsufficientFundException [cause=" + cause + "]";
	}
	
	public String getMessage()
	{
	 return cause;	
	}
	
}
