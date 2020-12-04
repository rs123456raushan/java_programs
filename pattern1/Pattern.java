package pattern1;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rows=n*2-1;
		int k=0;
		for(int i=1;i<=rows;i++)
		{
			if(i<=n)
				k++;
			else
				k--;
			for(int j=1;j<=n;j++)
			{
				if(j<=k)
				{
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
		

	}

}
