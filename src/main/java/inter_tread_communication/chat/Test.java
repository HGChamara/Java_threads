package inter_tread_communication.chat;

public class Test 
{
	public static void main(String[] args) 
	{
		ChatHandler chatHandler = new ChatHandler();
		new Thread1(chatHandler);
		new Thread2(chatHandler);
	}
}
