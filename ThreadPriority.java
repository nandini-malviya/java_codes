package JavaThread;


class TPriority extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=10; i++)
			
System.out.println(" Thread Name : - " + Thread.currentThread().getName()+ "  -  Thread Priority:- " + Thread.currentThread().getPriority());
		}
	}
public class ThreadPriority {
public static void main(String[] args) {
	TPriority t1= new TPriority();
	TPriority t2= new TPriority();
	t1.start();
	t2.start();
}
}