package cg;

import java.util.Arrays;
import java.util.Scanner;

public class SortedReverse {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter  the size of array");
			int n=sc.nextInt();
			System.out.println("Enter  elements into array");
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			SortedReverse(a);
			
	}

	private static int SortedReverse(int[] a) {
		Arrays.sort(a);
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		return 0;
	}

}
