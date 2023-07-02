package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Integer[] arrs = { 20, 40, 50, 30, 20, 90 };
		Set<Integer> nums = new TreeSet<Integer>(Arrays.asList(arrs));
		nums.add(11);
		nums.add(30);
		nums.add(12);
		nums.add(12);
		nums.add(30);
		nums.add(12);
		nums.add(20);
		System.out.println(nums);

		Set<Integer> set2 = new TreeSet<Integer>();
		for (int i = 0; i < arrs.length; i++) {
			set2.add(arrs[i]);
		}
		System.out.println(set2);
		System.out.println(nums.contains(11));
		System.out.println(nums.remove(11));

		for (Integer output : nums) {
			System.out.println(output);
		}
		// Convert set into list
		List<Integer> newList = new ArrayList<Integer>(set2);

		System.out.println(newList);

	}

}
