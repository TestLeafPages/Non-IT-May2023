package week1.day2;

public class PrintDuplicate {

	public static void main(String[] args) {
		int[] arr= {15,12,14,12,13,11,13};//12 13
		
		for (int i = 0; i < arr.length; i++) {//arr[0]=15
			
			for (int j = i+1; j < arr.length; j++) {//arr[1]=12
				
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
				
			}
		}
		
		
		
		
		
		
		

	}

}
