package thread_synchronization;

public class Counter 
{
	public void countUp() 
	{
		for(int i=0; i<10; i++) 
		{
			System.out.println("count = "+i);
		}
	}
}
