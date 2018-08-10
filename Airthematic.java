import java.util.*;
import java.lang.*;
import java.io.*;
class Airthematic
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n,a,d;
		n=s.nextInt();
		a=s.nextInt();
		d=s.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a;
			a=a+d;
    }
	  System.out.println(sum);
	}
}
