package com.htc.Exercise1.entity;

public class TraineeNotFoundException extends Exception {
	
	String msg;
	
	public TraineeNotFoundException() {
		this.msg = "Trainee not found in this batch";
	}
	
	public String toString() {
		return "Trainee Not Found Exception ["+msg+"]";
	}

}
