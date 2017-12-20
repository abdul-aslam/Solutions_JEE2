package assignment;

public class StringServiceProvider {
	
		
	public String reverseString(String orginalString)
	{
		char stringToCharArray[] = orginalString.toCharArray();
		char[] reverseString = new char[stringToCharArray.length];
		int j =0;
		
		for (int i = stringToCharArray.length -1 ; i >= 0; i--)
		{
			reverseString[j] = stringToCharArray[i];
			j++;
		}
		return String.valueOf(reverseString); 
	}
	
	
	public int linearSerach(String orginalString, char searchChar)
	{
		char stringToCharArray[] = orginalString.toCharArray();
		
		for (int i = 0 ; i < stringToCharArray.length - 1 ; i ++)
		{
			if(stringToCharArray[i] == searchChar  )
				return i ;
		}
		
		return -1;
			
	}
	
	public String replaceString(String orginalString, char serachChar , char replaceChar )
	{
		char stringToCharArray[] = orginalString.toCharArray();
		Boolean flag = false;
		for (int i = 0 ; i < stringToCharArray.length - 1 ; i ++)
		{
			if(stringToCharArray[i] == serachChar )
			{	
				stringToCharArray[i] = replaceChar;
				flag = true;
			}
		}
		if (flag)
			return String.valueOf(stringToCharArray);
		else
			return "false";
		
	}
	
}
