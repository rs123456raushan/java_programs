package swap;
public class Swap {
	public static void main(String[] args) {
		int c=3;
		int d=5;
		System.out.println("before swap");
		System.out.println(c+" "+d);
		swap(c,d);
		System.out.println("after swap");   //swapping doesn't occurs
		System.out.println(c+" "+d);
		Dog dg=new Dog();
		System.out.println("before swap");
		System.out.println(dg.legs+" "+dg.eyes);
		swap(dg.legs,dg.eyes);
		System.out.println("after swap");   //swapping doesn't occurs
		System.out.println(dg.legs+" "+dg.eyes);
		Cat cat=new Cat();
		cat.leg=6;
		System.out.println("before swap");
		System.out.println(cat.leg);
		changeSwap(cat);
		System.out.println("after swap");  //swapping occurs
		System.out.println(cat.leg);
	}
	static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
	}
	static void swap(Dog a,Dog b) {
		Dog temp=a;
		a=b;
		b=temp;
	}
	static void changeSwap(Cat cat) {
		cat.leg=4;
	}

}
class Dog{
	int legs=4;
	int eyes=2;
}
class Cat{
	int leg;
}

