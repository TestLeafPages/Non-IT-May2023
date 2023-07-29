package week7.day1;

public class LearnThis {
	
	 String name;
	int id;
	String dep;
	String companyName;
	public LearnThis() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(dep);
	}
	//variable level
	public LearnThis(String name, int id,String dep) {
		this.name=name;
		this.id=id;
		this.dep=dep;
		
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(dep);
	}
	//method level
	public  void employee(String companyname) {
		this.companyName=companyname;
	}
    public void empId(int id) {
    	this.employee(companyName);
    	System.out.println(this.name);
    }
	public static void main(String[] args) {
		LearnThis obj = new LearnThis("Ram", 1001, "Testing");
	

	}

}
