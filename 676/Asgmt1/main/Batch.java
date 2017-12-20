package com.htc.Asgmt1.main;

//Made by Ernest Paulino

import com.htc.Asgmt1.entity.Trainee;
import com.htc.Asgmt1.main.TraineeNotFoundException;

public class Batch {
	
	static Trainee[] train   = new Trainee[2];
	static Trainee[] myTrain = new Trainee[2];
	
	public static void main(String[] args) {
		
	String batchCode;//instance variable
	String batchStartDate;//instance variable
	String batchEndDate;//instance variable
				
	// Loading Data
	train[0] = new Trainee("0",
	                       "Marlon Brando",
	                       "248-786-2500",
	                       "Marlon.Brando@htcinc.com",
	                       "Male",                
                            55);
	
	train[1] = new Trainee("1",
                           "Charlton Heston",
                           "248-786-2500",
                           "Charlton.Heston@htcinc.com",
                           "Male",                
                            60);
	
	Batch mine =new Batch();
	
	Trainee singleTrain = new Trainee();
	
	try {
		singleTrain = mine.getTrainee(0);
		
		System.out.println(singleTrain.getTraineeId());
		System.out.println(singleTrain.getTraineeName());
		System.out.println(singleTrain.getTraineeContactNo());
		System.out.println(singleTrain.getTraineeEmail());
		System.out.println(singleTrain.getTraineeGender());
		System.out.println(singleTrain.getTraineeAge());
		
	} catch (TraineeNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("-------------------------");
	
	try {
		singleTrain = mine.getTrainee(10);
		
		System.out.println(singleTrain.getTraineeId());
		System.out.println(singleTrain.getTraineeName());
		System.out.println(singleTrain.getTraineeContactNo());
		System.out.println(singleTrain.getTraineeEmail());
		System.out.println(singleTrain.getTraineeGender());
		System.out.println(singleTrain.getTraineeAge());
				
	} catch (TraineeNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("-------------------------");
	
	myTrain = mine.getTrainee("Male");
	
	for (int i = 0; i < myTrain.length; i++) {
		System.out.println(myTrain[i].getTraineeId());
		System.out.println(myTrain[i].getTraineeName());
		System.out.println(myTrain[i].getTraineeContactNo());
		System.out.println(myTrain[i].getTraineeEmail());
		System.out.println(myTrain[i].getTraineeGender());
		System.out.println(myTrain[i].getTraineeAge());
	}
	
	}
	
	// Overload method
	public Trainee[] getTrainee(String gender) {
		int j=0;
		
		Trainee[] tr = new Trainee[2];
		for(int i=0;i < train.length ; i++)
		{
			if (train[i].getTraineeGender()==(gender)) {
				tr[j] = train[i];
				j++;
			}
		}
		return tr;
	}
	
	// Overload method
	public Trainee getTrainee(int traineeID) throws TraineeNotFoundException {
		boolean foundTrainee = false;
		
		Trainee tr = new Trainee();
		
		for(int i=0;i < 2 ; i++)
		{
			if(Integer.parseInt(train[i].getTraineeId())==traineeID ) {
				tr = train[i];
				foundTrainee = true;
			}
		}
		if (foundTrainee == true) 
			return tr;
		else
			throw new TraineeNotFoundException("Trainee not found.");
	}
	
	
}
