package com.celcom.day7;

interface MyInterface
{
	void display();
}
public class AnonymousInnerClass 
{
	
	public static void main(String[] args)
	{
		
		AnonymousInnerClass obj=new AnonymousInnerClass();
		
		//Anonymous Inner class
		MyInterface obj1=new MyInterface()
				{
			        public void display()
			        {
			        System.out.println("Display anynymous");
			        }
			        
				};
				
				obj1.display();
				MyInterface obj2=() -> System.out.println("Display");
				obj2.display();
	}

}
