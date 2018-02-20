package thread_synchronization;

public class ThreadSyncRun 
{
	public static void main(String[] args) 
	{
		Counter counter = new Counter();
		
		ThreadImpl thread1 = new ThreadImpl("thread1",counter);
		thread1.start();
		
		ThreadImpl thread2 = new ThreadImpl("thread2",counter);
		thread2.start();
	}
}
