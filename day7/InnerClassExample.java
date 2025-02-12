package com.celcom.day7;

public class InnerClassExample 

{
	//Non static inner class
	class InnerClass1
	{
		class InnerClass3
		{
			void myMethod3()
			{
				System.out.println("Local Inner class");
			}
			InnerClass3 inner3=new InnerClass3();
			inner3.myMethod3();
		}
		
		
	}
	
	
	public static void main(String[] args)
	{
		InnerClassExample obj=new InnerClassExample();
		InnerClass1 inner1=obj.new InnerClass1();
		InnerClass2 inner2=new InnerClassExample.InnerClass2();
	}

}
