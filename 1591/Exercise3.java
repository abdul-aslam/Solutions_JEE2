package com.training3;

public class Exercise3 {

	public static void main(String[] args) {


		String str = "!desrever si ecnetnes siht";
		
		String newStr = StringServiceProvider.reverseStr(str);
		System.out.println(newStr);

		StringServiceProvider strService = new StringServiceProvider();

		int index = strService.searchStr(newStr, "reversed");
		
		if ( index != -1 ) {
			System.out.println("search pattern found");
		} else {
			System.out.println("search pattern not found");
		}
		
		System.out.println(strService.replaceStr(newStr, " is", " was"));
		
		
	}

}
