import java.util.*;

    	class Calculator
	{
		public static void main(String[] args) 
		{   int sum,sub,mul,div;

			Scanner sc1=new Scanner (System.in);
			System.out.print("enter the value of a :");
			int a= sc1. nextInt();
			System.out.print("enter the value of b :");
			int b= sc1. nextInt();
			System.out.println("Enter 1 for sum");
			System.out.println("Enter 2 for sub");
			System.out.println("Enter 3 for mul");
			System.out.println("Enter 4 for div");
			int n= sc1. nextInt();
			
			switch(n)
            {
			case 1:
			sum=a+b;
			System.out.println("Ans="+sum);
			break;

            case 2:
			sub=a-b;
			System.out.println(sub);
			break;

            case 3:
			mul=a*b;
			System.out.println(mul);
			break;

			case 4:
			div=a/b;
			System.out.println(div);
			break;

			default :
			System.out.println("Invalid numbr");
            }
		sc1.close();
		}
	}