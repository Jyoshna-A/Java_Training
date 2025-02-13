
package com.celcom.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ImageCopy {
	public static void main(String[] args) throws IOException
	{
		FileInputStream fp=new FileInputStream("D://Peacock.jpg");
		FileOutputStream fw=new FileOutputStream("D://New.jpg");
		int ch=0;
		while((ch=fp.read())!=-1)
		{
			fw.write(ch);
		}
		fp.close();
		fw.close();
		System.out.println("Image copied successfully");
		
	}

}
