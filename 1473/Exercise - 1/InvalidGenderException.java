package com.htc.trainee;

public class InvalidGenderException extends Exception {
	
	private String genderExcepMsg;
	
	public InvalidGenderException()
	{
		this.genderExcepMsg = " Invalid Gender Entered";
	}

	public InvalidGenderException(String genderExcepMsg) {
		super();
		this.genderExcepMsg = genderExcepMsg;
	}

	@Override
	public String toString() {
		return "InvalidGenderException [genderExcepMsg=" + genderExcepMsg + "]";
	}
	
	

}
