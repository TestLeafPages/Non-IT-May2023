package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDropDownValues {

	public static void main(String[] args) {
		//setup the driver path 
        ChromeDriver driver=new ChromeDriver();
        //Load the url  
        driver.get("https://www.leafground.com/select.xhtml");
        //maximize the browser
        driver.manage().window().maximize();
        //wait 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //find the element and make it as an web element
        WebElement tools = driver.findElement(By.className("ui-selectonemenu"));
        
        Select drop=new Select(tools);
       
        List<WebElement> options = drop.getOptions();
        
        for (int i = 0; i < options.size() ; i++) {
			System.out.println( options.get(i).getText());
		}
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
