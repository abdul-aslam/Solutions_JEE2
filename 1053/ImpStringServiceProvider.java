package com.htc.javaex3;

public class ImpStringServiceProvider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    StringServiceProvider ssp = new StringServiceProvider();
    ssp.setStringvar("Hello");
    System.out.println(ssp.getStringvar());
    System.out.println(ssp.revStringvar());
    System.out.println(ssp.srchStringvar("la"));
    System.out.println(ssp.repStringvar("ll","pp"));
	}

}
