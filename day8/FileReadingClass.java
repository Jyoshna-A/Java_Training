package com.celcom.day8;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileReadingClass {
	public static void main(String[] args) throws IOException
	{
		FileReader f=new FileReader("D://Jo.txt");
		int ch=0;
		while((ch=f.read())!=-1)
		{
			System.out.print((char)ch);
		}
		f.close();
	}

}
