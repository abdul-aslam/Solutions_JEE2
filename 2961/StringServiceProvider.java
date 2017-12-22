package exercise;

public class StringServiceProvider {
	public String reverseString(String input){
		StringBuffer s = new StringBuffer(input);
		return s.reverse().toString();
	}
	
	public int linearSearch(String input){
		int index = input.indexOf(input);
		return index;
	}
	
	public String searchAndReplace(String input, String search, String replace){
		int index = input.indexOf(search);
		if(index != -1){
			input = input.replace(search, replace);
		}
		return input;
	}
}
