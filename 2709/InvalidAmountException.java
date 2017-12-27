package assignment2;

public class InvalidAmountException extends Exception {

	String errorMessage;

	public InvalidAmountException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	
	
}
