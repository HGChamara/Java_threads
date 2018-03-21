package threadpool.fixed;

import java.util.concurrent.TimeUnit;

public class ThreadTask implements Runnable
{
	public void run() 
	{
		try 
		{
			Long duration = (long) (Math.random()*10);
			System.out.println("Running thread - "+Thread.currentThread().getName());
			TimeUnit.SECONDS.sleep(duration);
			System.out.println("Thread completed - "+Thread.currentThread().getName());
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}

}
