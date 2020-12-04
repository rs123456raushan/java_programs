package mycalculator;
import java.util.Scanner;
public class MyCalculator {

	public static void main(String[] args) {
		System.out.println("enter operands, operator and operands respectively");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.nextLine();      /* just bcz to make buffer empty to take fresh input as a string
		otherwise it give error bcz it will not be able to take fresh input from keyboard*/
		char operator=sc.nextLine().charAt(0);
        int b=sc.nextInt();
        int result=0;
        switch(operator) {
        case '+':
        	result=a+b;
        	break;
        case '-':
        	result=a-b;
        	break;
        case '*':
        	result=a*b;
        	break;
        case '/':
        	result=a/b;
        	break;
        	default:
        		System.out.println("invalid operator");
        }
        System.out.println("your result is " + result);

	}

}
