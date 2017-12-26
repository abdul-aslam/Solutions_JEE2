package com.htc.exercise5and6and15and19;

public class InsufficientFundException extends Exception {
    String cause;
	public InsufficientFundException(String cause) {
		// TODO Auto-generated constructor stub
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
