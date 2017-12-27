package assignment2;

public class ProductNotFoundException extends Exception {

	String errorMessage;

	public ProductNotFoundException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	
	
}
