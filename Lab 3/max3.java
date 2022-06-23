import java.util.*;
class max3
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc1=new Scanner(System.in);
		a=sc1.nextInt();
		b=sc1.nextInt();
		c=sc1.nextInt();
		if(a>b)
		{
			if(a>c)
			{
			System.out.println("a is maximum Number");
			}
			else
			{
			System.out.println("c is maximum Number");	
			}
		}
		else if(b>a)
		{
		if(b>c)
			{
			System.out.println("b is maximum Number");
			}
			else
			{
			System.out.println("c is maximum Number");	
			}	
		}

  }
}