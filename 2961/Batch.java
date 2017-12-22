package exercise;

import java.util.Date;

public class Batch {
	private String batchCode;
	private Date startdate;
	private Date enddate;

	private Trainee[] Trainee = new Trainee[4];

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
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

	public Trainee[] getTrainee() {
		return Trainee;
	}

	public void setTrainee(Trainee[] trainee) {
		Trainee [] traineeArray =new Trainee[2];
		for (int i=0;i<traineeArray.length;i++)
		{
			traineeArray[i]=new Trainee();
			traineeArray[i].setTraineeId(1234);
			traineeArray[i].setTraineeName("Raman");
			traineeArray[i].setContactNo(123456789);
			traineeArray[i].setEmail("Raman@gmail.com");
			traineeArray[i].setGender("Male");
			traineeArray[i].setAge(23);
		}

		trainee = traineeArray;
	}

	//Overloaded Methods
	public Trainee getTrainee(int traineeId) throws TraineeNotFoundException{
		Trainee[] Trainee = new Trainee[4];
		for (int i=0;i<Trainee.length;i++)
		{
			if(Trainee[i].getTraineeId() == traineeId){
				return Trainee[i];
			}
		}
		return null;
	}

	public Trainee[] getTrainees(String gender) {
		Trainee[] Trainee = new Trainee[4];
		return Trainee;
	}
}
