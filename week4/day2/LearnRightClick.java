package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {

	public static void main(String[] args) {
		//set the path and launch the browser
		ChromeDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/menu.xhtml#");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//step2 instantiation the Actions class
		Actions builder =new Actions(driver);
		//step3 use Actions class method
		builder.contextClick().perform();
		//find the element to perform right click
		WebElement clk = driver.findElement(By.xpath("(//div[@class='card']/h5)[6]"));
		builder.contextClick(clk).perform();
		
	}

}
