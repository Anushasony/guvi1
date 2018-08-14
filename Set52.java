import java.util.*;
import java.lang.*;
import java.io.*;
class Set52
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s1,s2;
		Scanner s=new Scanner(System.in);
		s1=s.nextLine();
		s2=s.nextLine();
		if(s1.compareTo(s2)>0)
		{
		    System.out.print(s1);
		}
		else
		{
			System.out.print(s2);
		}
	}
}
