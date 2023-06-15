package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {

		File f = new File("P:\\Java Bath 20223\\file\\javafile.txt");

		FileReader fr = new FileReader(f);

		int ch;

		while ((ch = fr.read()) != -1) {

			System.out.print((char) ch);
		}
		
		fr.close();
		
		  try{    
	            FileInputStream fin=new FileInputStream("testou");    
	            int i=fin.read();  
	            System.out.print((char)i);    
	  
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}    
	             
	}

}
