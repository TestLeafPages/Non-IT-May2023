package week5.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnInvocation {
	@Test(invocationCount = 5,threadPoolSize = 2,invocationTimeOut = 3000)
	public void createLead() throws InterruptedException {//crete dete edit
		Thread.sleep(5000);
		System.out.println("createLead");
	}
	@Test
	 public void editLead() {
		 System.out.println("editLead");;
	 }
	@Test
	 public void deleteLead() {
		 System.out.println("deleteLead");
	 }
}
