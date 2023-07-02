package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {

	public static void main(String[] args) {
		//setup the driver path 
        ChromeDriver driver=new ChromeDriver();
        //Load the url  
        driver.get("https://www.leafground.com/link.xhtml");
        //maximize the browser
        driver.manage().window().maximize();
        //wait 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //How many links
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        System.out.println(links.size());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}
}
