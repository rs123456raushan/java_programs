package sorting;
import java.util.Scanner;
public class SelectionSorting {

	public static void main(String[] args) {
		int x;
		System.out.println("enter the length of an array");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		System.out.println("enter an array");
		int[] a=new int[x];
		int n=a.length;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			int minInd=i;
			for(int j=i;j<n;j++) {
				if(a[j]<a[minInd]) {
					minInd=j;
		    }
	    }
			int temp=a[i];
			a[i]=a[minInd];
			a[minInd]=temp;
	  }
		System.out.println("your result is");
		for(int result:a) {
			System.out.print(result+" ");
		}
	}

}
