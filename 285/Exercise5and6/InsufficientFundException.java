package com.htc.Exercise5and6;

public class InsufficientFundException extends Exception {
	public String errorMessage=" ";

public InsufficientFundException(String errorMsg) {
	super();
	this.errorMessage = errorMsg;
}

public String getErrorMessage() {
	return errorMessage;
}

public void setErrorMessage(String errorMsg) {
	this.errorMessage = errorMsg;
}

}
