package week1.day1;

public class LearnMethod {

	public void driveCar() {

		System.out.println("Drive car");

	}

	void brandName() {

		System.out.println("Brandname");

	}

	private int addition(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
		return result;
		
	}

	public static void main(String[] args) {
		//Creating object  for class
		LearnMethod obj=new LearnMethod();
		obj.addition(20, 30);
		obj.brandName();
		obj.driveCar();
		

	}

}
