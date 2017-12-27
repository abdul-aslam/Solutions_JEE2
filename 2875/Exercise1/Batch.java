package com.htc.exc.one;

import java.util.Arrays;
import java.util.Date;

public class Batch extends Trainee {
	
	private String batchCode;
	private String startdate;
	private String enddate;
	private int i = 0;
	Trainee[] trainee = new Trainee[5];
	Trainee[] trainee1 = new Trainee[5];

	public Batch() {
		super();
	}


	public Batch(String batchCode, String startdate, String enddate) {
		super();
		this.batchCode = batchCode;
		this.startdate = startdate;
		this.enddate = enddate;
	}

	
	
	public Batch(String batchCode, String startdate, String enddate, Trainee[] trainee) {
		super();
		this.batchCode = batchCode;
		this.startdate = startdate;
		this.enddate = enddate;
		this.trainee = trainee;
	}

	public String getBatchCode() {
		return batchCode;
	}


	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}


	public String getStartdate() {
		return startdate;
	}


	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}


	public String getEnddate() {
		return enddate;
	}


	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batchCode == null) ? 0 : batchCode.hashCode());
		result = prime * result + ((enddate == null) ? 0 : enddate.hashCode());
		result = prime * result + ((startdate == null) ? 0 : startdate.hashCode());
		result = prime * result + Arrays.hashCode(trainee);
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
		Batch other = (Batch) obj;
		if (batchCode == null) {
			if (other.batchCode != null)
				return false;
		} else if (!batchCode.equals(other.batchCode))
			return false;
		if (enddate == null) {
			if (other.enddate != null)
				return false;
		} else if (!enddate.equals(other.enddate))
			return false;
		if (startdate == null) {
			if (other.startdate != null)
				return false;
		} else if (!startdate.equals(other.startdate))
			return false;
		if (!Arrays.equals(trainee, other.trainee))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startdate=" + startdate + ", enddate=" + enddate + ", trainee="
				+ Arrays.toString(trainee) + "]";
	}
	
	
	public Trainee getTrainee(int traineeId) {
		for (Trainee tr: trainee) {
			if (tr.getTraineeId() == traineeId) {
				return tr;
			}
		}
		return null;
	}



	public Trainee[] getTrainee(String gender) {
		for (Trainee tr: trainee) {
			if (tr.getGender().equals(gender)) {
				
				trainee1[i] = tr;
				i++;
			}
		}
		return trainee1;
	}

}
