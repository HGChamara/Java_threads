package thread_synchronization;

public class ThreadImpl implements Runnable
{
	private Thread thread;
	private Counter counter;
	private String threadName;

	public ThreadImpl(String name, Counter counter)
	{
		this.threadName = name;
		this.counter = counter;
	}
	public void run() 
	{
		synchronized(counter) 
		{
			counter.countUp();
		}
		System.out.println("Thread "+threadName+" Ended.");
	}
	
	public void start() 
	{
		if(thread==null) 
		{
			System.out.println("Thread "+threadName+" Started.");
			thread = new Thread(this, threadName);
			thread.start();
		}
	}

}
