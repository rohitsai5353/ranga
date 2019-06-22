package cg;

import java.util.Scanner;

public class SumOfCubes {

	public static void main(String[] args) {
	
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("The Result is"+SumOfCubes(n));
	}
		
 public static int SumOfCubes(int n)
		{
			int sum=0,r;
			while(n!=0)
			{
				r=n%10;
				sum=sum+(r*r*r);
				n=n/10;
			}
			return sum;
		}
}