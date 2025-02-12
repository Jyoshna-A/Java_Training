package com.celcom.day7;
interface Calculator extends Thread
{
	int calc(int a,int b);
}
public class ImportanceOfLambda 
{
    public static void main(String[] args)
    {
    	Calculator c=(a,b)-> a+b;
    	System.out.println(c.calc(20, 10));
    	c=(a,b)-> a-b;
    	c=(a,b)-> a*b;
    	c=(a,b)-> a/b;
    	System.out.println(c.calc(20, 10));
    	
    }
}
