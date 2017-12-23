package com.htc.exercises.main;
    public class Batch {
      private String batchCode;
      private  Trainee[] trainees;
	  public Batch() {
		  
		  trainees = new Trainee[5];
		  Trainee trainee1 = new Trainee();
             trainee1.setTraineeId(1);
             trainee1.setTraineeName("Mary");
             trainee1.setContactNo("2481111111");
             trainee1.setEmail("abc1@yahoo.com");
             trainee1.setGender("Female");
             trainee1.setAge(20);
             
        	 Trainee trainee2 =  new Trainee();
             trainee2.setTraineeId(2);
             trainee2.setTraineeName("Mark");
             trainee2.setContactNo("24822222222");
             trainee2.setEmail("abc2@yahoo.com");
             trainee2.setGender("Male");
             trainee2.setAge(25);
             
        	 Trainee trainee3 =  new Trainee();
             trainee3.setTraineeId(3);
             trainee3.setTraineeName("Tracy");
             trainee3.setContactNo("2483333333");
             trainee3.setEmail("abc3@yahoo.com");
             trainee3.setGender("Female");
             trainee3.setAge(35);
             
        	 Trainee trainee4 =  new Trainee();
             trainee4.setTraineeId(4);
             trainee4.setTraineeName("John");
             trainee4.setContactNo("2484444444");
             trainee4.setEmail("abc4@yahoo.com");
             trainee4.setGender("Male");
             trainee4.setAge(45);
             
        	 Trainee trainee5 =  new Trainee();
             trainee5.setTraineeId(5);
             trainee5.setTraineeName("Linda");
             trainee5.setContactNo("2485555555");
             trainee5.setEmail("abc5@yahoo.com");
             trainee5.setGender("Female");
             trainee5.setAge(55);
 
             trainees[0] = trainee1;
             trainees[1] = trainee2;
             trainees[2] = trainee3;
             trainees[3] = trainee4;
             trainees[4] = trainee5;
	}
	
		public Trainee getTrainee(int traineeId) throws TraineeNotFoundException {
				for (Trainee trainee: trainees) {
				if (trainee.getTraineeId()==traineeId) {
					return trainee;
				}
			}
				throw new TraineeNotFoundException("No TraineeId found");
		}
	
	public Trainee[] getTrainee(String gender) {
	
		Trainee[] tr = new Trainee[5];
		int i = 0;
			for (Trainee trainee : trainees) {
			if (trainee.getGender().equalsIgnoreCase(gender)) {
			tr[i] = trainee;
			i++;
			}
		}
		return tr;
	}
	
	public static void main(String[] str) throws TraineeNotFoundException  {
		
		Batch b = new Batch();
		
		System.out.println("*******Specific trainee display**************");
		Trainee trainee = b.getTrainee(1);
		System.out.println(trainee);	

        System.out.println("*******Specific gender display**************");
        
		Trainee[] trainees = b.getTrainee("Male");
		for (int i = 0; i < trainees.length; i++) {
			if (trainees[i] != null)
			   System.out.println(trainees[i]);	
		}
		System.out.println("*******Calling for trainee not found**************");
			
			Trainee tr = b.getTrainee(6);
			System.out.println(tr);
		}
	} 
    
    
