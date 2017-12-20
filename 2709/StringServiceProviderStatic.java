package assignment;

public class StringServiceProviderStatic {
	
		
	public static String reverseString(String orginalString)
	{
		String reverse = new StringBuilder(orginalString).reverse().toString(); 
		return  reverse;
	}
	
	public static int linearSerach(String orginalString, char searchChar)
	{
		
		int result = orginalString.indexOf(searchChar);
		
		if (result >= 0)
			return result;
			else	
		return -1;
			
	}
	
	public static String replaceString(String orginalString, char serachChar , char replaceChar )
	{
		int result = orginalString.indexOf(serachChar);
		
		if (result >= 0)
			return orginalString.replace(serachChar, replaceChar);
			else	
		return "false";
		
	}
	
}
