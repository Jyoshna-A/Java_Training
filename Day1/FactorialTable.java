package com.celcom.day1;
import java.util.Scanner;
public class FactorialTable {
	public static void main(String[] args)
	{
		
		factorialtable();
		
	}
	public static void factorialtable()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Factorial of  "+i +"! is "+fact(i));
		}

	}
	public static int fact(int n)
	{
		if(n<=1)
			return n;
		return n*fact(n-1);
	}

}
