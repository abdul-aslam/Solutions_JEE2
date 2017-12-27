package com.htc.oops;

public class StringServiceProvider {

		// Static example
		
		public static String reverse(String str) {
		
		// reverse string
		char arr[]=str.toCharArray();
	        int i=0,j=arr.length-1;
	        while(i<=j)
	        {
	            char temp=arr[i];
	            arr[i]=arr[j];
	            arr[j]=temp;
	            i++;
	            j--;
	        }
	        String reverse=new String(arr);
	        return reverse;
	      	}
			
		// Find Linear Search
		public static boolean findKeyinString(String str,char key){

			boolean flag=false;
			char[] str1=str.toCharArray();
			for(int i=0;i<str.length();i++){
				if(key==str1[i]){
					flag=true;
					break;				
				}
			}

			return flag;

		}

		// Replace String
			public static String ReplaceString(String Str, char FindChar, String B) 
			{
				String ReplaceString="";
				for (int i=0; i<Str.length();i++) 
				{
					if (FindChar == Str.charAt(i))
					{
						ReplaceString = ReplaceString + B;
					}
					else
					{
						ReplaceString = ReplaceString + Str.charAt(i);
					}
				}
				
				return ReplaceString;
				
			}
	}
