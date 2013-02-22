public class MessageManager {
	public MessageManager getInstance(){
		return new MessageManager();
	}

	public MessageManager(){
		System.out.println("MessageManager");
	}

	public void printMessage(String message){
		System.out.println(message);
	}
}
