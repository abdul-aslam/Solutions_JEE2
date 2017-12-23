package com.htc.CoreJava1.main;

public class StringServiceProviderStaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Pravin.Kumar@htcinc.com";
		String fromString = "Pravin";
		String toString = "Praveen";
		char searchChar = 'K';
		System.out.println("Reverse string for "+inputString+ " is: "+StringServiceProviderStatic.reverseString(inputString));
		if (StringServiceProviderStatic.searchCharInString(inputString,searchChar) != 0)
			System.out.println("Char "+searchChar+" is found at position "+StringServiceProviderStatic.searchCharInString(inputString,searchChar)+" in input string: "+inputString);
		else
			System.out.println("Char "+searchChar+" is not found in input string: "+inputString);
		System.out.println("The new string after replacing "+fromString+" to "+toString+" in "+inputString+" is: "+StringServiceProviderStatic.searchAndReplaceInString(inputString, fromString, toString));
	}
}
