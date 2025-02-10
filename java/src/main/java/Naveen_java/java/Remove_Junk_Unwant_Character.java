package Naveen_java.java;

public class Remove_Junk_Unwant_Character {

	public static void main(String[] args) {
		
		
		String s = ";jhgdvh6757$&^&%^&&**((^9vhgvjyyrt76%&^";
		System.out.println(s.length());
		// Regular Expression: [a-zA-Z0-9]= remove this 
		  //                   [^a-zA-Z0-9] = contain this
		// s = s   because string are inmutation object
		s = s.replaceAll("[^a-zA-Z]", "");
		System.out.println(s);
		

	}

}
