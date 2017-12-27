package com.htc.exercies;

public class StringServiceProvider {
     private String str1;
     private String str2;
     private String str3;
	public StringServiceProvider() {
		// TODO Auto-generated constructor stub
		str1 = "";
		str2 = "";
		
	}
	
   public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

public String reverseString(String str){
	   this.str1 = str;
	   
	   for(int i=(str1.length()-1);i>=0;i--){
		   str2 = str2 + str1.charAt(i);
	   }
	   return str2;
	   
   }
   public boolean linearSearch(String str,String stra){
	   this.str1 = str;
	   this.str2 = stra;
	   
	   if(str1.contains(str2)){
		   return true;
	   }
	   else
	   {
		  return false;
	   }
   }
   public String replaceString(String str,String stra){
	   
	   if(str1.contains(str)){
		   
		   str3 = str1.replaceAll(str, stra);
		   return str3;
	   }
	   else
	   {
		  return null;
	   }
   }
}
