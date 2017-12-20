package assignment;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;


public class Batch implements Serializable {

		private int batchCode;
		private String startDate;
		private String endDate;
		Trainee[] traineeMembers;
		public Batch() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Batch(int batchCode, String startDate, String endDate, Trainee[] traineeMembers) {
			super();
			this.batchCode = batchCode;
			this.startDate = startDate;
			this.endDate = endDate;
			this.traineeMembers = traineeMembers;
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
		public Trainee[] getTraineeMembers() {
			return traineeMembers;
		}
		public void setTraineeMembers(Trainee[] traineeMembers) {
			this.traineeMembers = traineeMembers;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + batchCode;
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
			return true;
		}
		@Override
		public String toString() {
			return "Batch [batchCode=" + batchCode + ", startDate=" + startDate + ", endDate=" + endDate
					+ ", traineeMembers=" + Arrays.toString(traineeMembers) + "]";
		}
		
		public Trainee getTrainee(int traineeId) throws TraineeNotFoundExceptionpublic
		{
			boolean flag=false;      
			for (int i = 0 ; i < traineeMembers.length ; i++)
			{
				if (traineeMembers[i].getTraineeId() == traineeId)
					return traineeMembers[i];
				
			}
			if(flag == false)
				throw new TraineeNotFoundExceptionpublic("Trainee Not Found");
			
			return null;
			
			
		}
		
		public Trainee[] getTrainees(String gender) 
		{
			int j =0; int count=0;
			
			for (int i = 0 ; i < traineeMembers.length ; i++)
			{
				if (traineeMembers[i].getGender().equals(gender))
				{
					count++;
				}
				
			}
			
			Trainee[] genderArray = new Trainee[count];
			
			for (int i = 0 ; i < traineeMembers.length ; i++)
			{
				if (traineeMembers[i].getGender().equals(gender))
				{
					genderArray[j] = traineeMembers[i];
					j++;
				}
				
			}		
			return genderArray;
		}
}
