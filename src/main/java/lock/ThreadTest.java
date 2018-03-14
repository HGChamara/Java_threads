package lock;

public class ThreadTest 
{
	public static void main(String[] args) 
	{
		RandomSleep sleeper = new RandomSleep();
		ThreadImpl thread1 = new ThreadImpl("Thread 1", sleeper);
		ThreadImpl thread2 = new ThreadImpl("Thread 2", sleeper);
		ThreadImpl thread3 = new ThreadImpl("Thread 3", sleeper);
		ThreadImpl thread4 = new ThreadImpl("Thread 4", sleeper);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
