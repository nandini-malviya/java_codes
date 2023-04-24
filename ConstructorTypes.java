package Wiley_core_java;

public class ConstructorTypes {
public ConstructorTypes(int a, int b) {
	System.out.println(" 2 args count" + (a+b));
}
public ConstructorTypes() {
	System.out.println(" 0 args count");
}public ConstructorTypes(float a, float b) {
	this(2,7);
	System.out.println(" 2 args count" + (a+b));
}
public void add() {
}

	public static void main(String[] args) {
	ConstructorTypes ct= new ConstructorTypes();
	ConstructorTypes ctadd = new ConstructorTypes(2.3f,3);
	}

}
