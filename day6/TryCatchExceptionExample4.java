package com.celcom.day6;

public class TryCatchExceptionExample4 {
	
	public static void main(String[] args)
	{
		/// once try block throw error,then it will come out of from try block
		try
		{
			int a[]=new int[-5];
			System.out.println("Inside block of try");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println(e);
		}
		System.out.println("After Exception");
	}



}
