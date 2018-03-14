package lock;

public class ThreadImpl extends Thread
{
	RandomSleep sleeper;
	
	ThreadImpl(String threadName, RandomSleep sleeper)
	{
		super(threadName);
		this.sleeper = sleeper;
	}
	
	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getName()+" start random sleeping ");
		sleeper.sleepRandom();
	}
	
}
