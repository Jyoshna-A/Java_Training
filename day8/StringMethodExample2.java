package com.celcom.day8;

import java.util.Arrays;

public class StringMethodExample2 
{
public static void main(String[] args )
{
	String s="java";
	for(int i=0;i<s.length();i++)
	{
		System.out.println(s.charAt(i));
	}
	
	char ch[]=s.toCharArray();
	for(char c:ch)
	{
		System.out.println(c);
	}
	String s2="Welcome to Java Programming ";
	System.out.println(Arrays.toString(s2.split("r")));
	
}
}
