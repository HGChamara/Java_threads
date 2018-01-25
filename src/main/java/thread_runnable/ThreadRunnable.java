package thread_runnable;

public class ThreadRunnable implements Runnable
{
	private String threadName;
	Thread thread;
	
	public ThreadRunnable(String threadName) 
	{
		this.threadName = threadName;
	}
	
	public void run() 
	{
		System.out.println("Running thread - "+threadName);
		try 
		{
			for(int i=3; i>=0; i--) 
			{
				System.out.println("Thread "+threadName+ " -- "+i);
				Thread.sleep(50);
			}
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void start() 
	{
		System.out.println("Starting Thread "+threadName);
		if(thread==null) 
		{
			thread = new Thread(this, threadName);
			thread.start();
		}
	}
}
