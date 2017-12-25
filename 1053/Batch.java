package com.htc.javaex1;

import java.util.Arrays;

public class Batch {
	
	private int batchCode;
	private String startdate;
	private String  enddate;
	private Trainee[] trainees;

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        
	}*/

	public Batch(int batchCode, String startdate, String enddate, Trainee[] trainees) {
		super();
		this.batchCode = batchCode;
		this.startdate = startdate;
		this.enddate = enddate;
		this.trainees = trainees;
	}
	
	public Batch() {super();}
	public int getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(int batchCode) {
		this.batchCode = batchCode;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public Trainee[] getTrainees() {
		return trainees;
	}

	public void setTrainees(Trainee[] trainees) {
		this.trainees = trainees;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public Trainee getTraineeId(int traineeId) throws TraineeNotFoundException
	{
		return null;
	}
	
	public Trainee[] getTrainees(String gender) {
		return trainees;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startdate=" + startdate + ", enddate=" + enddate + ", trainees="
				+ Arrays.toString(trainees) + ", hashCode()=" + hashCode() + ", getBatchCode()=" + getBatchCode()
				+ ", getStartdate()=" + getStartdate() + ", getTrainees()=" + Arrays.toString(getTrainees())
				+ ", getEnddate()=" + getEnddate() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + batchCode;
		result = prime * result + ((enddate == null) ? 0 : enddate.hashCode());
		result = prime * result + ((startdate == null) ? 0 : startdate.hashCode());
		result = prime * result + Arrays.hashCode(trainees);
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Batch)) {
			return false;
		}
		Batch other = (Batch) obj;
		if (batchCode != other.batchCode) {
			return false;
		}
		if (enddate == null) {
			if (other.enddate != null) {
				return false;
			}
		} else if (!enddate.equals(other.enddate)) {
			return false;
		}
		if (startdate == null) {
			if (other.startdate != null) {
				return false;
			}
		} else if (!startdate.equals(other.startdate)) {
			return false;
		}
		if (!Arrays.equals(trainees, other.trainees)) {
			return false;
		}
		return true;
	}

}
