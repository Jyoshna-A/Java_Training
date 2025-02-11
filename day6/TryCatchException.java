package com.celcom.day6;

public class TryCatchException {
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
		System.out.println("After Exception");
	}

}
