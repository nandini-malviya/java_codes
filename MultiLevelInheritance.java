package Wiley_core_java;

class Vehicle{
	public void tier() {
		System.out.println("tier");
	}
	public void steering() {
		System.out.println("Steering");
	}
}
class Cars extends Vehicle{
	public void airBag() {
		System.out.println("airBag");
	}
}
class SmartCar extends Cars{
	public void sensor() {
		System.out.println("Sensor");
	}
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
		SmartCar sc=  new SmartCar();
		sc.sensor();
		sc.airBag();
		sc.steering();
	}
}


