package com.htc.exercise1stwk.main;

public class StringServiceProviderMain {
            
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		StringServiceProvider strprv = new StringServiceProvider();
		String str1 = strprv.reverseStr("ReverseofString");
		System.out.println(str1);
		int i = strprv.linearSearch("String", "rin");
		if (i==1)
			System.out.println("String found");
		else
			System.out.println("string not found");
			
		String str= strprv.replaceString("ActualString", "Actual", "Replace");
		System.out.println(str);
	}

}
