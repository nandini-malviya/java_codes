package Wiley_core_java;

public class InstanceOrder {
	String name;
	int age;
	{
		name= "nandini";
		age= 21;
		System.out.println("Instance Block");
	}

public InstanceOrder() {
	System.out.println("Name:" + name + "Age" +age);
	System.out.println("Constructor Block");
}
public InstanceOrder(int a, int b) {
	System.out.println("Constructor paramaterized" + (a+b));}
	public static void main(String[] args) {
		InstanceOrder ior = new InstanceOrder();
		 new InstanceOrder(2,3);

	}
	}
