import java.util.*;
import java.lang.*;
import java.io.*;
class Power
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner s=new Scanner(System.in);
		 int base=s.nextInt();
		 int exponent=s.nextInt();
		  long result = 1;
       while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println(result);
	}
}
