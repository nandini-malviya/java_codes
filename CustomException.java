package Exceptions;

class AgeNotValid extends Exception {
	
public AgeNotValid(String message) {
	super(message);
}
}
public class CustomException{
	public static void getAge(int age) throws AgeNotValid {
		if(age >18) {
			try {
				throw new AgeNotValid("AgeNotValid");
			} catch (Exception e) {
				e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());			
			}
		}else {
			System.out.println("Age Valid");
		}
	}
	public static void main(String[] args) throws AgeNotValid {
		getAge(21);
	}
}