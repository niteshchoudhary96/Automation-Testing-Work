package Naveen_java.java;

public class Reverse_integer {

	public static void main(String[] args) {
		
		int s = 126546456;
		int rev= 0;
		
		while (s!=0) {
			rev = rev*10 +s%10;
			s = s/10;
			
		}
		System.out.println(rev);
		
		// StringBuffer method
		
		 
		long s1 = 123455;
		System.out.println(  new StringBuffer(String.valueOf(s1)).reverse());
		
	}

}
