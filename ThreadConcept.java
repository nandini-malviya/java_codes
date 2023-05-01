package JavaThread;
class Parent{
	public void m1() {
		System.out.println("this is m1 method");
	}
}	
	class T1 extends Thread{
		
		public void run() {
			System.out.println("By Thread Class");
		}
	}
	class T2 extends Parent implements Runnable{	
		
		public void run() {
			m1();
			System.out.println("By using Runnable interface");
		}
		public class ThreadConcept {
			public static void main(String[] args) {
				T1 t1= new T1();
				t1.start();
				T2 t2= new T2();
				Thread trd= new Thread(t2);
				trd.start();
			}
		}
	}