package com.htc.exc.one;

import java.util.Date;
import java.util.Scanner;

public class OneMainCall {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Datest = "2017/12/01";
		String Dateend = "2018/02/20";
		boolean flag = false;
		
		Trainee tr1 = new Trainee(1000, "Trainee1", "111-111-1111", "Trainee1@gmail.com", "F", 30);
		Trainee tr2 = new Trainee(1001, "Trainee2", "222-222-2222", "Trainee2@gmail.com", "M", 35);
		Trainee tr3 = new Trainee(1002, "Trainee3", "333-333-3333", "Trainee3@gmail.com", "M", 35);
		Trainee tr4 = new Trainee(1003, "Trainee4", "444-444-4444", "Trainee4@gmail.com", "F", 40);
		Trainee tr5 = new Trainee(1004, "Trainee5", "555-555-5555", "Trainee5@gmail.com", "M", 30);

		Trainee[] tr = {tr1,tr2,tr3,tr4,tr5};
		Trainee[] trnew;
		
		Batch b = new Batch("B001",Datest,Dateend,tr);
		
		Scanner sc = new Scanner(System.in);
		int traineeId;
		String gender;
		
		System.out.println("Enter the Tranee Id to search");
		traineeId = sc.nextInt();
		
		System.out.println("Enter (M/F) to get the list of trainees in particular gender");
		gender = sc.next();
		sc.close();	

		try {
			if (b.getTrainee(traineeId) == null) {
				throw new MyException(traineeId);
			}			
			System.out.println("Trainee Details: " + b.getTrainee(traineeId));
		 	}
		catch(MyException e){
			System.out.println(e);
			
		}
		
		
		trnew = b.getTrainee(gender);
		
		for(Trainee train:trnew) {
			if (train != null) {
		      System.out.println(train);
		      flag = true;
			}
		}
		
		if(!flag) {
			System.out.println("Coldnt find a trainee for the entered gender");
		}
		

	}

}
