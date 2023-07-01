package week3.day1;

public class BMW extends Car {
	
	public void applyBrake() {
		System.out.println("ABS brakes");
	}
	
	
	
	public static void main(String[] args) {
		BMW obj = new BMW();
		obj.applyBrake();
		
		
	}
}
