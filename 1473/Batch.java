package com.htc.trainee;

import java.util.Arrays;

import javax.naming.NameAlreadyBoundException;

public class Batch  {
	
	private String batchCode;
	private String startDate;
	private String endDate;
	private Trainee[] trainees;

	public Batch()
	{
		 batchCode = "";
		 startDate = "";
		 endDate = "";
		 trainees=null;
		 
	}

	public Batch(String batchCode, String startDate, String endDate, Trainee[] trainees)
	{
		super();
		this.batchCode = batchCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.trainees = trainees;
	}



	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batchCode == null) ? 0 : batchCode.hashCode());
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
		if (batchCode == null) {
			if (other.batchCode != null)
				return false;
		} else if (!batchCode.equals(other.batchCode))
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
				+ Arrays.toString(trainees) + "]";
	}

	public Trainee getTrainee(int traineeId) throws TraineeNotFoundException 
	
	{
		int traineePos = 0;
		String traineeFound = "N";

		for (int i  = 0 ; i < trainees.length ; i++)
		{

			if (trainees[i].getTraineeId() == traineeId)
			{
				traineePos = i;
				traineeFound = "Y";
				break;

			}
		}

		if (traineeFound == "Y")
		{
			return trainees[traineePos];
		}
		else
		{
			throw new TraineeNotFoundException(" Trainee Id not Found");
		}

	}
		
		
		public Trainee[] getTrainees(String gender) throws NullPointerException
		{
					
			int genderCount = 0;
			
			for(int i = 0; i  < trainees.length ; i++)
			{
			if(trainees[i].getGender().contains(gender))
				{
					genderCount++;
				}
			}
			
						
			if (genderCount == 0)
			{
				return null;
			}
			else
			{
				int y = 0;
				Trainee[] genderTrainee = new Trainee[genderCount] ;
				
				for(int i = 0; i <  trainees.length ; i++)
				{
		  
					if(trainees[i].getGender().contains(gender))
					{
					    genderTrainee[y] = trainees[i];
						y++;				
					}
				}
				return genderTrainee;
			}
			
			
			
			
		}
	
	 

}
