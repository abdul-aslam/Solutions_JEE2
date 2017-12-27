package com.htc.exc.five;

public class InsufficientFundException extends Exception {
	
	String msg;

	/**
	 * @param msg
	 */
	public InsufficientFundException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "InsufficientFundException [msg=" + msg + "]";
	}
	
	
	
	
}
