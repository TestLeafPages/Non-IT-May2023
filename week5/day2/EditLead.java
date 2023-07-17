package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends BaseClass{
@Test(dataProvider = "fetchData")
	public  void runEditLead() throws InterruptedException {

		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.name("submitButton")).click();
		
	}
@DataProvider(name="fetchData")
public String[][] getData() {
	String[][] data = new String[2][4];
	// 1 st set
	data[0][0] = "98";
	data[0][1] = "Qeagle";
	// 2 nd set
	data[1][0] = "97";
	data[1][1] = "wipro";
	
	
	return data;

}

}
