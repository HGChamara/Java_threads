package thread_runnable;

public class ThreadTest 
{
	public static void main(String[] args) 
	{
		ThreadRunnable thread1 = new ThreadRunnable("Thread 1");
		thread1.start();
		
		ThreadRunnable thread2 = new ThreadRunnable("Thread 1");
		thread2.start();
	}
	
}
