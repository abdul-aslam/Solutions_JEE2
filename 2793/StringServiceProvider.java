package com.htc.corejavaexercise5;

	
	import java.util.Scanner;

	public class StringServiceProvider1 {
		
		//non static methods
		public void reverseString(String originalString) {
			String reverseString= new StringBuffer(originalString).reverse().toString();
			
			System.out.println("Non Static Reverse--  " +reverseString);
		}
		public void linearSearch(String originalString) {
			char[] originalStringCharArray =originalString.toCharArray();
			boolean flag=false;
			for(char c:originalStringCharArray)
			{
				if(String.valueOf(c).equals(originalString))
				{
					System.out.println("Non Static --  Word present");
					flag=true;
				}
			};
			if(flag==false)System.out.println("Non Static --  Word not present");
			
		}
		
		public void SearchAndReplace(String originalString,String srchString,String replaceStr) {
			System.out.println("Non Static --  "+originalString.replace(srchString, replaceStr));
		}



	//static methods
		public static void reverseStringStatic(String originalString) {
			String reverseString= new StringBuffer(originalString).reverse().toString();
			System.out.println("Static --  " +reverseString);
			
		}
		public static void linearSearchStatic(String originalString) {
			char[] originalStringCharArray =originalString.toCharArray();
			boolean flag=false;
			for(char c:originalStringCharArray)
			{
				if(String.valueOf(c).equals(originalString))
				{
					System.out.println(" Static --  Word present");
					flag=true;
				}
			};
			if(flag==false)System.out.println(" Static --  Word not present");
			
		}
		public static void SearchAndReplaceStatic(String originalString,String srchString,String replaceStr) {
			System.out.println(" Static --  "+originalString.replace(srchString, replaceStr));
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			Scanner sString = new Scanner(System.in);
			System.out.println("Please enter a original string ");
			
			StringServiceProvider1 ssp=new StringServiceProvider1();
			
			String userString = sString.next();
			ssp.reverseString(userString);
			StringServiceProvider1.reverseStringStatic(userString);
			
			System.out.println("Please enter a string to do search in above given string");
			String srchStr = sString.next();
			ssp.linearSearch(srchStr);
			StringServiceProvider1.linearSearchStatic(srchStr);
			
			System.out.println("Please enter a string to do search");
			String srchString = sString.next();
			System.out.println("Please enter a string to do replace");
			String replaceStr = sString.next();
			ssp.SearchAndReplace(userString,srchString,replaceStr);
			StringServiceProvider1.SearchAndReplaceStatic(userString,srchString,replaceStr);
			sString.close();
		}

	}