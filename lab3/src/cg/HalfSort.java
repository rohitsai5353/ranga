package cg;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HalfSort {

	public static void main(String[] args) {
		halfsort();
	}

	private static void halfsort() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the size of array");
		int n=sc.nextInt();
		System.out.println("Enter elements into array");
		String a[]=new String[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		Arrays.sort(a);	
		for(int i=0;i<n/2;i++)
		{
			a[i]=a[i].toUpperCase();
			
		}
		for(int i=n/2;i<n;i++)
		{
			a[i]=a[i].toLowerCase();
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
			
		}
	}

}
