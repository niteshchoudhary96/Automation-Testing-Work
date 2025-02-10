package Practice_Java;
import java.lang.*;
import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		

// reverse string
		
		
		String name  = "Nitesh khus";
		
		String rev = "";
		
		for (int i=name.length()-1;i>=0;i--)
			
		{
			rev = rev+name.charAt(i);
			
		};
		
		System.out.println(rev);
		
		
		
		
		
		
		
		StringBuffer n = new StringBuffer(name);
		
		System.out.println(n.reverse());
		
		
		int a = 12345;
		int b= 0;
		
		while (a!=0)
		{
			b = b*10 + a%10;
			a = a/10;
		}
		System.out.println(b);
		
		
		name = name.replaceAll("[^a-z]", "");
System.out.println(name);



int c []  = {1,2,3,4,7,8,9};
int d = 0;

for (int k=0;k<=c.length;k++)
{
	
	d=d+c[k];
}
System.out.println(d);
int e=0;
for (int j=1;j<=9;j++)
{
	e=e+j;
}System.out.println(e);











	}

}

