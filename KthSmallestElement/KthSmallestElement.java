package KthSmallestElement;
import java.util.*;
import java.lang.*;
import java.io.*;

public class KthSmallestElement {

	
			public static void main (String[] args) {
				Scanner sc=new Scanner(System.in);
				int t=sc.nextInt();
				int n=sc.nextInt();
				int a[]=new int[n];
				for(int i=0;i<n;i++){
				    a[i]=sc.nextInt();
				}
			    int k=sc.nextInt();
			    Arrays.sort(a);
			    System.out.println(a[k-1]);
			   
			}
	}


