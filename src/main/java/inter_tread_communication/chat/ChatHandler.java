package inter_tread_communication.chat;

public class ChatHandler 
{
	boolean questionAsked = false;
	
	synchronized void question(String message) 
	{
		if(questionAsked) 
		{
			try 
			{
				wait();
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(message);
		questionAsked = true;
		notify();
	}
	
	synchronized void answer(String message) 
	{
		if(!questionAsked) 
		{
			try 
			{
				wait();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println(message);
		questionAsked=false;
		notify();
	}
	
}
