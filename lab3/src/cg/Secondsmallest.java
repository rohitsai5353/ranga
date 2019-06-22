package cg;

import java.util.Arrays;
import java.util.Scanner;

public class Secondsmallest {

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
		System.out.println("Enter  elements into array "+Secondsmallest(a));
		
	}

	private static int Secondsmallest(int a[]) {
		int b;
		Arrays.sort(a);
		b=a[1];
		return b;
	}

}
