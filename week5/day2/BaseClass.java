package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	public RemoteWebDriver driver;

	@Parameters({"browser","url","username","password"})
	@BeforeMethod
	public void preCondition(String browser,String url, String uname ,String pwd) {
		
		switch(browser) {
		case "chrome":
		{
			driver = new ChromeDriver();
			break;
		}
		case "edge":
		{
			driver=new EdgeDriver();
			break;
		}
		}
		/*
		 * if(browser.equalsIgnoreCase("chrome")) { driver =new ChromeDriver(); } else
		 * if(browser.equalsIgnoreCase("edge")) { driver=new EdgeDriver(); }
		 */
		
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}

}
