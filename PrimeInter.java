import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PrimeInter
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		for(int i=x+1;i<y;i++)
		{
			int cnt=0;
			for(int j=1;j<(i/2)+1;j++)
			{
				if(i%j == 0)
				     cnt++;
			}
			if(cnt==1)
			    System.out.print(i+" ");
		}
	}
}
