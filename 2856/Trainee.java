package com.htc.excercise1.entity;

public class Trainee {

	private int trineeId;
	private String gender;
	private String traineeName;
	private String contactNo;
	private int age;
	private String email;
	
	

	public int getTrineeId() {
		return trineeId;
	}

	public void setTrineeId(int trineeId) {
		this.trineeId = trineeId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public boolean equals(Object obj) {

		if (this.trineeId == ((Trainee) obj).getTrineeId()) {
			return true;
		}
		return false;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}