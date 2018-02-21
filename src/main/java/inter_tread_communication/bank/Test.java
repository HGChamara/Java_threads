package inter_tread_communication.bank;

public class Test
{
	public static void main(String[] args) 
	{
		final Bank bank = new Bank();
		
		Thread thread1 = new Thread("withdrower") 
		{
			public void run() 
			{
				bank.withdrawMoney(1000);
			}
		};
		
		Thread thread2 = new Thread("depositor") 
		{
			public void run() 
			{
				bank.depositMoney(15000);
			}
		};
		
		thread1.start();
		thread2.start();
	}
	

}
