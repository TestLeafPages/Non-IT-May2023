package week6;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	@BeforeTest
	public void setUp() {
		fileName = "CreateLead";
	}

	@Test(dataProvider = "fetchData")
	public void runCreateLead(String cname, String fname, String lname, String pnum) {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pnum);
		driver.findElement(By.name("submitButton")).click();

	}

}
