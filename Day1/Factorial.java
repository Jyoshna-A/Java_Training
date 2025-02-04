package com.celcom.day1;
import java.util.Scanner;
public class Factorial 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	System.out.println("The Fcaorial of a number is "+fact(n));
	
	
	}
	static int fact(int n)
	{
		if(n<=1)
			return n;
		return n*fact(n-1);
	}
}
