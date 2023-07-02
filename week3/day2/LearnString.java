package week3.day2;

public class LearnString {

	public static void main(String[] args) {
		
		//as  literal
		String s="Testleaf";
		String s2="Testleaf";	
		//as instance
		String s1=new String("testleaf");
		//compare the reference
		System.out.println(s==s1);
		System.out.println(s==s2);//literal same reference
		//compare the string values
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		//get the string size
		int length = s.length();
		System.out.println(length);
		//another method to print length
		System.out.println(s.length());
	    //Check the a character exist or not in a given string  
		System.out.println(s.contains("Test"));
		
		String output="No123 Records234 to Display";
		//split the given string using delimiter
		String[] split = output.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		System.out.println(output.contains("no"));
		//-to replace a character in String  with another character 
		String replaceStr = output.replace('o', 'a');
		System.out.println(replaceStr);
		//to replace each character in String that matches with the  given expression 
		System.out.println(output.replaceAll("\\d"," "));//only char
		System.out.println(output.replaceAll("\\D"," "));//only digit
		//Convert each character of the String into lowercase  
		System.out.println(output.toLowerCase());
		//Convert each character of the String into Uppercase  
		System.out.println(output.toUpperCase());
		//get character from particular index
		System.out.println(output.charAt(3));
		//convert string to charArray
		char[] charArray = output.toCharArray();
		//array we cannot print directly so use for loop
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		//Print the string in reverse
		String input="Testleaf";
		
		char[] ch = input.toCharArray();
		
		for (int i = ch.length-1; i >=0 ; i--) {
			System.out.println(ch[i]);
		}
		//convert string to int
		String str="6,299";
		//step1 replace , with empty string
		String replace = str.replace(",", "");
		//using Integer.parseInt method to convert string into integer
		int covertedString = Integer.parseInt(replace);
		System.out.println(covertedString);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
