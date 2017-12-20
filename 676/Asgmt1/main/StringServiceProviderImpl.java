package com.htc.Asgmt1.main;

//Made by Ernest Paulino

import com.htc.Asgmt1.main.StringServiceProvider;

public class StringServiceProviderImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String originalString;
		String targetString;
		String findString;
		int    posString;
		String replaceString;
		
		originalString = "Hello World.  I am Fine.";
		findString     = "World";
		replaceString  = "All";
		
		targetString = StringServiceProvider.reverseStr1(originalString);
		System.out.println(originalString);
		System.out.println(targetString);
		
		StringServiceProvider reverseit = new StringServiceProvider();
		targetString = reverseit.reverseStr2(originalString);
		System.out.println(targetString);
		
		System.out.println("-----------");
		
		posString = StringServiceProvider.searchStr1(originalString,findString);
		System.out.println(originalString);
		System.out.println("'" + findString + "'" + " found at pos " + posString);
		
		StringServiceProvider findit = new StringServiceProvider();
		posString = findit.searchStr2(originalString,findString);
		System.out.println("'" + findString + "'" + " found at pos " + posString);
		
		System.out.println("-----------");
		
		targetString = StringServiceProvider.replaceStr1(originalString,findString,replaceString);
		System.out.println(originalString);
		System.out.println("Replace '" + findString + "' with '" + replaceString + "'");
		System.out.println(targetString);
		
		StringServiceProvider replaceit = new StringServiceProvider();
		targetString = replaceit.replaceStr2(originalString,findString,replaceString);
		System.out.println(targetString);
		
	}

}
