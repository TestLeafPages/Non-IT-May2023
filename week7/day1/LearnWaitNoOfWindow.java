package week7.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWaitNoOfWindow {
	
	public static void main(String[] args) {
		//set the path and launch the browser
		ChromeDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		//find the element to open with delay
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		 wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		 
		 //need to verify
		 Set<String> windowHandles = driver.getWindowHandles();
		 System.out.println(windowHandles.size());
		 List<String> lstWindow =new ArrayList<String>(windowHandles);
		 driver.switchTo().window(lstWindow.get(1));
		 System.out.println(driver.getTitle());

	}
	
}
