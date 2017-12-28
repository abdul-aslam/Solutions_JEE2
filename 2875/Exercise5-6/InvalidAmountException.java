package com.htc.exc.five;

public class InvalidAmountException extends Exception{
	String msg;

	/**
	 * @param msg
	 */
	public InvalidAmountException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "InvalidAmountException [msg=" + msg + "]";
	}
	
	

}
