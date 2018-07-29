import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Even{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		for(int i=x+1;i<y;i++)
		{
			if(i%2 == 0)
			     System.out.print(i+" ");
		}
	}
}
