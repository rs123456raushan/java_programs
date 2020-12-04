package set;
import java.util.*;
public class MyTreeHashSet {

	public static void main(String[] args) {
		Set<String> fruits=new TreeSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kiwi");
		System.out.println(fruits);
		System.out.println(fruits.remove("Apple"));
		
	}

}
