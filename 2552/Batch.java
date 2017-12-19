package com.htc.cjavaexercises1.entity;

public class Batch {

	  String batchCode; 
	  String startdate; 
	  String enddate; 
	  Trainee[] tran=new Trainee [3]; 
	
	  /* Default constructor */
	  public Batch() {
		  tran[0]=new Trainee(121,"James","2431232200","xyz@yahoo.com","male",30);
		  tran[1]=new Trainee(125,"Mary","2531233300","abc@yahoo.com","female",25);
		  tran[2]=new Trainee(124,"Adam","2631233300","scr@yahoo.com","male",35);
		  
		  int i=0,j=1;
			for (Trainee t : tran) {
				System.out.println("Trainee:"+j);
				System.out.println("--------");
				System.out.println(tran[i].getTraineeId());
				System.out.println(tran[i].getTraineeName());
				System.out.println(tran[i].getContactNo());
				System.out.println(tran[i].getEmail());
				System.out.println(tran[i].getGender());
				System.out.println(tran[i].getAge());
				i++;
				j++;
			}
	    }
	  
	  /* Overloading with int */
	  public Trainee getTrainee(int traineeId) {
		  int i=0; 
		  for (Trainee t : tran) {
			   if (tran[i].getTraineeId()==traineeId) 
			 	  break; 
			   i++;
		  }
		  return tran[i];
	  }
	  
	  /* Overloading with Srint */
	  public Trainee[] getTrainee(String gender) {
		  int i=0,j=0; 
		  Trainee[] tran1=new Trainee [3];
		  tran1[0]=new Trainee();
		  tran1[1]=new Trainee();
		  tran1[2]=new Trainee();
		  for (Trainee y : tran) {
			   if (tran[i].getGender()==gender) 
			   {
			 /*	  tran1[j]=new Trainee(); */
			 	  tran1[j]=tran[i];
			 	  j++;
			   }
			   i++;
		  }
		  return tran1;
	  }
	  
	  /* Main method */
	  public static void main(String[] args) {
		  Batch b=new Batch();
		  System.out.println("Get details of traineeId:121");
		  System.out.println("----------------------------");
		  Trainee temp = new Trainee();
		  temp=b.getTrainee(121);
		  
		  System.out.println(temp.getTraineeId());
		  System.out.println(temp.getTraineeName());
		  System.out.println(temp.getContactNo());
		  System.out.println(temp.getEmail());
		  System.out.println(temp.getGender());
		  System.out.println(temp.getAge());
		  
		  System.out.println("Get trainee details of gender=male");
		  System.out.println("----------------------------------");
 		  Trainee[] tran2=new Trainee [3];
  	/*	  tran2[0]=new Trainee();
		  tran2[1]=new Trainee();
		  tran2[2]=new Trainee();*/
		  tran2=b.getTrainee("male");
		  
		  int i=0;
			for (Trainee z : tran2) {
				
				if (tran2[i].getGender() != null) {
				System.out.println("gender "+i+1);
				System.out.println(tran2[i].getTraineeId());
				System.out.println(tran2[i].getTraineeName());
				System.out.println(tran2[i].getContactNo());
				System.out.println(tran2[i].getEmail());
				System.out.println(tran2[i].getGender());
				System.out.println(tran2[i].getAge());
				i++;}
			}
						
	  } 
	  	 
}
		
