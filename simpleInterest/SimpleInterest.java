package simpleInterest;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		float r=sc.nextFloat(); 
		int t=sc.nextInt();
		double amt=p*r*t/100;
		System.out.println("your amt is " + amt);

	}

}
