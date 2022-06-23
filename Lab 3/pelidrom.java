import java.util.*;
import java.io.*;

    	class pelidrom
	{
		public static void main(String[] args) 
		{   int a,rev=0,temp;

			Scanner sc1=new Scanner (System.in);
			System.out.println("enter the number");
			int n= sc1. nextInt();
			temp=n;
			while(n>0)
			{
				a=n%10;
				rev=a+(rev*10);
				n=n/10;
			}
			if(temp==rev)
			{
				System.out.println("This number is Pelidrom");
			}
			else
			{
				System.out.println("This number is not Pelidrom");
			}
		}
	}
