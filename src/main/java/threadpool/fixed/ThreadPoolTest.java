package threadpool.fixed;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolTest 
{
	public static void main(String[] args) 
	{
		ExecutorService executor = Executors.newFixedThreadPool(2);
		ThreadPoolExecutor pool = (ThreadPoolExecutor)executor;
		
		System.out.println("Largest pool size - "+pool.getLargestPoolSize());
		System.out.println("Maximum allowed threads - "+pool.getMaximumPoolSize());
		System.out.println("Current threads in pool - "+pool.getPoolSize());
		System.out.println("Total number of threads - "+pool.getTaskCount());
		
		executor.submit(new ThreadTask());
		executor.submit(new ThreadTask());
		
		executor.shutdown();
		
	}

}
