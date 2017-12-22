package htc.package3;

public class StringServiceProvider {

	public static String reverseString(String inString) {
		char[] inChar = inString.toCharArray();
		char[] outChar = new char[inChar.length];
		int j=0;
		for (int i=inString.length()-1; i>=0; i--) {
			outChar[j]=inChar[i];
			j++;
			}
		return String.copyValueOf(outChar);
	}
	public static int linearSearch(String inString, char ch) {
			char[] inChar = inString.toCharArray();
			for (int i=0; i<inChar.length; i++) {
				if (inChar[i] == ch) 
					return i+1;
			}
			    return 0;
	}
	
	public static String replaceString(String inString, char find, char replace) {
		char[] inChar = inString.toCharArray();
		char[] outChar = new char[inChar.length];
		
		for (int i=0; i<inChar.length; i++) {
			if (inChar[i] == find) 
				outChar[i] = replace;
			else 
				outChar[i] = inChar[i];
		}
		return String.copyValueOf(outChar);
		
}
	public static void main(String[] args) {
		String origString = "Home Sweet Home";
		System.out.println("Original String: " + origString);
		System.out.println("Reserved String: " + reverseString(origString));
		System.out.println("Char S " + "is found at position " + linearSearch(origString, 'S'));
		
	
		System.out.println("Replaced String: " + replaceString(origString,'o','0'));
		}
}
