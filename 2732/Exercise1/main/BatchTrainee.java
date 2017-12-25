package com.htc.Exercise1.main;

import java.util.Scanner;

import com.htc.Exercise1.entity.Batch;
import com.htc.Exercise1.entity.Trainee;
import com.htc.Exercise1.entity.TraineeNotFoundException;

public class BatchTrainee {
	public static void main(String[] args) {
		
		Trainee[] newTrainee = new Trainee[3];
		newTrainee[0] = new Trainee(10,"Abc","309309309","Abc@gmail.com","M",21);
		newTrainee[1] = new Trainee(11,"Cbc","329309309","Cbc@gmail.com","F",20);
		newTrainee[2] = new Trainee(12,"Dbc","319309309","Dbc@gmail.com","M",22);
		
		Batch batch = new Batch();
		
		batch.setBatchCode("B123");
		batch.setStartDate("2017-12-21");
		batch.setEndDate("2018-12-20");
		batch.setTrainee(newTrainee);
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the Trainee Id to search for");
		int id = s.nextInt();
		try {
			System.out.println("Trainee Details: "+batch.getTrainee(id));
		} catch (TraineeNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		
		System.out.println("Please enter the gender to get records for");
		String gend = s.next();
		Trainee[] traineeArr = batch.getTrainees(gend);
		if (traineeArr.length > 0) {
			for (int i=0;i<traineeArr.length;i++) {
				System.out.println("Here are the records: "+traineeArr[i]);
			}	
		}
		else {
			System.out.println("No records for trainees of that gender");
		}
		
	}

}
