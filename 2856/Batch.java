package com.htc.excercise1.entity;

import java.util.Date;

public class Batch {

	private String batchCode;
	private Trainee[] trainees;
	private Date startdate;
	
	public Date getStartdate() {
		return startdate;
	}



	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}



	public Date getEnddate() {
		return enddate;
	}



	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}



	private Date enddate;
	
	
	
	public Batch() {

		trainees = new Trainee[3];

		Trainee trainee1 = new Trainee();
		trainee1.setGender("M");
		trainee1.setTraineeName("kishorebabu");
		trainee1.setTrineeId(1);

		Trainee trainee2 = new Trainee();
		trainee2.setGender("F");
		trainee2.setTraineeName("suji");
		trainee2.setTrineeId(2);
		
		Trainee trainee3 = new Trainee();
		trainee3.setGender("F");
		trainee3.setTraineeName("sai");
		trainee3.setTrineeId(3);

		trainees[0] = trainee1;
		trainees[1] = trainee2;
		trainees[2] = trainee3;

	}

	
	
  //@overLoading takes TraineeIds
	public Trainee getTrainee(int traineeId) throws TraineeNotFoundException {

		for (Trainee trainee : trainees) {

			if (trainee.getTrineeId() == traineeId) {
				return trainee;
			}

		}
		throw new TraineeNotFoundException("no id found");

	}

	  //@overLoading takes gender
	public Trainee[] getTrainee(String gender)  {

		Trainee[] filteredTrainees = new Trainee[2];

		int i = 0;
		for (Trainee trainee : trainees) {

			if (trainee.getGender().equalsIgnoreCase(gender)) {
				filteredTrainees[i] = trainee;
				i++;
				//System.out.println("trainee valu"+trainee);
			}
		}
		return filteredTrainees;
	}
	
	public static void main(String[] str ) throws TraineeNotFoundException  {
		
		Batch batch = new Batch();
		
		
		Trainee trainee = batch.getTrainee(1);	
		System.out.println("------Selected Trainee------");
		System.out.println("Trinnee Id : " + trainee.getTrineeId());
		System.out.println("Trinnee Name :" + trainee.getTraineeName());
		System.out.println("Trinnee Gender : " + trainee.getGender());
		
				
		Trainee[] traineegender = new Trainee[2];
		traineegender = batch.getTrainee("F");
		
		
		int i=0;
		System.out.println("------Female Traineees in this Batch---------- ");
		
		for (Trainee z : traineegender)
		{
			if (traineegender[i].getGender() != null) {
			System.out.println("------Record  "+(i+1));			
			System.out.println("Trainee Id:"+ traineegender[i].getTrineeId());
			System.out.println("Trainee Name:"+ traineegender[i].getTraineeName());
			System.out.println("Trainee Gender:"+traineegender[i].getGender());
			
			i++;}				
		}
	}

	public String getBatchCode() {
		return batchCode;
	}



	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}
}