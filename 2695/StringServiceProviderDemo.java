import java.util.Scanner;



public class StringServiceProviderDemo {
	public static void main(String args[]) {
   StringServiceProvider Ss = new StringServiceProvider();
   String Str;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter string to reverse ");
   Str = sc.next();
   String Newstr = Ss.revstr(Str);

//System.out.println("Reversed : "+new StringBuilder(Str).reverse().toString()); Direct method to reverse string

System.out.println("Revered string : " +Newstr);
/* linear search of the string */
System.out.println(Ss.linearsearch(Newstr, 'l'));

String R = Ss.rplcstr(Newstr,"HTC","HTC GLOBAL SERVICES");
System.out.println(R);
}
}
