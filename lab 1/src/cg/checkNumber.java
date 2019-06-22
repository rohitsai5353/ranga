package cg;

import java.util.Scanner;

public class checkNumber {

	public static void main(String[] args) {
	
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean h=checkNumber(n);
		System.out.println(h);
	}
		public static boolean checkNumber(int n) 

		{
			int r=0;
			while(n>2)
			{
				r=n%2;
				n=n/2;
			}
			if(r==0)
			return true;
			else 
			return false;
		}
}
