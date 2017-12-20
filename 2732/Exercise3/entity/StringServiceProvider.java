package com.htc.Exercise3.entity;

import java.util.Scanner;

public class StringServiceProvider {
	
	public static void main(String[] args) {

		final String OrigString = "This is my original string for linear search";  
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a string of char");
		String Str = s.next();
		String rev = reverseit(Str);
		System.out.println("here is the reversed string");
		System.out.println(rev);
	}
		
	
	public static String reverseit(String St)
		{
			String revStr = "";
			String alp = "";
			int len = St.length();
						
			for(int i=len;i>0;i--)
			{
				
				alp = St.substring(i-1,i);
				revStr = revStr.concat(alp);
				
			} 
			return revStr;
		
		}
		
		public void reverseme(String St)
		{
			String revStr = "";
			String alp;
			for(int i=St.length();i>0;i--)
			{
				alp = St.substring(i-1,i);
				revStr = revStr.concat(alp);
			}
			System.out.println("Reversed str: "+revStr);
		
		}
		
		public void searchString(String OrigStr, String Str2srch)
		{
			
			int indx = OrigStr.indexOf(Str2srch);
			if (indx > 0) { 
				System.out.println("String '"+Str2srch+"' found at position "+indx);
			}
			else {
				System.out.println("String"+Str2srch+" not found");
			}
		}
		
		public String srchnreplace(String OrigStr, String Str2srch, String Str2rep)
		{
			String newStr = OrigStr.replace(Str2srch, Str2rep);
			return newStr;
		
		}	

}