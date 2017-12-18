package com.htc.trainingexcerise.week1;
/* Week1 - Exercise question 1 */
import java.util.Date;

public class Batch {
private String batchCode;
private Date startDate;
private Date endDate;
public Trainee[] trainee;



public Trainee getTrainee(int traineeId) throws TraineeNotFoundException {
	
	Trainee trainee = new Trainee();
	return trainee;
}

public Trainee[] getTrainees(String gender)
{
	return trainee;
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

public void setTrainee(Trainee[] trainee) {
	this.trainee = trainee;
}


public static void main(String args[])
{
	try {
	
			//Calling getTrainee method
			//Calling getTrainees method
		
	}
	catch(Exception e)
	{
	e.printStackTrace();	
	}
}
}
