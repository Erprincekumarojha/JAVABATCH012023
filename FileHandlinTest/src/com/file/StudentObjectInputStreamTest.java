package com.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentObjectInputStreamTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis   = new FileInputStream("data.dat");
		
		ObjectInputStream ons =  new ObjectInputStream(fis);
		
		Student s =null; //(Student)ons.readObject();
		try {
		while((s=(Student) ons.readObject())!=null) {
			System.out.println(s);
		}
		}catch(Exception e) {
		  // nothing will print	
		}
		ons.close();
		fis.close();
		
		System.out.println(s);
	}

}
