package cg;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class checkNumberIncreasing {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean b=inc(n);
		if(b)
			System.out.println("The number is in increasing order");
		else
			System.out.println("The number is not increasing order");
	}


	public static boolean inc(int n)
	{
		String st=Integer.toString(n);
		boolean b=false;
		char c[]=st.toCharArray();
		Arrays.sort(c);
		String s=String.valueOf(c);
		if(st.equals(s))
			b=true;
		else
			b=false;
		return b;
}

}	
