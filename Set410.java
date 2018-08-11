import java.util.*;
import java.lang.*;
import java.io.*;
class c
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=1,b=1,c;
		System.out.print(a+" "+b);
		if(n>2)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		else
		{
			System.out.print(a+" "+b);
		}
	}
}
