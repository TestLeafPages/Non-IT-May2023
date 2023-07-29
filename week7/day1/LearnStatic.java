package week7.day1;

public class LearnStatic {

	// static var
	static String name = "Testleaf";

	// Non static var
	String empName = "Princila";
	
	//static method
	
	public static void empdetail() {
		System.out.println("Automation Tester");
	}
	
	//NonStatic method
      public void empAddress() {
    	  System.out.println("living in chennai");
      }
	
	
	public static void main(String[] args) {
		LearnStatic obj =new LearnStatic();
		
		System.out.println(name);

		System.out.println(obj.empName);
		
		empdetail();
		
		obj.empAddress();

	}

}
