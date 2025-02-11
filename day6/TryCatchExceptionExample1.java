package com.celcom.day6;

public class TryCatchExceptionExample1 {
	public static void main(String[] args)
	{
		try
		{
			int a=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		System.out.println("After Exception");
	}
}
