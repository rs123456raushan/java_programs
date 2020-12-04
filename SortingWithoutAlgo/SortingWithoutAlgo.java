package SortingWithoutAlgo;
import java.util.*;
public class SortingWithoutAlgo {

	public static void main(String[] args) {
		System.out.println("Enter an array of elements of 0, 1 and 2 only");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count0=0;
		int count1=0;
		int count2=0;
		int temp=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();	
		}
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				count0++;
			}
			else if(arr[i]==1){
				count1++;
			}
			else {
				count2++;
			}
		}
		for(int i=0;i<count0;i++) {
			arr[i]=0;
		}
		for(int i=count0;i<count1;i++) {
			arr[i]=1;
		}
		for(int i=count1;i<count2;i++) {
			arr[i]=2;
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
