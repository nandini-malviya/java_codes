package StringlClasses;

public class StringBufferDemo {
public static void main(String[] args) {
	StringBuffer chatHistory = new StringBuffer();
	String sender = "Nandini";
	String message = "hello Vanshu";
	chatHistory.append(sender);
	chatHistory.append(":");
	chatHistory.append(message);
	chatHistory.append("\n");
	
	sender= "Vanshu";
	message = " Hey Nandini";
	chatHistory.append(sender);
	chatHistory.append(":");
	chatHistory.append(message);
	chatHistory.append("\n");
	System.out.println(chatHistory);
} 
}
