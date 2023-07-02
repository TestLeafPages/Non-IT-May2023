package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
	
		List<String> learners=new ArrayList<String>();
		learners.add("Leeba");
		learners.add("Madhumitha");
		learners.add("srinidhi");
		learners.add("Jeyalakshmi");
		learners.add("gokul");
		//create new List
		List<String> student=new ArrayList<String>();
		student.addAll(learners);
		
		//get the length of list
		int size = learners.size();
		System.out.println(size);
		
		learners.add(2, "uma");
		//print the list
		System.out.println(student);
		System.out.println(learners.size());
		System.out.println(learners.remove(1));
		System.out.println(learners.get(3));//particular
		System.out.println(learners.contains("Uma"));
		//learners.clear();
		System.out.println(learners);
		System.out.println(learners.isEmpty());
		//To arrange the list in order
		Collections.sort(learners);
		
		for (int i = 0; i <learners.size() ; i++) {
			System.out.println(learners.get(i));
		}
		
		
		
		
		
		
		
		
		
		

	}

}
