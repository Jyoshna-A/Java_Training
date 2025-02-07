package com.celcom.day4;
import java.util.Scanner;
public class PronicNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(pronic(n));
	}
	static boolean pronic(int number)
	{
		for(int i=1;i<=number/2;i++)
		{
			if((i*(i+1)==number))
			{
				System.out.println(i+" "+(i+1));
				return true;
			}
		}
		return false;
	}

}
