package Wiley_core_java;

class Vehicle1{
	public void tier() {
		System.out.println("tier");
	}
}
class Car1 extends Vehicle1{
	public void airBag() {
		System.out.println("airBag");
	}
}
class Truck extends Car1{
	public void HydraulicPump() {
		System.out.println("HydraulicPump");
	}
}
public class HierarchyInheritance {
	public static void main(String[] args) {
		Truck Tc=  new Truck();
		Tc.HydraulicPump();
		Tc.airBag();
		Tc.tier();
	}
}

