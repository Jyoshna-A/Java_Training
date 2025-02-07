package com.celcom.day4;

public class OrderOfExecution {
	{
		System.out.println("Instance block executes");
	}
	
	OrderOfExecution()
	{
		System.out.println("Constructor executes");
	}
	public String toString()
	{
		return "To String";
	}
	static
	{
		System.out.println("Static block ");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main method executes");
		OrderOfExecution obj=new OrderOfExecution();
		System.out.println(obj);
	}

}
