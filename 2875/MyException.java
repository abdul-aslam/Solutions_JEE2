package com.htc.exc.one;

public class MyException extends Exception{

	private int trainId; 
	MyException(int trainId){
		this.trainId = trainId;
	}
	@Override
	public String toString() {
		return "Trainee details not available for the id : " + trainId;
	}
	
	
}
