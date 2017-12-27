package assignment2;

public class BookNotFoundException extends Exception {

	String errorMessage;

	public BookNotFoundException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	
}
