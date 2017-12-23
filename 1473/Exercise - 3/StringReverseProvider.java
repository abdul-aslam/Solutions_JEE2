package com.htc.stringreverseprovider;

public class StringReverseProvider {

	//Class variable declaration
	private String rString;
	static String rStringStatic;

	//static variable initialization
	static
	{
		rStringStatic = "";
	}

	//Default  Constructor
	public StringReverseProvider()
	{
		rString = "";
	}


	//Reverse a string using the StringBuilder object
	public StringBuilder reverseStringBuilder(String inputString)
	{  
		StringBuilder str = new StringBuilder(inputString);
		return str.reverse();
	}

	//Reverse a string using the for loop concept
	public String reverseString(String inputString)
	{
		for(int i = inputString.length();i > 0 ;i--)
		{
			rString = rString + inputString.substring((i - 1),i);
		}
		return rString;
	}

	//Reverses a string using array and for loop concept (static method)
	public static String reverseStringStatic(String inputString)
	{
		char[] strArray = inputString.toCharArray();
		String finalString = "";

		for(int i= inputString.length() ; i > 0 ; i--)
		{
			finalString = finalString + strArray[i - 1];  
		}
		rStringStatic = finalString;
		return rStringStatic;
	}


	//Search a given string using the index option
	public void searchString(String inputString,String srchString)
	{
		int stringPosition = 0;
		stringPosition = inputString.indexOf(srchString);

		if(stringPosition > 0)
		{
			System.out.println("Search string is found in the given string non static method");	
		}
		else
		{
			System.out.println("Search string is not found in the given string no static method");
		}
	}


	//search a give string using contains concept (Static method)
	public static void searchStringStatic(String inputString,String srchString)
	{
		if(inputString.contains(srchString) == true)
		{
			System.out.println("Search string is found in the given string - static method");
		}
		else
		{
			System.out.println("Search string is not found in the given string - static method");	
		}
  }

	//Replace the traget string in the given using the replacement string
	public void replaceString(String inputString, String trgString, String replString)
	{
		int stringPosition = 0;
		stringPosition = inputString.indexOf(trgString);

		if (stringPosition > 0)
		{
			System.out.println("Traget string is replaced in the given string  - no static method : " + inputString.replace(trgString, replString));
		}
		else
		{
			System.out.println("Target string is not found in the given string");
		}

	}

	//Replace the traget string in the given sting using the contentEqual concept and concatenation concept
	public static void replaceStringStatic(String inputString,String trgString, String replString)
	{		
		String[] strArray = inputString.split(" ");
		boolean strFound= false;
		String finalString = "";
		String tempString ="";
		
	     // If there is only one word in the string   
        if (strArray.length == 1)
        {
        	tempString = strArray[0];
        	
        	for(int i = 0 ; i < tempString.length() ; i++)
        	{
        		if (tempString.substring(i, (i + 1) ).contentEquals(trgString))
        		{
        			finalString = finalString.concat(replString);
        			strFound = true;
        		}
        		else
        		{
        			finalString = finalString.concat(tempString.substring(i,(i + 1)));
        		}
        	}
        }
        else  // when multiple words in the string
        {
        	for(int i = 0; i < strArray.length ; i++)
    		{
    			if (strArray[i].contentEquals(trgString))
    			{
                   	finalString = finalString.concat(replString).concat(" ");
    				strFound = true;
    			}
    			else
    			{
    				finalString = finalString.concat(strArray[i]).concat(" ");
    				
    			}
    		}

        }
		
		if(strFound)
		{
			System.out.println("Target string is replaced in the given string  - static method : "+finalString);
		}
		else
		{
			System.out.println("Target string is not found in the given string");
		}
	}

}
