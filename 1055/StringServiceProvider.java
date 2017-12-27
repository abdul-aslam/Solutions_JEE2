package com.htc.java;

import java.util.Scanner;

public class StringServiceProvider {
	String inputStr;
	
	
	public String getInputStr() {
		return inputStr;
	}
	public void setInputStr(String inputStr) {
		this.inputStr = inputStr;
	}

public String reverseString() {
	
	String revString = "";
	for (int i = inputStr.length()-1; i>=0; i--) {
		revString = revString + inputStr.charAt(i);
	
			}
   return revString;
}
public void linearSearch(String inputString, String inputChar) {
	char c = inputChar.charAt(0);
	int strLength = inputString.length();
	boolean flag = false;
	for (int i=0; i<=strLength-1; i++) {
		if (inputString.charAt(i) == c) {
			System.out.println("Contains at  position :"+ i);
			flag = true;
			//break;
			
		}
				
	}	
			
	if (!flag) {
		System.out.println("not found");
	}
	
	}
public void searchAndReplace(String inString, char findChar, char replChar) {
	int strLength = inString.length();
	boolean flag = false;
	System.out.println(inString);
	System.out.println(findChar);
	System.out.println(replChar);
	for(int i=0;i<strLength-1;i++) {
		if(inString.charAt(i)  == findChar) {
			System.out.println("inside IF part");
			String str = inString.replace(findChar, replChar);
		    flag = true;	
		    System.out.println(str); 	    
		}
	}
	System.out.println(inString);
	if (!flag) {
		System.out.println("character not found");
	}
}
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String searchChar = "";
		StringServiceProvider originalString = new  StringServiceProvider();
		originalString.setInputStr("christmas");
		String enteredString = originalString.getInputStr();
		System.out.println("new string is :" + originalString.reverseString());
		
		//search char in a string
		System.out.println("Enter the character to search:");
		Scanner inChar  = new Scanner(System.in);
		searchChar = inChar.nextLine();
		originalString.linearSearch(enteredString, searchChar.toString());
		
		//search character in string and replace
		//System.out.println("Enter the string:");
		
		StringServiceProvider originalString1 = new  StringServiceProvider();
		originalString1.setInputStr("WELCOME");
		String s1 = originalString1.getInputStr();
		originalString1.searchAndReplace(s1, 'L', 'T');
						
		
	}
  

}


