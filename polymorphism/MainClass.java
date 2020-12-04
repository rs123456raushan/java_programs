package polymorphism;

public class MainClass {

	public static void main(String[] args) {
		Dog dg =new Dog();
		Pet pt =new Pet();
		Animal a=dg;             //Upcasting of child class obj into parent class obj
		Pet p=dg;                //Run Time Polymorphism or method overriding
		a.walk();        //Here animal is behaving like dog
		p.walk();        //Here pet is also behaving like dog
		dg.walk();
		pt.walk();
		identity("Roshan");       //Compile time polymorphism or method overloading
		identity("Roshan","Software Developer");
	}
	
	static void identity(String name) {
		System.out.println(name);
	}
	static void identity(String name,String passion) {
		System.out.println(name+" and "+passion);
	}
}
