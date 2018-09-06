import java.util.*;
import java.lang.*;
import java.io.*;
class Set63
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		int r;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.print(sum);
	}
}
