package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForVisibility {

	public static void main(String[] args) {
		//set the path and launch the browser
				ChromeDriver  driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.leafground.com/waits.xhtml");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//click the element to be visible
				WebElement visible = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
                visible.click();
                WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
                wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='I am here']"))));
                
                //verification
                String text = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
				System.out.println(text);
				
				
	}

}
