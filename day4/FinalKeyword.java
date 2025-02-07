package com.celcom.day4;



 class Animal5
{
	  String msg=greeting();

	String greeting()
	{
		return "A";
	}
	
}
class Cat5 extends Animal5
{
	

	String greeting()
	{
		return "B";
	}
	
}
public class FinalKeyword 
{
	
	public static void main(String[] args)
	{
		Animal5 animal=new Cat5();
		System.out.println(animal.msg);
		
	}

}


