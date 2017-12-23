package com.htc.trainee;

public class TraineeNotFoundException extends Exception {
	
	private String exceptionMsg;
	
	public TraineeNotFoundException()
	{
		this.exceptionMsg =" Trainee Id is invalid";
	}
	public TraineeNotFoundException(String exceptionMsg) {
		
		this.exceptionMsg = exceptionMsg;
		
	}

	@Override
	public String toString() {
		return "TraineeNotFoundException [exceptionMsg=" + exceptionMsg + "]";
	}
	
	
	
	
	

}
