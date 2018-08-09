import java.io.*;
import java.util.*;
class Sort3
{
	public static void main(String[] args)throws java.lang.Exception
	{
               Scanner s=new Scanner(System.in);
               int n=s.nextInt();
               int[] a=new int[n];
               for(int i=0;i<n;i++)
               {
               	a[i]=s.nextInt();
               }
               for(int i=0;i<n-1;i++)
               {
               	for(int j=i+1;j<n;j++)
               	{
               		if(a[i]>a[j])
               		     {
               		     	int temp;
               		     	temp=a[i];
               		     	a[i]=a[j];
               		     	a[j]=temp;
               		     }
               	}
               }
              
               if(n%2==0)
               {
               	int x1=n/2;
               	int x2=x1-1;
               	int avg=(a[x1]+a[x2])/2;
               	System.out.println(avg);
               	
               }
               else
               {
               	int x=n/2;
               	System.out.println(a[x]);
               }
                  
               
	}
}
