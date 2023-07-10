package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		//set the path and launch the browser
				ChromeDriver  driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.myntra.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//find the element
				WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
				//step2 instantiation the Actions class
				Actions builder =new Actions(driver);
				//step3 use Actions class method 
				builder.moveToElement(men).perform();
				
				

	}

}
