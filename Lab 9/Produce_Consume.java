import java.util.*;
import java.lang.Thread;
class MyHeadPhone
{
	static int stoke=5;
	public void producer()
	{
		while(true)
		{
			try
			{
				wait(100);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		notifyAll();
		stoke++;
		System.out.println("Stoke ="+stoke);
		
	}
	public void consumer()
	{
		while(true)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		notifyAll();
		stoke--;
		System.out.println("stoke ="+stoke);
	}
}
class Producer extends Thread
{
	MyHeadPhone hp;
	public Producer(MyHeadPhone hp){
		this.hp = hp;
	}
	public void run()
	{
		while(true){
				hp.producer();
		try{	
			sleep((int)(Math.random()*200));
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
}
class Consumer extends Thread
{
	MyHeadPhone hp;
	public Consumer(MyHeadPhone hp){
		this.hp = hp;
	}
	public void run()
	{
		while(true){
				hp.consumer();
		try{
			sleep((int)(Math.random()*200));
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
}
class Produce_Consume 
{
	public static void main(String[] args)
	{
		MyHeadPhone hp =new MyHeadPhone();
		Producer obj1 = new Producer(hp);
		Consumer obj2 = new Consumer(hp);
		obj1.start();
		obj2.start();
		// t.start();
	}
}