package com.htc.trainingexcerise.week1;
import java.util.Arrays;
/* Week1 - Exercise question 1 */
import java.util.Date;
import java.util.Scanner;

public class Batch {
private String batchCode;
private Date startDate;
private Date endDate;
private Trainee[] trainee;//changed from public to private


public Batch() {
	super();
	// TODO Auto-generated constructor stub
}


public Batch(String batchCode, Date startDate, Date endDate, Trainee[] trainee) {
	super();
	this.batchCode = batchCode;
	this.startDate = startDate;
	this.endDate = endDate;
	this.trainee = trainee;
}

public Trainee getTrainee(int traineeId) throws TraineeNotFoundException {
	
	Trainee traineeoutput = null;
	boolean isPresent = false;
	for(Trainee trainees : trainee) {
		
		if(trainees.getTraineeID()==traineeId) {
			traineeoutput=trainees;
			isPresent = true;
		}
		//321
		}
	if(!isPresent) {
		throw new TraineeNotFoundException("Trainee ID not found");
	}
	
	return traineeoutput;
	
}

public Trainee[] getTrainees(String gender) throws TraineeNotFoundException
{
	
	boolean isPresent = false;
	Batch trBatch=new Batch();
	Trainee[] traineeDetails= new Trainee[trainee.length];
	
	for(int i=0;i<trainee.length;i++) {
		if(trainee[i].getGender().equalsIgnoreCase(gender)) {
			
			Trainee bt = new Trainee(trainee[i].getTraineeID(),trainee[i].getTraineName(),trainee[i].getContactNo(),
					trainee[i].getEmailId(),trainee[i].getGender(),trainee[i].getAge());
			traineeDetails[i]=  bt;
			isPresent = true;
			System.out.println(bt.toString());
			System.out.println(traineeDetails);
		}
				
	}
	if(isPresent) {
		trBatch.setTrainee(traineeDetails);	
		return traineeDetails;
	}
	if(!isPresent) {
		throw new TraineeNotFoundException("Trainee ID not found");
	}
	System.out.println(trBatch.getTrainee());
	return null;
}


@Override
public String toString() {
	return "Batch [batchCode=" + batchCode + ", startDate=" + startDate + ", endDate=" + endDate + ", trainee="
			+ Arrays.toString(trainee) + "]";
}


public Trainee[] getTrainee() {
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
	
		Batch batch=new Batch("BMS10",new Date(),new Date(),null);
		
		Trainee[] trainee = {new Trainee(101,"John",300500600,"Test@htc.com","Male",29),
							 new Trainee(102,"Jack",300500700,"Demo@htc.com","Male",31),
							 new Trainee(103,"Cindy",300500800,"Class@htc.com","Female",35)};
		
		batch.setTrainee(trainee);
		
				
			//Calling getTrainee method
		
		Scanner sStr = new Scanner(System.in);
		System.out.println("Please enter a Trainee Id");
		
		int traineeId = sStr.nextInt();
		System.out.println(batch.getTrainee(traineeId));
		
		
		
			//Calling getTrainees method
		
		System.out.println("Please enter gender");
		
		String gender = sStr.next();
		batch.getTrainees(gender).toString();
		
	}
	catch(Exception e)
	{
	e.printStackTrace();	
	}
}
}
