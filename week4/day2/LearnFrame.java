package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {

		//set the path and launch the browser
				ChromeDriver  driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.leafground.com/frame.xhtml");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//frame
				driver.switchTo().frame(0);
				
				driver.findElement(By.id("Click")).click();
				//back to the main window
				driver.switchTo().defaultContent();
				//Nested
				driver.switchTo().frame(2);
				driver.switchTo().frame("frame2");
				driver.findElement(By.xpath("//button[text()='Click Me']")).click();

	}

}
