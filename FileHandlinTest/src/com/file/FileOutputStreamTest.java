package com.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	
	public static void main(String[] args) throws IOException {
	
		 FileOutputStream s  =new FileOutputStream(new File("testdata.dat"));
		 
		 s.write(65);
		 
		 s.close();
	}

}
