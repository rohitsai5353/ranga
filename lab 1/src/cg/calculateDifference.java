package cg;

import java.util.*;

public class calculateDifference {
	

	public static void main(String[] args) {

		int n,i,result1=0,result2=0;
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
		result1=result1+calculateDifference1(i);
		result2=result2+calculateDifference2(i);
		}
		
		System.out.println("The difference between the sum of the squares and the square of the sum of the first n natural numbers" 
				+Math.abs(result1-(result2*result2)));
	}
	public static int  calculateDifference1(int n)
	{
		int sum=0;
		 sum=sum+n*n;
		 return sum;
}
	public static int   calculateDifference2(int n)
	{
		int sum=0;
		 sum=sum+n;
		 return sum;
}
}