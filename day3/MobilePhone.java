package com.celcom.day3;

 class MobilePhone1 
{
	String Brand;
	float price;
	
	MobilePhone1()
	{
		Brand="Samsung";
		price=20000;
	}
	MobilePhone1(String Brand,float price)
	{
		this.Brand=Brand;
		this.price=price;
	}
	void buy()
	{
		System.out.println("The Brand is "+Brand);
		System.out.println("The Price is "+price);
	}

}
public class MobilePhone
{
	public static void main(String[] args)
	{
		MobilePhone1 obj1=new MobilePhone1();
		obj1.buy();
		MobilePhone1 obj2=new MobilePhone1("OppoA52",50000);
		obj2.buy();
		
		
	}
}