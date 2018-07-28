import java.util.*;
import java.lang.*;
import java.io.*;
class Twelve
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r,t,sum=0;
		t=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=(sum*10)+r;
		}
		if(t==sum)
		{
			System.out.println("yes");
			
		}
		else
		{
			System.out.println("no");
		}
	}
}
