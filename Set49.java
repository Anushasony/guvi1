import java.util.*;
import java.lang.*;
import java.io.*;
class Set49
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int[] a=new int[10];
		for(int i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		int max=a[0];
		for(int i=1;i<10;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
