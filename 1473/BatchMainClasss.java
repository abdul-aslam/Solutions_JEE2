package com.htc.trainee;

import java.util.Scanner;

public class BatchMainClasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int traineeId = 0;
		String gender="";
		
		
		 // Setting the values for the Trainee class fields
		 Trainee[]  traineeInput  = { new Trainee(100,"Pradeep","12345","e@gmail.com","M",30),
	                                                    new Trainee(200,"Anu","2345","a@gmail.com","F",18),
	                                                    new Trainee(300,"Karthi","6789","k@gmail.com","F",25),
	                                                    new Trainee(400,"Nikhil","37845","n@gmail.com","M",35)
	                                                  };
		 
	     // Crearing a new instance object for Trainee
		 Trainee[] genderInfo = new Trainee[traineeInput.length]; 
		
		//Create a instance for the object Batch
	   Batch accBatch = new Batch();
	     
	  
	   //Using the Setter message set the necessary values to batch class
	   accBatch.setBatchCode("B1");
	   accBatch.setStartDate("12/01/2017");
	   accBatch.setEndDate("12/31/2017");
	   accBatch.setTrainees(traineeInput);
	         
		 
	   try
	   {
		 //Getting the input from user
		   Scanner inputReader = new Scanner(System.in);
		   
		   System.out.println("Enter the Trainee Id");
		   traineeId  = Integer.parseInt(inputReader.next());
		   
		   System.out.println("Trainee Id                   :"+accBatch.getTrainee(traineeId).getTraineeId());
		   System.out.println("Trainee Name             :"+accBatch.getTrainee(traineeId).getTraineeName());
		   System.out.println("Trainee Contact No    :"+accBatch.getTrainee(traineeId).getContactNo());
		   System.out.println("Trainee Gender          :"+accBatch.getTrainee(traineeId).getGender());
		   System.out.println("Trainee  Age               :"+accBatch.getTrainee(traineeId).getAge());
		   
		   
		   System.out.println("Enter the Gender");
		   gender = inputReader.next();
		   genderInfo = accBatch.getTrainees(gender);
		  	
			for(int i = 0 ; i < genderInfo.length ; i++)
			{
				System.out.println(genderInfo[i]);
			} 
	   }
	   catch(NullPointerException e)
	   {
		  System.out.println("Incorrect gender is entered"); 
	   }
	   catch(TraineeNotFoundException ex)
	   {
	               System.out.println(ex.getTraineeException());
	   }
	   catch(Exception e)
	   {
		   System.out.println("Expection has raised. Please check the program logic");
	   }
	  
		

	}

}
