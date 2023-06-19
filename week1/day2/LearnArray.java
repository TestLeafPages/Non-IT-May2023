package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		//Arrays Declaration
		int [] marks= {99,89,87,89,97};
		//87,89,89,97,99
		String [] names= {"Roshan","anitha","kalyani","Elakkiya"};
		
		int[] nums=new int[5];
		nums[0]=1;
		nums[1]=5;
		nums[2]=4;
		
		//find the length
		int len = marks.length;  //ctrl+2
		System.out.println(marks.length);
		System.out.println(len);
		//print what is the first index
		System.out.println("First index"+marks[0]);
		//last index
		System.out.println(marks[len-1]);
		//arrange the arrays in order
		Arrays.sort(marks);
	
		//87,89,89,97,99
		//second largest num
		System.out.println(marks[len-2]);
		
		System.out.println(marks);
		//looping
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		
		
		
		

	}

}
