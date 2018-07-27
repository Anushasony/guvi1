import java.util.*;
import java.lang.*;
import java.io.*;


class Six
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num % 400 == 0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
