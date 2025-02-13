package com.celcom.day8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileCopy {
	public static void main(String[] args) throws IOException
	{
		FileReader fp=new FileReader("D://Jo.txt");
		FileWriter fw=new FileWriter("D://New.text");
		int ch=0;
		while((ch=fp.read())!=-1)
		{
			fw.write(ch);
		}
		fp.close();
		fw.close();
		System.out.println("File copied successfully");
		
	}

}
