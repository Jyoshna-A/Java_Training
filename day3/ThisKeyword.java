package com.celcom.day3;

public class ThisKeyword 
{
	static String name;
	ThisKeyword(){
//		System.out.println("Joke");
//		this("Ramya");
		
	}
ThisKeyword(String name){
		this.name=name;
		this.greeting();
	}

	void greeting()
	{
		System.out.println("Hi ");
	}
	public static void main(String[] args)
	{
		ThisKeyword obj=new ThisKeyword("ram");
		System.out.println(obj.name);
		ThisKeyword obj2=new ThisKeyword();
		System.out.println(obj2.name);
	}

}
