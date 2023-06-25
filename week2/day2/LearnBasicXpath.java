package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasicXpath {

	public static void main(String[] args) {
		//setup the driver path 
        ChromeDriver driver=new ChromeDriver();
        //Load the url  
        driver.get("http://leaftaps.com/opentaps/control/login");
        //maximize the browser
        driver.manage().window().maximize();
        //wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

	}

}
