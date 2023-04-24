package Exceptions;

import java.util.ArrayList;

public class StringNotFound extends RuntimeException {
	public StringNotFound(String message) {
		super(message);
	}
}
 class UnChecked{
	public static void main(String[] args) {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList<String> students = new ArrayList();
		students.add("Nandini");
		students.add("Isha");
		students.add("Nupur");
		if(!students.contains("nandinii")) {
			try {
				throw new StringNotFound("This string not found");
			} catch (StringNotFound e) {
				e.printStackTrace();
			}
		}
		System.out.println("message one");
		System.out.println("message two");
	}
}
