package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		//set the path and launch the browser
		ChromeDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//simple alert
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
	
		//switch the control to the alert
		Alert simple = driver.switchTo().alert();//ctrl+2
		
		//getText from the alert box
		String text = simple.getText();
		System.out.println(text);
		//To accept the alert
		simple.accept();
		//confirm alert
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		//switch the control to the alert
		Alert confirm = driver.switchTo().alert();
		System.out.println(confirm.getText());//print the msg from pop up
		//To cancel the alert
	    confirm.dismiss();
	    //verify the alert
	    String text2 = driver.findElement(By.id("result")).getText();
		System.out.println(text2);
		
		//Prompt Dialog
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//switch the control to the alert
		Alert prompt = driver.switchTo().alert();
		//Pass the input data to the input box
		prompt.sendKeys("Testleaf");
		//get the text from the pop up
		System.out.println(prompt.getText());
		//To accept the alert
		prompt.accept();
		//verify the alert
		String text3 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text3);
		
		
		
		
		
		
		
		
		

	}

}
