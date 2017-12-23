
package com.htc.exercises.main;


public class StringServiceProvider {

private String result;	
public static void main(String args[]) 
{ 
	
 System.out.println("*****reverse string ******");	
 String string = "Hello world"; 
 System.out.println("original String: " + string); 
 String reversedString = reverseString(string);
 System.out.println("reversed String: " + reversedString);
 
 System.out.println("*****Search string ******");
 String fullstring = "Hellow World Country State";
 String serchstring = "Country";
 StringServiceProvider sr = new StringServiceProvider(); 
 String result = sr.searchString(fullstring, serchstring);
 System.out.println(sr);
 
 System.out.println("*****Repalce  string ******");
 String str = "Hello world and Hello State";
 String replacedStr = str.replaceAll("Hello", "Hi");

 System.out.println("Original string : "+ str);
 System.out.println("Replaced string : "+replacedStr);
 
}


@Override
public String toString() {
	return "StringServiceProvider [result=" + result + "]";
}


public static  String reverseString(String string) 
{
	StringBuffer sb = new StringBuffer(string);
	sb.reverse();
    return  sb.toString(); 
}


public  String searchString(String fullstring, String serchstring) 
{
    int intIndex = fullstring.indexOf(serchstring);
    
    if(intIndex == - 1) {
       result = "string not found";
     } else {
        result = ("string found  at index " + intIndex);
     }

    return result;

}
}