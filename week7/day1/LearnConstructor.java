package week7.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnConstructor {
	
	int x;
	String name;
	boolean isempty;
	//spl method 
	//no return type
	//class name equal to constr
	public LearnConstructor(){
		System.out.println("I am inside the constructor");
	}

	{
		System.out.println("I am inside a block");
	}

	static {
		System.out.println("I am in side static block");
	}

	public static void main(String[] args) {
		System.out.println("I am inside main method");
		LearnConstructor  obj = new LearnConstructor();
		System.out.println(obj.x);
		System.out.println(obj.name);
		System.out.println(obj.isempty);
		//setup the path
		//ChromeDriver driver =new ChromeDriver();
		//

	}
	/*
	 * Execution order
	 * static block
	 *  Main block 
	 * object create ---> block 
	 * constructor
	 *  methods
	 */

}
