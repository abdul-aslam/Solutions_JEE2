package com.htc.trainingexcerise.week1;

/* Week1 - Exercise question 1 */
public class Trainee {

		
	public int traineeID;
	public String traineName;
	public long contactNo;
	public String emailId;
	public String gender;
	public int age;
	
	
	
	public Trainee() {
		super();
	}

	public Trainee(int traineeID, String traineName, long contactNo, String emailId, String gender, int age) {
		super();
		this.traineeID = traineeID;
		this.traineName = traineName;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.gender = gender;
		this.age = age;
	}

	public int getTraineeID() {
		return traineeID;
	}

	public void setTraineeID(int traineeID) {
		this.traineeID = traineeID;
	}

	public String getTraineName() {
		return traineName;
	}

	public void setTraineName(String traineName) {
		this.traineName = traineName;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
