package com.htc.CoreJava1.main;

public class BatchMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainee[] thetrainees = new Trainee[3];
		thetrainees[0]= new Trainee (1, "Praveen AK", 3098263625l, "praveen.kumar@htcinc.com", "Male", 33);	
		thetrainees[1] = new Trainee (2, "RamC", 2482482248l, "ramc@htcinc.com", "Male", 32);
		thetrainees[2] = new Trainee (3, "Harsha", 2481234567l, "Harsha@htcinc.com", "Male", 50);
		
		Trainee[] gendertrainees;
		int traineeId = 1;
		String traineeGen = "Male";

		Batch batch = new Batch (101, "1/1/2018", "12/31/2018", thetrainees);
		
		System.out.println("Created Batch: "+batch.toString());
		try{
			Trainee idtrainee = batch.getTrainee(traineeId);
			System.out.println("Found Trainee with id: "+traineeId+" :"+idtrainee.toString());
		}
		catch(TraineeNotFoundException TNFEx){
			TNFEx.printStackTrace();
		}
		gendertrainees = batch.getTrainees(traineeGen);
		if (gendertrainees != null) {
			for(int i = 0; i < gendertrainees.length; i++) {
				System.out.println("\nFound Trainee "+traineeGen +" "+i+" :"+gendertrainees[i]);
			}
		}
		else
			System.out.println("\nNo Trainees found with gender "+"traineeGen");
	}

}
