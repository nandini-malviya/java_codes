package Exceptions;

public class FinalBlock {
public static void main(String[] args) {
	try {
		System.out.println("11111");
		System.out.println("wiley");
		try {
			System.out.println(10/0);	
		} catch(Exception e) {
		e.printStackTrace();
		//system.exit(0);
	}finally {
		System.out.println("nested close connection");}
	System.out.println("edge");
}	catch(Exception e) {
		System.out.println("catch block");
try {	
	System.out.println("try catch block inside catch block");
	System.out.println(10/0);
}catch(Exception ee) {
e.printStackTrace();
	}finally {
		//System.out.println(10/0);
		System.out.println("Clone Connection");
	}
	System.out.println("Last Statement");
}
}
}
