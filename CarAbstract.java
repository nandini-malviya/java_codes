package Wiley_core_java;

abstract class Vehicles{
	protected String color;
	protected int speed;
	protected int numWheels;
	
	public Vehicles(String color, int speed,int numWheels) {
		this.color =color;
		this.speed= speed;
		this.numWheels-= numWheels;
	}
	public abstract void move();
}
class Car extends Vehicles{

	public Car( color, int speed, int numWheels) {
		super(color, speed, numWheels);
		// TODO Auto-generated constructor stub
	}
	public void move() {
		
	}
	public void turn() {
		System.out.println("Turning Left and right");
	}
}
public class CarAbstract {

}
