package week5.day2;

import org.testng.annotations.Test;

public class LearnTimeOut {
	@Test
	public void createLead() {
		System.out.println("CreateLead");
		throw new RuntimeException();
	}
	@Test(dependsOnMethods = {"createLead"},alwaysRun = true)
	 public void DeleteLead() {
		 System.out.println("DeleteLead");
	 }
	@Test(timeOut = 1000)
	 public void editLead() throws InterruptedException {
		Thread.sleep(2000);
		 System.out.println("Edit Lead");
	 }

}
