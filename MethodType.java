package Wiley_core_java;
class Test{
	public static int add(int v1, int v2) {
		int val= v1 + v2;
		return val;
	}
}
public class MethodType {
	public void add(int val1, int val2) {
	int val= val1 + val2;
	System.out.println("addition of instance method is" +val);
} public static void mul(int val1, int val2) {
int val = val1 * val2;
System.out.println("Multiplication  of Static method is" +val);}
public static void main(String[] args) {
	mul(2,4);
	MethodType mt= new MethodType();
	mt.add(4,2);
	System.out.println("Test class" + Test.add(2, 4));
	}

}
