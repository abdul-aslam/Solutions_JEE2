package com.assignment1;

import com.test.TraineeNotFoundException;

public class Batch {

	private String batchCode;
	private Trainee[] trainees;
	
	
	public Batch() {

		trainees = new Trainee[3];

		Trainee trainee1 = new Trainee();
		trainee1.setGender("M");
		trainee1.setTrineeId(1);

		Trainee trainee2 = new Trainee();
		trainee2.setGender("F");
		trainee2.setTrineeId(2);
		
		Trainee trainee3 = new Trainee();
		trainee3.setGender("F");
		trainee3.setTrineeId(2);

		trainees[0] = trainee1;
		trainees[1] = trainee2;
		trainees[2] = trainee3;

	}

	public Trainee getTraineeForId(int traineeId) throws TraineeNotFoundException {

		for (Trainee trainee : trainees) {

			if (trainee.getTrineeId() == traineeId) {
				return trainee;
			}

		}
		throw new TraineeNotFoundException("no id found");

	}

	public Trainee[] getTrainee(String gender)  {

		Trainee[] filteredTrainees = new Trainee[2];

		int i = 0;
		for (Trainee trainee : trainees) {

			if (trainee.getGender().equalsIgnoreCase(gender)) {
				filteredTrainees[i] = trainee;
				i++;
			}
		}
		return filteredTrainees;
	}
	
	public static void main(String[] str ) throws TraineeNotFoundException  {
		
		Batch batch = new Batch();
		Trainee trainee = batch.getTraineeForId(1);	
		System.out.println("id is " + trainee.getTrineeId());		
	}
}
