package com.batch;

import java.util.ArrayList;

public class Batch {
	private String batchCode;
	private String startDate;
	private String endDate;
	private Trainee[] trainees;
	

	
		 public Batch(String string, String string2, String string3, Object object) {
		// TODO Auto-generated constructor stub
	}
		public String getBatchCode() {
		return batchCode;
	}
	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Trainee[] getTrainees() {
		return trainees;
	}
	public void setTrainees(Trainee[] trainees) {
		this.trainees = trainees;
	}
		
	
	public Trainee getTrainee(int traineeId) {
		
		Trainee retrunTrainee=null;
		
		for (Trainee i:trainees) {
		if(	i.getTraineeID()== traineeId) {
		 System.out.println(i.getTraineeName()+i.getAge()+i.getContactNo()+i.getEmail()+i.getGender()+i.getTraineeID());
		 retrunTrainee = i; 
		}
		else {
			continue; 
		}	
		 	
		}		
	     return retrunTrainee;
	
		
	}
		 public Trainee[] getTrainee(String gender) {
			 Trainee[] retrunTrainee= new Trainee[4]; 
				
				for (Trainee i:trainees) {  
					
				if(	i.getGender()== gender) { 
					int count=0;
				 System.out.println(i.getTraineeName()+i.getAge()+i.getContactNo()+i.getEmail()+i.getGender()+i.getTraineeID());
				 retrunTrainee[count] = i;
				 count++;
				}
				else {
					continue; 
				}	
				 
				} 
				return retrunTrainee;
		 }
		
		 public static void main(String[] args) {

			Batch b=new Batch("HJ1","12-11-2017","01-24-2018", null); 
			
			Trainee javaTrainees[] = {new Trainee (123, "Murali","000-000-0000","nmk_2k@yahoo.com","M",44), 
										new Trainee (345, "Prasanthi","000-000-0000","nmk_2k@yahoo.com","F",37),
										new Trainee (678, "Suhaas","000-000-0000","nmk_2k@yahoo.com","M",13),
										new Trainee (912, "Kamalini","000-000-0000","nmk_2k@yahoo.com","F",02)
			};
			
			b.setTrainees(javaTrainees);
			//if we provide TraineeID returns Trainee object otherwise throws null pointer exception 
			Trainee selectedTrainee = b.getTrainee(123);
			System.out.println("Selected Trinee " +selectedTrainee.getTraineeName());
			
			//Overloaded getTrainee Method 
			Trainee[]  genderStrainees=b.getTrainee("M");
			
		}
		
	} 

