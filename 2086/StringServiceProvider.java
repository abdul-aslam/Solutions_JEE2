package com.htc.trainingexcerise.week1;
/* Week1 - Exercise question 3 */
import java.util.Scanner;

public class StringServiceProvider {

	
	//non static methods
	public void reverseString(String givenString) {
		String reverseString= new StringBuffer(givenString).reverse().toString();
		
		System.out.println("Non Static Reverse--  " +reverseString);
	}
	public void linearSearch(String userString, String srchString) {
		
		boolean flag=false;
		
			if(String.valueOf(userString).contains(srchString))
			{
				System.out.println("Non Static --  Word present");
				flag=true;
			}
		
		if(flag==false)System.out.println("Non Static --  Word not present");
		
	}
	
	public void SearchAndReplace(String givenString,String srchString,String replaceStr) {
		System.out.println("Non Static --  "+givenString.replace(srchString, replaceStr));
	}
	//static methods
	public static void reverseStringStatic(String givenString) {
		String reverseString= new StringBuffer(givenString).reverse().toString();
		System.out.println("Static --  " +reverseString);
		
	}
	public static void linearSearchStatic(String userString, String srchString) {
		boolean flag=false;
		
		if(String.valueOf(userString).contains(srchString))
		{
			System.out.println("Non Static --  Word present");
			flag=true;
		}
		if(flag==false)System.out.println(" Static --  Word not present");
		
	}
	public static void SearchAndReplaceStatic(String givenString,String srchString,String replaceStr) {
		System.out.println(" Static --  "+givenString.replace(srchString, replaceStr));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sStr = new Scanner(System.in);
		System.out.println("Please enter a string to do reverse");
		
		StringServiceProvider ssp=new StringServiceProvider();
		
		String userString = sStr.nextLine();
		//String[] userStringArray=;
		
		ssp.reverseString(userString);
		StringServiceProvider.reverseStringStatic(userString);
		
		System.out.println("Please enter a string to do search in above given string");
		String srchStr = sStr.next();
		ssp.linearSearch(userString,srchStr);
		StringServiceProvider.linearSearchStatic(userString,srchStr);
		
		System.out.println("Please enter a string to do search");
		String srchString = sStr.next();
		System.out.println("Please enter a string to do replace");
		String replaceStr = sStr.next();
		ssp.SearchAndReplace(userString,srchString,replaceStr);
		StringServiceProvider.SearchAndReplaceStatic(userString,srchString,replaceStr);
	}

}
