package week7.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnConstructor2 {
	int x;
	String name;
	boolean isempty;
	
	
	public LearnConstructor2() {
		System.out.println("I am a default constructor");
	}
	
	public LearnConstructor2(int num) {
		System.out.println(num);
	}
	

	public static void main(String[] args) {
		System.out.println("I am inside main method");
		LearnConstructor2  obj = new LearnConstructor2();//default
		LearnConstructor2  obj1 = new LearnConstructor2(5);//parameterized
		
		
		/*ChromeOptions options = new ChromeOptions();
		*options.addArguments("--disable-notifications");
		*ChromeDriver driver=new ChromeDriver();
		*/
			
	}
}