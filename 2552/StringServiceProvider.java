package com.htc.cjavaexercises1.entity;

import java.util.Scanner;

// Exercises 3: String Service Provider Class with Static and Non static methods

public class StringServiceProvider {

	// Non static string reverse method
	public String reverse(String input){
	    char[] in = input.toCharArray();
	    int begin=0;
	    int end=in.length-1;
	    char temp;
	    while(end>begin){
	        temp = in[begin];
	        in[begin]=in[end];
	        in[end] = temp;
	        end--;
	        begin++;
	    }
	    return new String(in);
	}

	// Non static linear search method
	public void linearsearch()
	{
		Scanner sc=new Scanner(System.in);
        String input[]=new String[5];
        System.out.println("Enter any 5 elements for linear search:");
        for(int i=0;i<input.length;i++)
        {
            input[i]=sc.nextLine();
        }
        System.out.print("Enter the element to searched: ");
        String st=sc.nextLine(); 
        String result="false";
        for(int i=0;i<input.length;i++)
        {
            if(st.compareTo(input[i])==0)
            {
                System.out.println(st+" is found");
                result="true";
                break;
            }
        }
        if(result == "false")
        {
            System.out.println(st+" is not found");
        }
	}
	
	// Static string reverse method
		public static String reverseStaticMethod(String input){
		    char[] in = input.toCharArray();
		    int begin=0;
		    int end=in.length-1;
		    char temp;
		    while(end>begin){
		        temp = in[begin];
		        in[begin]=in[end];
		        in[end] = temp;
		        end--;
		        begin++;
		    }
		    return new String(in);
		}

		// Static linear search method
		public static void linearsearchStaticMethod()
		{
			Scanner sc=new Scanner(System.in);
	        String input[]=new String[5];
	        System.out.println("Enter any 5 elements for linear search: ");
	        for(int i=0;i<input.length;i++)
	        {
	            input[i]=sc.nextLine();
	        }
	        System.out.print("Enter the element to searched: ");
	        String st=sc.nextLine(); 
	        String result="false";
	        for(int i=0;i<input.length;i++)
	        {
	            if(st.compareTo(input[i])==0)
	            {
	                System.out.println(st+" is found");
	                result="true";
	                break;
	            }
	        }
	        if(result == "false")
	        {
	            System.out.println(st+" is not found");
	        }
		}

	public static void main(String args[]){  
		
		  // String service thru non static methods
		  
		  // Reverse String 
		   System.out.println("String service thru non static methods:");
		   System.out.println("----------------------------------------");	
		   System.out.println("Enter the String to be reversed");
		   Scanner r=new Scanner(System.in);
		   String rev;
		   StringServiceProvider s=new StringServiceProvider();
		   rev=(s.reverse(r.nextLine()));
		   System.out.println("Result:"+rev);  
		  
		   System.out.println(" ");
	      /* Linear Search */
	       s.linearsearch();
	       
	       System.out.println(" ");
	       
	    // String service thru static methods
			  
			// Reverse String 
			   System.out.println("String service thru static methods:");
			   System.out.println("----------------------------------------");	
			   System.out.println("Enter the String to be reversed");
			   rev=(reverseStaticMethod(r.nextLine()));
			   System.out.println("Result:"+rev);  
			  
			   System.out.println(" ");
		      /* Linear Search */
		         linearsearchStaticMethod();
		       
}
}