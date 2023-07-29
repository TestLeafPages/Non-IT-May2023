package week7.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConstructorChaining {
	public ChromeDriver driver;
	
	public ConstructorChaining(ChromeDriver driver) {
		this.driver=driver;
	}

	public ConstructorChaining login() {
		return this;
	}
	public ConstructorChaining() {
		this("Ram", 10001);//3 call go to two para
		System.out.println("I am a default constructor");//5 this print
	}
	
	public ConstructorChaining(String name,int id) {
		//4 print
		System.out.println("I am a  two parameter constructor");
	}
	
	public ConstructorChaining(String name,int id,String dep) {//first call
		this();//second call to default
		System.out.println("I am a  three parameter constructor");//6 line print
	}

	
	public static void main(String[] args) {
		ConstructorChaining obj=new ConstructorChaining("Ram",1002,"testing");

	}

}
