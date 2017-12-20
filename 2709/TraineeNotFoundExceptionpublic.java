package assignment;

public class TraineeNotFoundExceptionpublic extends Exception {
	
	 String errorMessage;
	 TraineeNotFoundExceptionpublic(String errorMessage) {
	      this.errorMessage = errorMessage;
	   } 
	  
	   @Override
	   public String toString() { 
	      return ("Error !!!!!!   "+ errorMessage);
	   }

}
