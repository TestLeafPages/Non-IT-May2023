package week7.day1;

public class ReadExcecl extends LearnFinal {
	
	public void readData() {
		LearnStatic.empdetail();
		System.out.println(LearnStatic.name);
			
	}
	 private void run() {
		   System.out.println("I am from final method");
	   }
	public static void main(String[] args) {
		ReadExcecl obj=new ReadExcecl();
		obj.readData();
	}

}
