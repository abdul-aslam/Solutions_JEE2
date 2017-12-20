package com.htc.Asgmt1.main;

import java.io.*; 

// Made by Ernest Paulino

// StringServiceProvider Class

public class StringServiceProvider{

	// Reverse the original string with STATIC option
	public static String reverseStr1(String strIn) 
	{ 
    	String strOut = "";
		for(int i=(strIn).length()-1; i>=0; i--) {
			strOut = strOut + (strIn).charAt(i);
		}
		return (strOut);
	}
	
	// Reverse the original string w/o STATIC option
	public String reverseStr2(String strIn) 
	{ 
    	String strOut = "";
		for(int i=(strIn).length()-1; i>=0; i--) {
			strOut = strOut + (strIn).charAt(i);
		}
		return (strOut);
	}
	
	// Linear search with STATIC option
	public static int searchStr1(String strIn, String findIn) 
	{ 
    	int firstPos = strIn.indexOf(findIn);
    	return (firstPos);
	}
	
	// Linear search w/o STATIC option
	public int searchStr2(String strIn, String findIn) 
	{ 
    	int firstPos = strIn.indexOf(findIn);
    	return (firstPos);
	}
	
	// Replace char with STATIC option
	public static String replaceStr1(String strIn, String replaceIn, String replaceWith) 
	{ 
		String strOut = "";
		
    	strOut = strIn.replaceAll(replaceIn, replaceWith);
    	return (strOut);
	}
	
	// Replace char w/o STATIC option
	public String replaceStr2(String strIn, String replaceIn, String replaceWith) 
	{ 
		String strOut = "";
		
    	strOut = strIn.replaceAll(replaceIn, replaceWith);
    	return (strOut);
	}
	
}
