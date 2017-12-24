
public class StringServiceProvider {
    
	public StringServiceProvider() {
		super();
		 
	}
	
	public String revstr(String Str) {
	  String S = "";
	  
	  int len =  Str.length();
	  int j = len - 1;
	  
	  
	  for (int i=len - 1; i >=0; i--)
	  {
		 S = S + Str.charAt(i);
		 
	  }
	  
	  
	  return S;
	}
	
	public int linearsearch(String search, char C) {
	  	  return search.indexOf(C);
	}
	
   public String rplcstr(String orgstring, String serachablestr, String reaplaceablestr ) {
	   return orgstring.replace( serachablestr, reaplaceablestr);
   }
	

}
