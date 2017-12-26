package com.htc.exercise1stwk.main;

public class StringServiceProvider<Char> {
	
	public String reverseStr(String str) {
		byte[] strAsByteArr= str.getBytes();
		byte[] result = new byte[strAsByteArr.length]; 
	   	
    	for(int i=0; i< strAsByteArr.length; i++) {
    		
    		result[i] = strAsByteArr[strAsByteArr.length - i - 1];
    		
    	}
    	return new String(result);
    	
	}	
	
	public int linearSearch(String str1, String str2) {
		char[] orgChArr=str1.toCharArray();
		char[] srchChArr=str2.toCharArray();
		
		int found = 0;
				
		for (int i=0;i<srchChArr.length;i++) {
			for (int j=0;j<orgChArr.length;j++) {
				if (srchChArr[i]==orgChArr[j]) {
					found = 1;
					break;
				}
					
				else
					found = 0;

			}
		}
		return found;
					
	}
	
	public String replaceString(String realstr, String srchstr, String replstr) {
		String replacestr = realstr.replaceFirst(srchstr, replstr);
		return replacestr;
	}
		
}
			  

