package Naveen_java.java;

import java.util.Arrays;

public class Find_Largest_Smallest_Value {

	public static void main (String args[]) {
		
	int Num[] = {12,34,435,67,23,-89,67,2323,4,876};
	
	
	int Largest = Num[0];
	int Smallest = Num[0];
	
	for(int i=1;i<Num.length;i++)
	{
		if(Largest<Num[i])
		{
			Largest = Num[i];
		}
		else if (Smallest>Num[i])
		{
			Smallest = Num[i];
		}
		
	}System.out.println("Num List :"+Arrays.toString(Num));
	System.out.println("Largest :"+Largest);
	System.out.println("Smallest :"+Smallest);
	
	
		
		
	}
	
	
}
