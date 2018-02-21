package inter_tread_communication.chat;

public class Thread1 implements Runnable 
{
	ChatHandler chatHandler;
	String[] questions = {"Question1?","Question2?","Question3?","Question4?"};
	
	Thread1(ChatHandler chatHandler)
	{
		this.chatHandler = chatHandler;
		new Thread(this,"question").start();
	}
	
	public void run() 
	{
		for(String question : questions) 
		{
			chatHandler.question(question);
		}
	}
	
}
