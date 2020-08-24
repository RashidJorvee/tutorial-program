package strings;

public class SUbString {

	public static void main(String[] args) {
		String message = "Hello world!";
		String newMessage = message.substring(6, 12);
		System.out.println(newMessage);
		newMessage = message.substring(6, 12) + message.substring(12, 6);
		System.out.println(newMessage);
	}

}
