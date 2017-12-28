import java.sql.Timestamp;


public class Batch {
	
	private int batchCode;
	private Timestamp startDate;
	private Timestamp endDate;
	private Trainee[] traineeField;

	public int getBatchCode() {
		return batchCode;
	}
	public void setBatchCode(int batchCode) {
		this.batchCode = batchCode;
	}
	public Timestamp getStartDate() {
		return startDate;
	}
	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}
	public Timestamp getEndDate() {
		return endDate;
	}
	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}
	public Trainee[] getTraineeField() {
		return traineeField;
	}
	public void setTraineeField(Trainee[] traineeField) {
		this.traineeField = traineeField;
	}
		
		public Trainee GetTrainee(int id)
		{
			Trainee objtraine=new Trainee(1,"bob",(int) 3098259758L,"bob@htcinc.com",50);
			return objtraine;

			
		}
		
	}

	

	
	
	

