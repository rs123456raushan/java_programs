package sorting;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of an array");
		x=sc.nextInt();
		int a[]=new int[x];
		int n=a.length;
		int temp=0;
		System.out.println("enter an array");
		for(int i=0;i<x;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			boolean ans=true;
			for(int j=0;j<n-1-i;j++) {
				if(a[j+1]<a[j]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					ans=false;
				}
			}
			if(ans) break;
		}
		System.out.println("your result is");
		for(int result:a) {
			System.out.print(result+" ");
		}
	

	}

}
