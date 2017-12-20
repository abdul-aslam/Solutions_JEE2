package com.htc.Exercise3.main;

import java.util.Scanner;

import com.htc.Exercise3.entity.StringServiceProvider;

public class StringDemo {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		/*
		StringServiceProvider RevDemo = new StringServiceProvider();
		System.out.println("Please enter a string of char");
		String Str = s1.next();
		
		RevDemo.reverseme(Str);
		
		StringServiceProvider SrchDemo = new StringServiceProvider();
		String OrigString1 = "This is my original string for linear search";
		System.out.println("Please enter a char or a string of char to search in the original string");
		Str = s1.next();
		
		SrchDemo.searchString(OrigString1,Str);
		*/
		StringServiceProvider SrchReplDemo = new StringServiceProvider();
		String OrigString2 = "Lets change Bombay";
				
		System.out.println("New string :"+SrchReplDemo.srchnreplace(OrigString2,"Bombay", "Mumbai"));
	

	}

}