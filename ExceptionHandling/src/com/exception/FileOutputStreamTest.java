package com.exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream s  =  new FileOutputStream("test.dat");
		
		s.write(65);
		
		s.close();
	}

}
