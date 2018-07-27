
import java.util.*;
import java.lang.*;
import java.io.*;

class Nine
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int K=s.nextInt();
		int[] a={1,2,3,4,5};
		int sum=0;
		for(int i=1;i<=K;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
