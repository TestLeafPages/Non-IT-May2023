package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		/*
		 * String input="Amazon development centre, Chennai"; output:Chennai centre,
		 * development Amazon Goal: To understand the String, loop a)split the sentence
		 * with white space and get the count of the words b)Use forloop to iterate
		 * (from end to go the first) c)Print the reversed String Hint Use as
		 * system.out.print()
		 */

		String input = "Amazon development centre, Chennai";
		String[] split = input.split(" ");
		for (int i = split.length - 1; i >= 0; i--) {
			System.out.print(split[i] + " ");

		}

	}

}
