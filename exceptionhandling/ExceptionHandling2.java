package exceptionhandling;
import java.util.Scanner;
public class ExceptionHandling2 {

	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		divide();	
	}
	static void divide() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		if(b==0) {
			try {
				exception(b);
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
		else
		    System.out.println("your answer is "+c);
	}
	static void exception(int b) throws ArithmeticException{
		if(b==0)
			throw new ArithmeticException("You have entered wrong input");
		
	}

}
