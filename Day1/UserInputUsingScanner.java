package com.celcom.day1;

import java.util.Scanner;
public class UserInputUsingScanner
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);


String s=sc.next();
System.out.println("hi "+s);
System.out.println("Enter bool");
Boolean b=sc.nextBoolean();
System.out.print("The "+b);

sc.close();

}
}