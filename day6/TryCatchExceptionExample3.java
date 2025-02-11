package com.celcom.day6;

public class TryCatchExceptionExample3 {
	public static void main(String[] args)
	{
		/// U NEED TO WRITE RELEVANT CATCH BLOCK
		try
		{
			int a[]=new int[-5];
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
