package set;

import java.util.*;

public class MyHashSet {

	public static void main(String[] args) {
		Set<String> fruits1=new HashSet<>();
		fruits1.add("Apple");
		fruits1.add("Banana");
		fruits1.add("Kiwi");
		System.out.println(fruits1);
		System.out.println(fruits1.remove("Apple"));
		Set<String> fruits2=new HashSet<>();
		fruits2.add("Apple");
		fruits2.add("Guava");
		fruits2.add("Orange");
        fruits1.containsAll(fruits2);
		System.out.println(fruits1);
		fruits1.addAll(fruits2);
		System.out.println(fruits1);
		fruits1.retainAll(fruits2);
		System.out.println(fruits1);
		
	}

}
