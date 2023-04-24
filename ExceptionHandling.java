package Exceptions;

public class ExceptionHandling {
public static void main(String[] args) throws IndexOutOfBoundsException {
	System.out.println("First Statement");
	int arr[]= {1,2,3,4};
	try {
		System.out.println(arr[1]);
		System.out.println(arr[4]);
		String str= "Nandini";
		System.out.println(str.charAt(3));
		System.out.println(12/0);
		System.out.println("simple statement");
		System.out.println("simple statement");
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
		System.out.println(e.toString());
		e.printStackTrace();
	} catch(Exception e) {
	System.out.println("catch block 2");
	e.printStackTrace();
}
	System.out.println(".....");
}
}