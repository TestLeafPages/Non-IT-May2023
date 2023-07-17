package week5.day2;

import org.testng.annotations.Test;

public class LearnPriority {
	@Test
	public void launchBrowser() {//cl cr l
		System.out.println("ChromeDriver");
	}
	@Test(priority = -2,enabled = false)
	 public void createLead() {
		 System.out.println("CreateLead");
	 }
	@Test(priority = 2)
	 public void closeBrowser() {
		 System.out.println("driver.close");
	 }

}
