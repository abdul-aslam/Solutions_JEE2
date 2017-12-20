package assignment;

import java.util.Date;
import java.util.Scanner;

public class BatchTest {

	public static void main(String[] args) throws TraineeNotFoundExceptionpublic {
		
		Trainee person1 = new Trainee(100, "Sridhar" , "248-585-8956","Sridhar@htcinc.com", "Male" , 40);
		Trainee person2 = new Trainee(101, "Jawa" , "248-585-4714","Jawa@htcinc.com", "Male" , 20);
		Trainee person3 = new Trainee(102, "Adnan" , "248-585-0011","Adnan@htcinc.com", "Male" , 32);
		Trainee person4 = new Trainee(103, "Brook" , "248-585-6655","Brook@htcinc.com", "female" , 55);
		Trainee person5 = new Trainee(104, "Jeff" , "248-585-8989","Jeff@htcinc.com", "Male" , 30);
		Trainee person6 = new Trainee(105, "Bhavani" , "248-585-7777","Bhavani@htcinc.com", "Male" , 30);
		
			
		Trainee[] JavaTraineeMembers = new Trainee[6];
		JavaTraineeMembers[0] = person1;
		JavaTraineeMembers[1] = person2;
		JavaTraineeMembers[2] = person3;
		JavaTraineeMembers[3] = person4;
		JavaTraineeMembers[4] = person5;
		JavaTraineeMembers[5] = person6;
		
		
		Batch  JavaBatch = new Batch(5665, "11/12/2017" , "01/26/2018" ,JavaTraineeMembers );
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Trainee Number for Details " );
		int TraineeId = sc.nextInt();
		sc.nextLine();
		
		
		Trainee result = JavaBatch.getTrainee(TraineeId);
		System.out.println(result.toString());
		
		System.out.println("Enter Gender for Details ");
		String gender = sc.nextLine();
		
		Trainee[] genderArray = JavaBatch.getTrainees(gender);
		
		System.out.println("Details of All " + gender + "In this Batch");
		for (int i = 0 ; i < genderArray.length ; i++)
		{
			System.out.println(genderArray[i].getTraineeId() 
					+ " , " +  genderArray[i].getTraineeName()
					+ " , " +  genderArray[i].getContactNo()
					+ " , " +  genderArray[i].getEmail()
					+ " , " +  genderArray[i].getAge()
					+ " , " +  genderArray[i].getGender()
					);
		}		
		
		
		

	}

}
