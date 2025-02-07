package com.celcom.day4;

public class MethodOverloadingExample3 
{
	void concat(String a,String b)
	{
		System.out.println("The Concatenation of two Strings is "+(a+b));
	}
	void concat(int a,int b)
	{
		System.out.println("The Concatenation of two Integer values is "+(a+""+b));
	}
	void concat(double a,double b)
	{
		System.out.println("The Concatenation of two Double values is "+(a+""+b));
	}

	
	public static void main(String[] args)
	{
		MethodOverloadingExample3 obj=new MethodOverloadingExample3();
		obj.concat("Atmakuru", "Jyoshna");
		obj.concat(100,200);
		obj.concat(5.4,2.4);
	}

}
