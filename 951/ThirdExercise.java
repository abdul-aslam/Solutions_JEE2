package com.htc.exercies;

public class ThirdExercise {

	public ThirdExercise() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StringServiceProvider Ssp = new StringServiceProvider();
       String st = Ssp.reverseString("Ravi Sankar");
       System.out.println("Reverse string is " + st);
       if (Ssp.linearSearch("Ravi Sankar", "Sa")){
    	   System.out.println("String found in linear search");
       }
       else
       {
    	   System.out.println("String not found in linear search");
       }
       Ssp.setStr1("Hello Ravi Sankar How are you");
       
       String text = Ssp.replaceString("Hello", "Hi");
       System.out.println("String replace to " + text);

	}

}
