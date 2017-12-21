package com.string;

import com.project.Project;

public class StringServiceClient {

	public static void main(String[] args) {

//reverse string
		StringServiceProvider client = new StringServiceProvider();   
		String s = "JavaTraining";
		String rs = client.reverseString(s);
		
		System.out.println("The reverse String of " +s +"is :"+rs);
	
//liner search
		
		int ls =client.linearSearch(s, 'T');
		
		System.out.println("The T is at "+ ls +" position  in word "+s);
		
		
//replace 
		String replString=client.replaceString(s, "Java", "HTC ");
		
		System.out.println("The final String after replace " +replString);
	}

}
