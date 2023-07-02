package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
	String name="Testleaf";
	//Convert string into charArray
	char[] charArray = name.toCharArray();
	//create Character set to store the value
	Set<Character> input=new LinkedHashSet<Character>();
	//using for loop to store the charArray[]
	for (int i = 0; i < charArray.length; i++) {
		input.add(charArray[i]);//set.add() to add the data into set
	}
	System.out.println(input);//from the result you can understand duplicate is removed
	}
		
  
}
