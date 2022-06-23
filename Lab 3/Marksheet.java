import java.util.*;
import java.io.*;

    	class Marksheet
	{
		public static void main(String[] args) 
		{   
			int sum=0,per;
			Scanner sc1=new Scanner (System.in);
			System.out.println("Enter 1 sub marks");
			int a= sc1. nextInt();
			System.out.println("Enter 2 sub marks");
			int b= sc1. nextInt();
			System.out.println("Enter 3 sub marks");
			int c= sc1. nextInt();
			System.out.println("Enter 4 sub marks");
			int d= sc1. nextInt();
			System.out.println("Enter 5 sub marks");
			int e= sc1. nextInt();
			sum=a+b+c+d+e;
			per=sum/5;
			System.out.println("Percentage="+per);
			if(per>=60)
			{
				System.out.println("First class");
			}
			else if(per>=50)
			{
				System.out.println("Second class");
			}
			else if(per>=40)
			{
				System.out.println("Third  class");
			}
			else if(per<40)
			{
				System.out.println("Second class");
			}
		}
	}

