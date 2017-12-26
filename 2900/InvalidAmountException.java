package com.htc.exercise5and6and15and19;

public class InvalidAmountException extends Exception {
    
	String cause;

	public InvalidAmountException(String cause) {
		// TODO Auto-generated constructor stub
		this.cause = cause;
		
	}

	@Override
	public String toString() {
		return "InvalidAmountException [cause=" + cause + "]";
	}

	public String getMessage()
	{
		return cause;
	}
}
