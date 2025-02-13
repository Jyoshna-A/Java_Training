package com.celcom.day8;

public class StringMethodExample1 

{
 public static void main(String[] args)
 {
	 String s1="Java";
	 System.out.println(s1.length());
	 System.out.println(s1.charAt(1));
	 System.out.println(s1.toLowerCase());
	 System.out.println(s1.toUpperCase());
	 System.out.println(s1.concat("I am good girl"));
	 System.out.println(s1.replace('a', 'K'));
	 System.out.println(s1.equals("java"));
	 System.out.println(s1.equalsIgnoreCase("java"));
	 System.out.println(s1.contains("a"));
	 System.out.println(s1.startsWith("j"));
	 System.out.println(s1.endsWith("j"));
	 String s2="Java Good";
	 System.out.println(s2.substring(2));
	 System.out.println(s2.substring(2,4));
 }
}
