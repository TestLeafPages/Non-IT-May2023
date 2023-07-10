package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) throws IOException {
		//set the path and launch the browser
		ChromeDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//find the element
		WebElement scroll = driver.findElement(By.xpath("(//p[text()=' CUSTOMER POLICIES '])[1]"));
		//step2 instantiation the Actions class
		Actions builder =new Actions(driver);
		builder.scrollToElement(scroll).perform();
		//Take a Snap shot
		File source = driver.getScreenshotAs(OutputType.FILE);
		//Create physical path
		File desc =new File("./snap/myntra.png");
		//Merge source and destination
		FileUtils.copyFile(source, desc);

	}

}
