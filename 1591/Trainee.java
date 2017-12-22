package com.assignment1;

public class Trainee {

	private int trineeId;
	private String gender;

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

}
