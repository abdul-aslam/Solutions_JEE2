package com.htc.exc.three;

import java.lang.*;
import java.io.*;
import java.util.*;

public class StringServiceProvider {
   @SuppressWarnings("null")

	private String str;
    private boolean flag = false; 
   
	StringServiceProvider(){
		str = null;
	}
	
	StringServiceProvider(String str){
		this.str = str;
	}

	public String reverseString(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();	
		
	}
	
	public boolean searchString(String inString, String srchString) {
		if(inString.contains(srchString)) 
			return true;
		else
			return false;
	}
	
	public boolean linearsearch(String[] inString, String srchString) {
    
          for(int i=0;i<10;i++) {
        	  if(inString.equals(srchString)) { 
        		flag = true;
        		break;
        	  }
        	    
          }
          return flag;
	}
	
	
	public String replaceString(String str,String srchStr, String rplStr) {
		
		return str.replaceAll(srchStr, rplStr);
	}
		
	}
	
	

	

