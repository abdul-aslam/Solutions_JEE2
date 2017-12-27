package com.htc.exc.thirteen;

public class EmployeeNotFoundException extends Exception{
	String msg;


	public EmployeeNotFoundException(String msg) {
		super();
		this.msg = msg;
	}


	@Override
	public String toString() {
		return "EmployeeNotFoundException [msg=" + msg + "]";
	}
	
	
}
