package com.htc.Asgmt1.entity;

//Made by Ernest Paulino

// Trainee Class
public class Trainee {

	private String traineeId;//instance variable
	private String traineeName;//instance variable
	private String traineeContactNo;//instance variable
	private String traineeEmail;//instance variable
	private String traineeGender;//instance variable
	private int    traineeAge;//instance variable
	
	// Default constructor
	public Trainee() {
	}
	
	// Parameterized constructor
	public Trainee(String traineeId, String traineeName, String traineeContactNo, String traineeEmail,
			String traineeGender, int traineeAge) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeContactNo = traineeContactNo;
		this.traineeEmail = traineeEmail;
		this.traineeGender = traineeGender;
		this.traineeAge = traineeAge;
	}

	// Getter and Setter methods  
	public String getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(String traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getTraineeContactNo() {
		return traineeContactNo;
	}

	public void setTraineeContactNo(String traineeContactNo) {
		this.traineeContactNo = traineeContactNo;
	}

	public String getTraineeEmail() {
		return traineeEmail;
	}

	public void setTraineeEmail(String traineeEmail) {
		this.traineeEmail = traineeEmail;
	}

	public String getTraineeGender() {
		return traineeGender;
	}

	public void setTraineeGender(String traineeGender) {
		this.traineeGender = traineeGender;
	}

	public int getTraineeAge() {
		return traineeAge;
	}

	public void setTraineeAge(int traineeAge) {
		this.traineeAge = traineeAge;
	}
	
	

}
