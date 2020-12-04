package set;
import java.util.*;
public class MyLinkedHashSet {

	public static void main(String[] args) {
		Set<String> fruits=new LinkedHashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kiwi");
		System.out.println(fruits);
		System.out.println(fruits.remove("Apple"));

	}

}
