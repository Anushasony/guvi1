import java.io.*;
import java.util.*;
class Odd
{
  public static void main(String[] args) throws java.lang.Exception
  {
      Scanner s=new Scanner(System.in);
      int x=s.nextInt();
      int y=s.nextInt();
      for(int i=x+1;i<y;i++)
      {
        if(i%2 !=0)
              System.out.print(i+" ");
      }
  
  }
}
