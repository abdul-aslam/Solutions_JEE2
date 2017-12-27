package com.htc.exc.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeMainCall {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringServiceProvider obj = new StringServiceProvider();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Reverse the string
		System.out.println("Enter the string to be reversed: ");
		String input = br.readLine();
		System.out.println("Reversed string: " + obj.reverseString(input));
		
		//Search a word in the string
		System.out.println("Enter a string : ");
		String inStr = br.readLine();
		
		System.out.println("Enter a word to be searched : ");
		String srchStr = br.readLine();
		if(obj.searchString(inStr, srchStr)) 
		   System.out.println(srchStr + " is available in the String");
		else
		   System.out.println(srchStr + " is not available in the String");
		
		// Linear Search
		System.out.println("Enter any 10 words: ");

		String strarr [] = new String[10];

		for (int i = 0; i<10; i++)
		{
			strarr[i] = br.readLine();
		}
		System.out.println("Enter the word to be searched: ");
		String search = br.readLine();
		if (obj.linearsearch(strarr, search)) 
			System.out.println(search +" is available in the listed words" );
		else
			System.out.println(search +" is not available in the listed words" );
        
		//Replace string
		System.out.println("Enter the string : ");
		String str = br.readLine();
		System.out.println("Enter the word to be searched : ");
		String sStr = br.readLine();
		System.out.println("Enter the word to be replaced : ");
		String rStr = br.readLine();
        
		System.out.println("Updated String is :" + obj.replaceString(str, sStr, rStr));
        
		br.close();
	}

}
