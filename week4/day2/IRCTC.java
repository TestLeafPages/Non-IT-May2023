package week4.day2;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTC {

	public static void main(String[] args) {
		//Handle the browser notification
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/");
		//Click on FLIGHTS link
		driver.findElement(By.partialLinkText("FLIGHTS")).click();
		//verify the title of the page
		System.out.println(driver.getTitle());
		//Switch to the Flights window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>listWindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(listWindow.get(1));
		//Print the Title of the Flights window
		System.out.println(driver.getTitle());
		//Close the Flights window alone
		driver.close();
		//Print the Train search window title (First window)
		driver.switchTo().window(listWindow.get(0));
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}

