package assignment2;

public class InsufficientFundException extends Exception {
	
	String errorMessage;

	public InsufficientFundException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	

}
