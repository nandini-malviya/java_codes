package Exceptions;

public class ThrowClass throws InteruptedException {
public static  void m1() {
	try {
		m2();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
	public static void m2() throws InteruptedException {
		Thread t= new Thread();
		t.sleep(1000);
	}
	public static void main(String[] args)throws InteruptedException {
		m1();
	}
		
	}
