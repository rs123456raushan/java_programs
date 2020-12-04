package comparableAndcomparator;
import java.util.*;
public class MyComparator2 {

	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student(10,"Adarsh"));
		students.add(new Student(40,"Pavan"));
		students.add(new Student(50,"Roshan"));
		students.add(new Student(20,"Krishna"));
		students.add(new Student(30,"Vinay"));
		Collections.sort(students, (o1, o2)->{   //Facility provided by java 8
				if(o1.name.equals(o2.name)) {
					return o1.marks-o2.marks;
				}
				else {
					return o1.name.compareTo(o2.name);
				}
		});
	//	Collections.sort(students,(o1,o2)->o1.name.compareTo(o2.name)); //Sorting by names
	/*	Collections.sort(students,Comparator.comparing(Student::getName)//Comparing function
				.thenComparing(Student.getMarks));
		Collections.sort(students,Comparator.comparing(Student::getName)//Comparing function
				.thenComparing(Student.getMarks));//Reverse Sorting */
		students.forEach(System.out::println);   //Lambda function

	}

}
