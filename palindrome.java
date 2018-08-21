
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b="";
		for(int i=a.length()-1;i>0;i--)
		{
			b=b+a[i];
		}
		if(a.equals(b))
		{
			System.out.println("yes");
		}
		else
		  System.out.println("no");
	}
}
