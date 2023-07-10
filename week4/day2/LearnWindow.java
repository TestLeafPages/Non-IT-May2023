package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) {
		//set the path and launch the browser
		ChromeDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//getWindowHandle()
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		System.out.println(driver.getTitle());
		//duplicate more than one
		//click open to get a new window
		driver.findElement(By.id("j_idt88:new")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String window : windowHandles) {
			System.out.println(window);
		}
		System.out.println(driver.getTitle());
		//List
		List<String>lstWindow=new ArrayList<String>(windowHandles);
		//switch the control
		driver.switchTo().window(lstWindow.get(1));
		
		System.out.println(driver.getTitle());
		//How to close the current open window
		driver.close();
		//Switch back to the window
		driver.switchTo().window(lstWindow.get(0));
		System.out.println(driver.getTitle());
		//close all open window 
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
		

	}

}
