import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter number :");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && a>c)
		
		{
			System.out.println("first number largest :");
		}
		else if(b>a && b>c)
		{
			System.out.println("second number largest :");
		}
		else if(c>a && c>b)
		{
		System.out.println("third number largest :");	
		}
		else
		{
		System.out.println("exit :");	
		}
	}
}
