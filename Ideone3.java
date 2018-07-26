import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone3
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>=b && a>=c)
		{
			System.out.println(a);
 
		}
		else if(b>=a && b>=c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
	}
}
