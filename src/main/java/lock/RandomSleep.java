package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RandomSleep 
{
	private final Lock lock = new ReentrantLock();
	public void sleepRandom() 
	{
		lock.lock();
		try 
		{
			Long duration = (long) (Math.random()*10000);
			Thread.sleep(duration);
			System.out.println(Thread.currentThread().getName()+" time taken "+(duration/1000)+" seconds");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			System.out.println(Thread.currentThread().getName()+" slept successfully");
		}
		lock.unlock();
	}
}
