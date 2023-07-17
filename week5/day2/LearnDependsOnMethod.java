package week5.day2;

import org.testng.annotations.Test;

public class LearnDependsOnMethod {
	@Test
	public void createLead() {
		System.out.println("CreateLead");
		throw new RuntimeException();
	}
	@Test(dependsOnMethods = {"createLead"},alwaysRun = true)
	 public void DeleteLead() {
		 System.out.println("DeleteLead");
	 }
	@Test
	 public void editLead() {
		 System.out.println("Edit Lead");
	 }

}
