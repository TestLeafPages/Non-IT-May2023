package week5.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class LearnEnabled {
	@Test
	public void createLead() {//crete dete edit
		System.out.println("createLead");
	}
	@Test(enabled = false)
	 public void editLead() {
		 System.out.println("editLead");;
	 }
	@Test
	 public void deleteLead() {
		 System.out.println("deleteLead");
	 }
}
