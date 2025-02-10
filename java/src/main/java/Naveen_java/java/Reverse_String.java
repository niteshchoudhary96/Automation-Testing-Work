package Naveen_java.java;

public class Reverse_String {

	public static void main(String[] args) {
		
		String s= "Selenium String";
		
		String rev = "";
		System.out.println(s.length());
		
		// using for loop
		for (int i=s.length()-1; i>=0;i--) {
			
			
			rev = rev+s.charAt(i);
			
			
		}
	      System.out.println(rev);
		
		
		// using stringbuffer class;

		StringBuffer sf = new StringBuffer(s);
 	System.out.println(sf.reverse());
		
	}

}
