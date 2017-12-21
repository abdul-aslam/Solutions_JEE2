package com.string;

public class StringServiceProvider {

//public StringServiceProvider(String string) {
		// TODO Auto-generated constructor stub
//	}
public String reverseString(String S) {
  
//To print reverse String
		String rev ="";
		int len =S.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + S.charAt(i);
		}
		return rev;
 }

//linear search
 public int linearSearch(String word, char ch) {
	  
	 		return word.indexOf(ch);
}

 
 public String replaceString (String word, String replaceString, String replaceOfString ) {
	  
		return word.replace(replaceString, replaceOfString);
}
 	
}
