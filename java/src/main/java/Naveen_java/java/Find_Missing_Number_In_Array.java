package Naveen_java.java;

public class Find_Missing_Number_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {1,2,3,4,5,6,8,9,10};
		
		int sum = 0;

		for (int i = 0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
	System.out.println(sum);
	
	
	int sum1 =0;
	for (int j=1;j<=10;j++)
	{
		sum1=sum1+j;
	}
	System.out.println(sum1);
	
	
	}
	
	

}
