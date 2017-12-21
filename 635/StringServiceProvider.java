package com.htc.hw1;

public class StringServiceProvider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string1;
		String string2;
		String string3;
		String string4;
		String string5;
		String string6;
		
		StringServiceProvider ssp = new StringServiceProvider();
		
		string1 = "ABCDEFghijkl";
		string2 = "123456789";
		String findStr= "456";
		string3 = "Replace the sentence";
		string4 = "Static Methods";
		string5 = "String Handling";

		System.out.println(reverseInput(string1));
		System.out.println(lSearch(string2,findStr));
		System.out.println(findRepl(string2,"789","abc"));

		System.out.println(ssp.reverseInput2(string1));
		System.out.println(ssp.lSearch2(string2,findStr));
		System.out.println(ssp.findRepl2(string2,"789","abc"));
	}	
		
		public String reverseInput2(String s1) {
			String rs1="";
			for (int i=s1.length(); i>0; i--) {
				rs1 = rs1.concat(String.valueOf(s1.charAt(i-1)));
				
			}
			return rs1;
		}
		public static String reverseInput(String s1) {
	
			String rs1="";
			for (int i=s1.length(); i>0; i--) {
				rs1 = rs1.concat(String.valueOf(s1.charAt(i-1)));
				
			}
			return rs1;
		}
		
		public int lSearch2(String s1, String s2) {
			int i = s1.indexOf(s2);
			return i;
		}
		public static int lSearch(String s1, String s2) {
		int i = s1.indexOf(s2);
		return i;
	}
		
		public static String findRepl(String s1, String s2, String s3) {
			String rs1 = "";
			rs1 = s1.replaceAll(s2, s3);
			return s1+"-->"+rs1;
		}
		public String findRepl2(String s1, String s2, String s3) {
			String rs1 = "";
			rs1 = s1.replaceAll(s2, s3);
			return s1+"-->"+rs1;
		}
	}
