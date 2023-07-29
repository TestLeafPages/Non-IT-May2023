package week7.day1;

public class Car extends Vehicle {
     
	public Car() {
		super();
		System.out.println("I am a child class");
	}
	String colour="Rose Gold";
	
	public void colourCar() {
		System.out.println("Car class");
		
		super.applyBrake();
		super.soundHorn();
		
		System.out.println(super.colour);
	}
	public void soundHorn() {
		System.out.println("Car horn");
		super.soundHorn();
	}
	
	
	public static void main(String[] args) {
    Car obj =new Car();
       System.out.println(obj.colour);
       obj.colourCar();

	}
}
