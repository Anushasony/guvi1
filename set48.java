import java.util.*;
import java.lang.*;
import java.io.*;
class set48
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		m=m^n;
		n=m^n;
		m=m^n;
		System.out.println(m+" "+n);
	}
}
