package com.htc.exc.five;

public class InvalidAccountNoException extends Exception {

	String msg;

	
	public InvalidAccountNoException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "InvalidAccountNoException [msg=" + msg + "]";
	}
	
	
}
