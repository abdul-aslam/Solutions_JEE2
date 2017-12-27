package com.htc.employeehashmap;

public class EmployeeNotFoundException extends Exception {
	
	private String empNotFoundMsg;
	
	public EmployeeNotFoundException()
	{
		this.empNotFoundMsg = "Invalid Employee id";
	}

	public EmployeeNotFoundException(String empNotFoundMsg) {
		super();
		this.empNotFoundMsg = empNotFoundMsg;
	}

	@Override
	public String toString() {
		return "EmployeeNotFoundException [empNotFoundMsg=" + empNotFoundMsg + "]";
	}
	
	

}
