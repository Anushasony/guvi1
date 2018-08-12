import java.util.*;
import java.lang.*;
import java.io.*;
class Set58
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		int res=0;
		for(int i=0;i<n;i++)
	    {
	    	a[i]=s.nextInt();
	    	res=res+a[i];
	    }
	    System.out.print(res/n);
	}
}
