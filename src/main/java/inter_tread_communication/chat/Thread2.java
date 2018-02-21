package inter_tread_communication.chat;

public class Thread2 implements Runnable
{
	ChatHandler chatHandler;
	String[] answers = {"Answer1","Answer2","Answer3","Answer4"};
	
	Thread2(ChatHandler chatHandler)
	{
		this.chatHandler = chatHandler;
		new Thread(this,"answer").start();
	}

	public void run() 
	{
		for(String answer : answers) 
		{
			chatHandler.answer(answer);
		}
	}
	
}
