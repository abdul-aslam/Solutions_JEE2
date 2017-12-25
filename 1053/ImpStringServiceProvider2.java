package com.htc.javaex3;

public class ImpStringServiceProvider2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    StringServiceProvider2.setStringvar("Hello");
    System.out.println(StringServiceProvider2.getStringvar());
    System.out.println(StringServiceProvider2.revStringvar());
    System.out.println(StringServiceProvider2.srchStringvar("la"));
    System.out.println(StringServiceProvider2.repStringvar("ll","pp"));
	}

	

}
