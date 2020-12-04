package exceptionhandling;
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("your answer is "+c);
		}
		catch(ArithmeticException e) {
		System.out.println(e.getMessage()+" error");
		}
		finally {
			System.out.println("Your program has ended.");
		}
		
	}

}
