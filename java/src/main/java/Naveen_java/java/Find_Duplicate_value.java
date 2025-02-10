package Naveen_java.java;

public class Find_Duplicate_value {

	public static void main(String[] args) {
		
		String names[] = 
			{"nit","mit","iit","nit","jit","mit"};

		for(int i=0;i<names.length;i++)
			
			for (int j=i+1;j<names.length;j++)
				
				if(names[i].equals(names[j]))
				{
					System.out.println(names[i]);
				}
		
		
		
		
		
		
	}

}
