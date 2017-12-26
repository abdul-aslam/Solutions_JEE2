package com.htc.exercise1stwk.main;

import java.util.Date;

public class TraineeMain {

	public static void main(String[] args) throws TraineeNotFoundException {
		// TODO Auto-generated method stub
        
     Trainee[] trainees = {new Trainee(103,"Surya",248251000,"pat.sur@gmail.com","Male",20),
    		               new Trainee(104,"Deba",248251009,"pat.sur@gmail.com","Female",18)};
     
     Batch bch= new Batch("B01",new Date(),new Date(),trainees);
     
     bch.setTrainees(trainees);
     
     
     System.out.println("Batch: " + bch.getBatchCode());
     System.out.println("Start Date: " + bch.getStartDate());
     System.out.println("End Date: " + bch.getEndDate());
     trainees = bch.getTrainee(105);
     for (Trainee trainee : trainees) {
		System.out.println(trainee);
	}
     
     trainees = bch.getTrainee("Female"); 
     
     for (Trainee trainee : trainees) {
 		System.out.println(trainee);
 	}
               
   /*  for (int i = 0; i < 2; i++) {
    		
 		System.out.println(trainees[i].getAge()+"\t\t"+trainees[i].getContactNo()+"\t\t"+trainees[i].getEmailId()+
 				"\t\t"+trainees[i].getGender()+"\t\t"+trainees[i].getTraineeId()+"\t\t"+trainees[i].getTraineeName());
 	}*/
	}

}
