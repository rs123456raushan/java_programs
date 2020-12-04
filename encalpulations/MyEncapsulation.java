package encalpulations;
public class MyEncapsulation {
	public static void main(String[] args) {
		Student s=new Student();
		s.setAge(19);           //accessing the setAge function of second class but of same package
		s.setName("Roshan: The Legend");//accessing the setAge function of second class but of same package
		System.out.println(s.getName());
		System.out.println(s.getAge());
		
	}

}
