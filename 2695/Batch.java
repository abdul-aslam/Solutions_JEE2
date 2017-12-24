
public class Batch {
	
	public static Trainee[] t = new Trainee[5]; //creates array for the Trainee class and assign and retrieve values for each array
	
	
	
	public static void main(String args[]){
		
		Batch b = new Batch();
		
		
		t[0] = new Trainee(); //allocate before using it
		
		t[0].setTraineeId(1234);		
		System.out.println("value of TraineeId :  " +t[0].getTraineeId());
		
		t[1].setTraineeId(5678);
		System.out.println("gettrainee Id[3] = " +t[3].getTraineeId());
		
		
		//b.t.setTraineeId("12345");
	}
	

}
