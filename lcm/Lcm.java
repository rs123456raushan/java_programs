package lcm;
import java.util.Scanner;
public class Lcm {

	public static void main(String[] args){
		System.out.println("enter two numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int x=a>b?a:b;
		int i;
		for(i=x;i<=a*b;i=i+x) {
			if(i%a==0&&i%b==0)
			    break;
		}
		
		System.out.println(i);
	}

}
