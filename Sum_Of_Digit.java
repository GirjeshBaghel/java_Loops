import java.util.Scanner;

public class Sum_Of_Digit 
{
	
	public static void main ( String args[])
	{
		int n,res,sum=0;
		Scanner sc= new Scanner( System.in);
		System.out.println( " Enter the number : ");
		n=sc.nextInt();	
		do
		{
			res=n%10;
			sum=sum+res;
			n=n/10;
		}
		while( n>0);
		System.out.println("The sum of digits is = "+sum);
		
	}

 }
