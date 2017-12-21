package com.batch;

public class Trainee {
	private int traineeID;
	private String traineeName;
	private String contactNo;
	private String email;
	private String gender;
	private int age;
	
	
	public Trainee(int traineeID, String string2, String string3, String string4, String string5, int i) {
		this.traineeID = traineeID;
		this.traineeName= string2;
		this.contactNo=string3;
		this.email=string4;
		this.gender=string5;
		this.age=i;
		
				
		
	
	}
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	public Trainee(int string) {
		this.traineeID = string;
	}
	public int getTraineeID() {
		return traineeID;
	}
	public void setTraineeID(int traineeID) {
		this.traineeID = traineeID;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
