package comparableAndcomparator;
import java.util.*;
public class MyComparator {

	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student(10,"Adarsh"));
		students.add(new Student(40,"Pavan"));
		students.add(new Student(50,"Roshan"));
		students.add(new Student(20,"Krishna"));
		students.add(new Student(30,"Vinay"));
		Collections.sort(students,new Comparator<Student>() { //Anonymous Class
			@Override
			public int compare(Student o1,Student o2) {
				if(o1.name.equals(o2.name)) {
					return o1.marks-o2.marks;
				}
				else {
					return o1.name.compareTo(o2.name);
				}
			}
		});
		students.forEach(System.out::println);   //Lambda function

	}

}

