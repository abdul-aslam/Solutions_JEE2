package com.htc.excercise3.kishorebabu;

import java.util.Scanner;

public class StringServiceProvider {
	
//private static final String String = null;

	//using Static string reverse
	public static String StaticReverseString(String test)
	{		
		String reverse1 = new StringBuffer(test).reverse().toString();
		return reverse1;
	}
	
	//without Static String Reverse
	public  String NonStaticReverseString(String test)
	{		
		String reverse1 = new StringBuffer(test).reverse().toString();
		return reverse1;
	}
	
	
	//Leaner Search Without Static
	public void NonStaticLinearsearch(String[] input, String st)
	{	
		        String result="false";
        for(int i=0;i<input.length;i++)
        {
            if(st.compareTo(input[i])==0)
            {
                System.out.println("Using NonStatic Linear Search : " +st+" is found at "+(i+1));
                result="true";
                break;
            }
        }
        if(result == "false")
        {
            System.out.println("Using NonStatic Linear Search : " +st + " is not found");
        }
        
	}

	public static void StaticLinearsearch(String[] input, String st)
	{
				
        String result="false";
        for(int i=0;i<input.length;i++)
        {
            if(st.compareTo(input[i])==0)
            {
                System.out.println("Using Static Linear Search : " +st+" is found at "+(i+1));
                result="true";
                break;
            }
        }
        if(result == "false")
        {
            System.out.println("Using Static Linear Search : " +st + " is not found");
        }
     //   sl1.close();
	}
	
	public  void NonStaticSearchAndReplace(String givenString,String srchString,String replaceStr)
	{
		System.out.println("Non Static Search and Replace:  "+givenString.replace(srchString, replaceStr));
			
	}
	
	public static void StaticSearchAndReplace(String givenString,String srchString,String replaceStr) {
		System.out.println("Static Search and Replace : "+givenString.replace(srchString, replaceStr));
	}
	
public static void main(String[] args)
 {
	
	 System.out.println("Enter  Text:");
	 Scanner sc=new Scanner(System.in);
     String reverse=sc.nextLine();
     StringServiceProvider s=new StringServiceProvider(); 
       
    
     //Using Static Reverse String 
     String reverse1 = StaticReverseString(reverse);    
	 System.out.println("Using Static Reverse String:"+reverse1);
	 
	
	 //Non static Reverse String
	 //StringServiceProvider s=new StringServiceProvider();
	 String reverse2 = s.NonStaticReverseString(reverse);
	 System.out.println("Without Static Reverse String:"+reverse2);
	 //sc.close(); 
	
	 //without static Linear Search
	 
	 int[] values;
		values=new int[5];
		Scanner sl=new Scanner(System.in);
		String input[]=new String[5];
		String st;
	    System.out.println("Enter the 5 elements of the array: ");
	    for (int i = 0; i <values.length; i++)
		{
			input[i]=sl.nextLine();
						
		}
		
		System.out.print("Enter Search element : ");
        st=sl.nextLine(); 

	 s.NonStaticLinearsearch(input, st);
	 
	 //Static Linear Search
	   StaticLinearsearch(input, st);
	   
	    //Search and Replace String
	    System.out.println("Please enter a string to do search and Replace");
        String stringreplace = sc.nextLine();
       
	    System.out.println("Please enter a string to do search");
		String searchString = sc.nextLine();
		
		//to search substring occurence 
		if(stringreplace.indexOf(searchString) >0)
		{
          System.out.println("Please enter a string to do replace");
		  String replaceStr = sc.next();
		
		  //NonStatic Search and Replace String
		  s.NonStaticSearchAndReplace(stringreplace,searchString,replaceStr);
		
		  //Static Search and Replace String		
		  StaticSearchAndReplace(stringreplace,searchString,replaceStr);
		}
		
		else
		{
		
			System.out.println(searchString +" is not found.");
			
		}
		
	    sc.close();
	    sl.close();
 }

}
