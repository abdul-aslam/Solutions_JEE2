package htc.package1;

import java.util.Arrays;
import java.util.Date;
import java.lang.Object;

public class Batch {
	private int batchCode;
	private String startDate;
	private String endDate;
	private Trainee[] trainees;
	public Batch(int batchCode, String startDate, String endDate, Trainee[] trainees) {
		super();
		this.batchCode = batchCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.trainees = trainees;
	}
	public int getBatchCode() {
		return batchCode;
	}
	public void setBatchCode(int batchCode) {
		this.batchCode = batchCode;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Trainee[] getTrainees() {
		return trainees;
	}
	public void setTrainees(Trainee[] trainees) {
		this.trainees = trainees;
	}
	
	public Trainee getTrainee(int traineeId) {
		for (int i=0; i<trainees.length; i++) {
			if(trainees[i].getTraineeId()==traineeId) 
					return trainees[i];
			}
		      return null;
				}
	public Trainee[] getTrainees(char gender) {
		Trainee[] genderList = new Trainee[trainees.length];
		int j = 0;
		for (int i=0; i<trainees.length; i++) {
			if(trainees[i].getGender()==gender) {
					genderList[j] = trainees[i];
					j++;
			}
			}
		      return genderList;
				}
	
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + batchCode;
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + Arrays.hashCode(trainees);
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
		if (batchCode != other.batchCode)
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (!Arrays.equals(trainees, other.trainees))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startDate=" + startDate + ", endDate=" + endDate + ", trainees="
				+ Arrays.toString(trainees) + ", getBatchCode()=" + getBatchCode() + ", getStartDate()="
				+ getStartDate() + ", getEndDate()=" + getEndDate() + ", getTrainees()="
				+ Arrays.toString(getTrainees()) + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
	

	public static void main(String[] args) {
		Trainee T1 = new Trainee(0001,"John","3093100001","john@test.com",'M',21);
		Trainee T2 = new Trainee(0002,"Smith","3093100002","smith@test.com",'M',22);
		Trainee T3 = new Trainee(0003,"Linda","3093100003","linda@test.com",'F',23);
		Trainee T4 = new Trainee(0004,"Joe","3093100004","joe@test.com",'M',24);
		Trainee[] Trainees= {T1,T2,T3,T4};
		
		Batch batch1 = new Batch(1000,"01/01/2017","06/01/2017",Trainees);
		System.out.println("Get Trainee:");
		System.out.println(batch1.getTrainee(0002));
		System.out.println("Get Trainees:");
		Trainee[] b1Trn = batch1.getTrainees('M');
	    for (int i=0; i<b1Trn.length && b1Trn[i]!=null; i++) {
	    	System.out.println(b1Trn[i]);
	    }
	}

}
