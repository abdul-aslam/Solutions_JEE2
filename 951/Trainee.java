package com.htc.exercies;

public class Trainee {
    public String traineeId;
    public String traineeName;
    public int contactNo;
    public String email;
    public char gender;
    public int age;
    
	public Trainee() {
		// TODO Auto-generated constructor stub
		traineeId = "";
	    traineeName = "";;
	    contactNo = 0;
	    email = "";;
	    gender = ' ';;
	    age = 0;
	    System.out.println("Default contrcutor");
	}

	public Trainee(String traineeId, String traineeName, int contactNo,
			String email, char gender, int age) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.contactNo = contactNo;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

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

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName="
				+ traineeName + ", contactNo=" + contactNo + ", email=" + email
				+ ", gender=" + gender + ", age=" + age + "]";
	}

}
