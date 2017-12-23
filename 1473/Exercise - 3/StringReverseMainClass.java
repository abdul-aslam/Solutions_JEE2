package com.htc.stringreverseprovider;

import java.util.Scanner;

public class StringReverseMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString="";
		String srchString ="";
		String replString ="";
		String trgString = "";
		
		// Scanner utility to get the input from the user
		Scanner inputReader = new Scanner(System.in);
				
		// Creating the instance for the StringReverseProvider C
		StringReverseProvider strRev = new StringReverseProvider();
		
		System.out.println("Enter the String to reverse :");
		inputString = inputReader.nextLine();
		
		// Output using the string builder concept
		System.out.println("Reverse a given string using string builder concept  : "+strRev.reverseStringBuilder(inputString));
		
		//Output using the normal string reverse concept
		System.out.println("Revers a given string                                                     :"+strRev.reverseString(inputString));
		
		//output using the normal string reverse concept (static method)
		System.out.println("Reverse a given string by calling static method          :"+
		        StringReverseProvider.reverseStringStatic(inputString));
		
		System.out.println("")
		;
        //Enter the string to be searched
		System.out.println(" Searching  in the given String Concept");
		System.out.println("");
		System.out.println("Enter the String           :");
		inputString = inputReader.nextLine();
		// Enter the search string
		System.out.println("Enter the search string:");
		srchString = inputReader.nextLine();
			
		//Invoke the normal method to search the string in the given string.
		strRev.searchString(inputString, srchString);
		
		//Invoke the static method to search the string in the given string.
		StringReverseProvider.searchStringStatic(inputString, srchString);
		
		//Replace the target string in the given string using the replace string
		System.out.println("");
		System.out.println("Find and replace string concept");
		System.out.println("");
		System.out.println("Enter the String                     :");
		inputString = inputReader.nextLine();
		System.out.println("Enter the target string          :");
		trgString = inputReader.nextLine();
		System.out.println("Enter the replacement string:");
		replString = inputReader.nextLine();
		
		//Invoking the method to find and replace the string - replace function concept
		strRev.replaceString(inputString, trgString, replString);
		
		//Invoking the static method to find and replace the string  - Arry and Content Equals concept
		StringReverseProvider.replaceStringStatic(inputString, trgString,replString);

	}

}
