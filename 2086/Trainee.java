package com.htc.trainingexcerise.week1;

/* Week1 - Exercise question 1 */
public class Trainee {

		
	private int traineeID;
	private String traineName;
	private long contactNo;
	private String emailId;
	private String gender;
	private int age;
	
	
	
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (int) (contactNo ^ (contactNo >>> 32));
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((traineName == null) ? 0 : traineName.hashCode());
		result = prime * result + traineeID;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainee other = (Trainee) obj;
		if (age != other.age)
			return false;
		if (contactNo != other.contactNo)
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (traineName == null) {
			if (other.traineName != null)
				return false;
		} else if (!traineName.equals(other.traineName))
			return false;
		if (traineeID != other.traineeID)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Trainee [traineeID=" + traineeID + ", traineName=" + traineName + ", contactNo=" + contactNo
				+ ", emailId=" + emailId + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
	
}
