package assignment;

import java.util.Scanner;

public class StringServiceProviderTest {

	public static void main(String[] args) {
		
		System.out.println("String Operations");
		
		StringServiceProvider StringServiceProviderObject = new StringServiceProvider();
		
		Scanner input = new Scanner(System.in);
		int optionValue;
		do 
		{
			System.out.println("**************************************************************");
			System.out.println("Enter Below options");
			System.out.println("1. Reverse a String ");
			System.out.println("2. Linear Search in a String ");
			System.out.println("3. Search & Replace in a String ");
			System.out.println("**************************************************************");
			
			System.out.println("4. Reverse a String - Using static Method");
			System.out.println("5. Linear Search in a String - Using static Method ");
			System.out.println("6. Search & Replace in a String -- Using static Method  ");
			
			System.out.println("0. Exit ");
			System.out.println("**************************************************************");
			
			optionValue = input.nextInt();
			input.nextLine();
			switch(optionValue)
			{
				case 1 :
				{
					System.out.println("Enter String for ReverseString ");
					String stringToReverse = (String) input.nextLine();
										
					System.out.println(stringToReverse + "   ReverseString is " + StringServiceProviderObject.reverseString(stringToReverse));
					break;
					
				}
				
				case 2 :
				{
					System.out.println("Enter String To Be Searched ");
					String stringToBeSearched = input.nextLine();
					
					System.out.println("Enter Character To Be Search ");
					char stringToSearch = input.next().charAt(0);
					input.nextLine();
					
					int i = StringServiceProviderObject.linearSerach(stringToBeSearched, stringToSearch); 
					
					if ( i >= 0 )					
						System.out.println( stringToBeSearched + "   Has Char " + i + " th Position");
					else
						System.out.println( stringToBeSearched + "   Has Char No Char as Such  " + stringToSearch);
					break;
					
				}
				
				case 3 :
				{
					System.out.println("Enter String To Replace  ");
					String stringToBeReplaced = input.nextLine();
					
					System.out.println("Enter Character To Be Search ");
					char stringToSearch = input.next().charAt(0);
					input.nextLine();
					
					System.out.println("Enter Character To Be Replace ");
					char stringToReplace = input.next().charAt(0);
					input.nextLine();
					
					String result = StringServiceProviderObject.replaceString(stringToBeReplaced,stringToSearch,stringToReplace);
					
					if(result.equals("false"))
						System.out.println( "---- Character Entered  was not found in Original String  No ReplaceMent Done ---- "  );
					else
						System.out.println( "New String After Char Replacement " +  result);
					
					break;
					
				}
				
				case 4 :
				{
					System.out.println("Enter String for ReverseString ");
					String stringToReverse = (String) input.nextLine();
					
					System.out.println(stringToReverse + "   ReverseString is " + StringServiceProviderStatic.reverseString(stringToReverse));
					break;
					
				}
				
				case 5 :
				{
					System.out.println("Enter String To Be Searched ");
					String stringToBeSearched = input.nextLine();
					
					System.out.println("Enter Character To Be Search ");
					char stringToSearch = input.next().charAt(0);
					input.nextLine();
					
					int i = StringServiceProviderStatic.linearSerach(stringToBeSearched, stringToSearch); 
					
					if ( i >= 0 )					
						System.out.println( stringToBeSearched + "   Has Char " + i + " th Position");
					else
						System.out.println( stringToBeSearched + "   Has Char No Char as Such  " + stringToSearch);
					break;
					
				}
				
				case 6 :
				{
					System.out.println("Enter String To Replace  ");
					String stringToBeReplaced = input.nextLine();
					
					System.out.println("Enter Character To Be Search ");
					char stringToSearch = input.next().charAt(0);
					input.nextLine();
					
					System.out.println("Enter Character To Be Replace ");
					char stringToReplace = input.next().charAt(0);
					input.nextLine();
					
					String result = StringServiceProviderStatic.replaceString(stringToBeReplaced,stringToSearch,stringToReplace);
					
					if(result.equals("false"))
						System.out.println( "---- Character Entered  was not found in Original String  No ReplaceMent Done ---- "  );
					else
						System.out.println( "New String After Char Replacement " +  result);
					
					break;
					
				}
				
				case 0 :
				{
					System.exit(0);
				}
			}
		}while (optionValue >= 1);
		
	}

}
