package com.celcom.day1;

public class CommandLineArgument2
{
public static void main(String[] args){

if(args.length==2)
{
int num1=Integer.parseInt(args[0]);
int num2=Integer.parseInt(args[1]);
System.out.print("The sum "+(num1+num2));
}
else
{
System.out.print("Insufficient Arguments ");
}

}
}