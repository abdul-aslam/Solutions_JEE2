package com.htc.Exercise1.entity;

import java.util.Date;

public class Batch {

	private String batchCode;
	private String startDate;
	private String endDate;
	Trainee[] trainee;
	
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batch(String batchCode, String startDate, String endDate, Trainee[] trainee) {
		super();
		this.batchCode = batchCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.trainee = trainee;
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

	public Trainee[] getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee[] trainee) {
		this.trainee = trainee;
	}
	
	
	public Trainee getTrainee(int traineeId) throws TraineeNotFoundException {
		
		boolean flag = false;
		int pos = 0; 
		for (int i=0;i<trainee.length;i++) {
			if (trainee[i].getTraineeId() == traineeId) {
				pos = i;
				flag = true; 
			}
		}
	 	if (flag) {
			return trainee[pos];
		} 
	 	else {
	 		throw new TraineeNotFoundException();
	 	}
		
	}
	
	public Trainee[] getTrainees(String sex) {
		
		int count = 0;
		for (int i = 0; i < trainee.length; i++) {
			if (trainee[i].getGender().equalsIgnoreCase(sex)) {
				count++;
			}
		}
		
		if (count == 0) {
			return null;
		}
		else {
			Trainee[] gTrainee = new Trainee[count];
			int j = 0;
			for (int i = 0; i < trainee.length; i++) {
				if (trainee[i].getGender().equalsIgnoreCase(sex)) {
					gTrainee[j] = trainee[i];
					j++;
				}
			}
			return gTrainee;
	
		}
	}	
	
}
