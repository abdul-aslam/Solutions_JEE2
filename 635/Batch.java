package com.htc.hw1;
import java.util.Arrays;
import java.util.Date;
import java.io.*;
import com.htc.hw1.Trainee;

public class Batch {

	private int batchCode;
	private Date startdate;
	private Date enddate;
	private Trainee [] trainees;

	public static void main(String [] Args) {
	
		Batch b = new Batch();
		b.batchCode = 1001;
		
		Trainee trainee1 = new Trainee(501, "First One", 101310, 
								"first@one.com", "M", 30);
		
		Trainee trainee2 = new Trainee(502, "Second One", 101310, 
				"second@one.com", "F", 35);
		
		b.trainees = new Trainee [2];
		b.trainees[0] = trainee1;
		b.trainees[1] = trainee2;
		
		try {
			System.out.println(b.getTrainee(501));
//			System.out.println(b.getTrainee(503));

		} catch(TraineeNotFoundException e) {
			System.err.println("TraineeNotFoundException: " + e);
		} finally {
			b.trainees = b.getTrainees( "F"); 
			System.out.println(b);
		}
		
	}
	
	public Trainee getTrainee(int traineeId) throws TraineeNotFoundException {
	
//		int i = trainees.length;
		for (Trainee trainee: trainees) {
			if (trainee.getTraineeId()==traineeId) {
				return trainee;
			}
		}
		throw new TraineeNotFoundException();
		
	}
		
	
	public Trainee[] getTrainees(String gender) {
		int i = 0;
		Trainee[] genderTrainees = new Trainee[trainees.length];
		
		for (Trainee trainee: trainees) {
			if (trainee.getGender().equals(gender)) {
				genderTrainees[i++] = trainee;
			}
		}
		if (i> 0) {
			return genderTrainees;
		}
		return null;
		
		
	}
	public int getBatchCode() {
		return batchCode;
	}
	public void setBatchCode(int batchCode) {
		this.batchCode = batchCode;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public Trainee[] getTrainees() {
		return trainees;
	}
	public void setTrainees(Trainee[] trainees) {
		this.trainees = trainees;
	}
	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startdate=" + startdate + ", enddate=" + enddate + ", Trainees="
				+ Arrays.toString(trainees) + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(trainees);
		result = prime * result + batchCode;
		result = prime * result + ((enddate == null) ? 0 : enddate.hashCode());
		result = prime * result + ((startdate == null) ? 0 : startdate.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batch other = (Batch) obj;
		if (!Arrays.equals(trainees, other.trainees))
			return false;
		if (batchCode != other.batchCode)
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
		return true;
	}
}
