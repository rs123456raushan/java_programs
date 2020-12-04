package pattern1;
import java.util.Scanner;
public class Pattren2 {

	public static void main(String[] args) {
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rows=2*n-1;
		for(int i=1;i<=rows;i++) {
			if(i<=n) {
			for (int j=1;j<=i;j++) { 
				System.out.print("* ");
			}
			}
			else
			{
				for(int j=1;j<=rows-i+1;j++)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}


	}

}
