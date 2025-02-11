package com.celcom.day6;

public class ExceptionExample7 {
	
	public static void main(String[] args)
	{
		//CLASS CAST EXCEPTION
		System.out.println("Before Exception");
		
		ExceptionExample7 e=(ExceptionExample7) new Object();
		System.out.println("After Exception");


	}



}
