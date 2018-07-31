/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Armstrong
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int sum=0,a,temp;
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		temp=num;
		while(num>0)
		{
			a=num%10;
			num=num/10;
			sum=sum+(a*a*a);
		}
		if(temp==sum)
		{
			System.out.println("yes");
			
		}
		else 
		  {
		  	System.out.println("no");
		  }	  
	}
}
