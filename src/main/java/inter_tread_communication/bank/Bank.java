package inter_tread_communication.bank;

public class Bank 
{
	private double balance;
	
	synchronized void withdrawMoney(double amount) 
	{
		System.out.println("going to withdrow money");
		if(balance>=amount) 
		{
			balance = balance-amount;
			System.out.println("money withdrown");

		}
		else 
		{
			System.out.println("insufficient bank balance.waiting for deposit");
			try 
			{
				wait();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	synchronized void depositMoney(double amount) 
	{
		System.out.println("going to deposit money");
		balance+=amount;
		System.out.println("money deposited");
		notify();
	}
}
