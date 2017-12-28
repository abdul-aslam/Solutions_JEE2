package com.htc.trainingexcerise.week1;

public class TraineeNotFoundException extends Exception {
	String errormsg ;

	public TraineeNotFoundException() {
		this.errormsg = "Trainee not found.";
	}

	public TraineeNotFoundException(String errormsg) {
		super();
		this.errormsg = errormsg;
	}
	
	
}
