package com.htc.Exercise5and6;

public class InvalidAmountException extends Exception {
	public String errorMessage = " ";

	public InvalidAmountException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
