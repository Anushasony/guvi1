import java.util.*;
import java.lang.*;
import java.io.*;
 

class Three
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
 
        Scanner scan = new Scanner(System.in);
 
 
        char ch = scan.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u')
                {
                	System.out.println("Vowel");
                }
 
 
            else if((ch >= 'a'&& ch <= 'z')) 
            {
            	System.out.println("Consonant");
            }
 
 
            else if( ch >= '0' && ch <= '9')
            {
                System.out.println("invalid");
            }
	}
}
