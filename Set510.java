import java.util.*;
import java.lang.*;
import java.io.*;
class Set510
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=1;
		while(n>x)
		{
		x=x*2;
		}
		if(n==x)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
