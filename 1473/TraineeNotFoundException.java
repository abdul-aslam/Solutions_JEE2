package com.htc.trainee;

public class TraineeNotFoundException extends Exception {
	
	private String exceptionMsg;
	
	public TraineeNotFoundException(String exceptionMsg) {
		
		this.exceptionMsg = exceptionMsg;
		
	}
	
	public String getTraineeException()
	{
		return this.exceptionMsg;
	}
	
	
	

}
