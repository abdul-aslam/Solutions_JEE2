package com.htc.java;

import java.util.Scanner;

public class StringServiceProviderStatic {

		
	private static String reverseString(String inputStr) {
		
		String revString = "";
		
		for (int i = inputStr.length()-1; i>=0; i--) {
			revString = revString + inputStr.charAt(i);
		
				}
	   return revString;
	}
		
	public static void linearSearch(String inputString, String inputChar) {
		char c = inputChar.charAt(0);
		int strLength = inputString.length();
		boolean flag = false;
		for (int i=0; i<=strLength-1; i++) {
			if (inputString.charAt(i) == c) {
				System.out.println("Contains at  position :"+ i);
				flag = true;
			}
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
            String origStr,revStr = "";
			Scanner inStr  = new Scanner(System.in);
			System.out.println("Enter a string to reverse:");
			origStr = inStr.nextLine();
			revStr = reverseString(origStr);
			System.out.println("Reversed String is:" +revStr );	
			
			//linear search static 
			String searchChar = "";
			System.out.println("Enter the character to search:");
			Scanner inChar  = new Scanner(System.in);
			searchChar = inChar.nextLine();
			linearSearch(origStr, searchChar.toString());
			
			
		}
	  
	}


