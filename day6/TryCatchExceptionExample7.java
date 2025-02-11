package com.celcom.day6;

public class TryCatchExceptionExample7 {
	
	public static void main(String[] args)
	{
		/// once try block throw error,then it will come out of from try block
		try
		{
			int a[]=new int[5];
			System.out.println("Inside block of try");
		}
		
		finally
		{
			System.out.println("finally block ");
		}
		System.out.println("After Exception");
	}



}
