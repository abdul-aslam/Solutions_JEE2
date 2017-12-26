package com.htc.Exercise13;

public class EmployeeNotFoundException extends Exception {
	private String ErrMsg = "Emploee Not Found";

	public EmployeeNotFoundException() {
		super();
	}
	public EmployeeNotFoundException(String errMsg) {
		super();
		ErrMsg = errMsg;
	}
	public String getErrMsg() {
		return ErrMsg;
	}
	public void setErrMsg(String errMsg) {
		ErrMsg = errMsg;
	}
}
