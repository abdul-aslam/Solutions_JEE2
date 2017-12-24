package com.htc.exercies;
import java.util.Scanner;

public class FirstExercise {
   
//	public FirstExercise() {
//		// TODO Auto-generated constructor stub
//	}
    public static void main(String args[]){
    	char gen = ' ';
    	
    	Trainee[] tr = new Trainee[3];
//    	//tr.age = 12;
//    	Scanner sc = new Scanner(System.in);
//    	System.out.println("Enter Trainee ID");
//    	tr.setTraineeId(sc.nextLine());
//    	System.out.println("Enter Trainee Name");
//    	tr.setTraineeName(sc.nextLine());
//    	System.out.println("Enter Trainee Age");
//    	tr.setAge(sc.nextInt());
//    	System.out.println("Enter Trainee email ID");
//    	tr.setEmail(sc.nextLine());
//    	System.out.println("Enter Trainee Contact Number");
//    	tr.setContactNo(sc.nextInt());	
//    	System.out.println("Enter Trainee Gender");
//    	tr.setGender(sc.next().charAt(0));
    	
    	tr[0] = new Trainee();
    	
    	tr[0].setTraineeId("1234");
    	tr[0].setTraineeName("Ravi sankar");
    	tr[0].setContactNo(12345);
    	tr[0].setEmail("ravisan_us@yahoo.com");
    	tr[0].setAge(40);
    	tr[0].setGender('M');
       	
    //	System.out.println("Get Trainee Object " + tr[0]);
    	tr[1] = new Trainee();
    	tr[1].setTraineeId("2345");
    	tr[1].setTraineeName("Ravi sankar");
    	tr[1].setContactNo(12345);
    	tr[1].setEmail("ravisan_us@yahoo.com");
    	tr[1].setAge(40);
    	tr[1].setGender('M');
    //	System.out.println("Get Trainee Next Object " + tr[1]);
    	tr[2] = new Trainee("3456","sankar",12345,"bravisankar@gmail.com",'F',4);
   // 	System.out.println("Get Trainee Next Object " + tr[2]);
    	

    	
    	Batch bat = new Batch("B1","12/20/2017","01/20/2018",tr);
    //	System.out.println("Batch #############" + bat.getTr());
    	
//    	for(Trainee t1:bat.getTr()){
//		System.out.println("Get Trainee Next Object " + t1);
//           }
    	Trainee g1 = bat.getTr("1234");
 //   	System.out.println("Get Trainee Next Object " + g1);
    	Trainee[] g2 = bat.getTr('M');
    	System.out.println("Trainees  +" + g2);
    	for(Trainee t2 : g2){
    		if (t2 != null){
    		System.out.println("Trainees  +" + t2);
    		
    	}
    	 //   	System.out.println("Get Trainee Next Object " + g1);
    }
}
}
