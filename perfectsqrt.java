/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int prod=m*n;
		int s=(int)Math.sqrt(prod);
		if(s*s==prod)
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}
}
