

import java.util.*;
import java.lang.*;
import java.io.*;


class Eight
{
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
