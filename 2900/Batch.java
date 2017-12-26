package com.htc.exercise1stwk.main;

import java.util.Arrays;
import java.util.Date;

public class Batch{
	
	private String batchCode;
	private Date startDate;
	private Date endDate;
	private Trainee[] trainees;
		
	
	public Batch(String batchCode, Date startDate, Date endDate, Trainee[] trainees) {
		super();
		this.batchCode = batchCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.trainees = trainees;
	}

		
	public Trainee[] getTrainees(){
		return trainees;
	}
	public void setTrainees(Trainee[] trainees) {
		this.trainees = trainees;
	}
	
	
	public String getBatchCode() {
		return batchCode;
	}
	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Trainee[] getTrainee(String gender) {
		
		return trainees;
	}
	public Trainee[] getTrainee(int traineeId)throws TraineeNotFoundException {
		
		int trnid;
		trnid=traineeId;
		
		for (int i=0;i<2;i++) {
			if (trainees[i].getTraineeId() == trnid) {
				return trainees;
			}
			else
				throw new TraineeNotFoundException("Trainee not found");
		}
		return null;
					
	   }
	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startDate=" + startDate + ", endDate=" + endDate + ", trainees="
				+ Arrays.toString(trainees) + "]";
	}
  }



