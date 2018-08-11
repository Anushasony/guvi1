import java.util.*;
import java.lang.*;
import java.io.*;
class Set46
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int len=str.length();
		int count=0;
		for(int i=0;i<len;i++)
	   {
	   	 if(Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i)))
	   	 {
	   	 	continue;
	   	 }
	   	 else
	   	 {
	   	 	count++;
	   	 }
	   }
	   System.out.print(count);
	}
}
