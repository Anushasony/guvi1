import java.util.*;
import java.lang.*;
import java.io.*;
class Set53
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)==' ')
			    continue;
			else
			   System.out.print(st.charAt(i));
		}
	}
}
