package com.celcom.day5;


class Rectangle
{
	float width;
	float height;
	Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	}
	void area()
	{
		System.out.println("The Area is "+(width*height));
	}
	void perimeter()
	{
		System.out.println("The Perimeter is "+2*(width+height));
	}
	
	
}
public class Assignment3 {
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle(12,2);
		r.area();
		r.perimeter();
	}
}
