package com.htc.exercies;

import java.util.Arrays;

public class Batch {
   public String batchCode;
   public String startDate;
   public String endDate;
   Trainee[] tr;
   
   public Batch() {
		// TODO Auto-generated constructor stub
	}

	public Batch(String batchCode, String startDate, String endDate, Trainee[] tr) {
	super();
	this.batchCode = batchCode;
	this.startDate = startDate;
	this.endDate = endDate;
	this.tr = tr;
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

	public Trainee[] getTr() {
		return tr;
	}
	/*
	 *  Overriding the method to get trainee information
	 *  based on traineeId
	 */
	public Trainee getTr(String traineeId){
		for(Trainee trs : tr){
	
			if (trs.getTraineeId() == traineeId){
				return trs;
			}
			
		}
		return null;
	}
	/*
	 *  Overriding the method to get all trainees based on Gender
	 */
	public Trainee[] getTr(char gender){
		Trainee[] arr = new Trainee[3];
		int i = 0;
		for(Trainee trs : tr){
	
			if (trs.getGender() == gender){
				arr[i] = trs;
				i++;
				
				
			}
			
		}
		return arr;
	}
	public void setTr(Trainee[] tr) {
		this.tr = tr;
	}

	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", tr=" + Arrays.toString(tr) + "]";
	}
   
	
}
