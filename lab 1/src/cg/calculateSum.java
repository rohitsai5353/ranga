package cg;

import java.util.Scanner;

public class calculateSum {
	

	public static void main(String[] args) {

		int n,i,result=0;
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
		result=result+calculateSum(i);
		}
		System.out.println("Sum of first n natural numbers which are divisible by 3 or 5 is ="+result);
	}
	static int calculateSum(int n)
	{
		int sum=0;
		if(n%3==0 || n%5==0)
		{
				sum=sum+n;
		}
		return sum;
	}
}
