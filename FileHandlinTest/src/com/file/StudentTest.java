package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentTest {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
		
	       Student s  =new Student();
	       s.setSid(101);
	       s.setName("prince");
	       s.setNumber("9123456");
	      
	       oos.writeObject(s);// Transient member value will not go to file
	       
	       oos.flush();
	       
	       oos.close();
	       
	       System.out.println("Data student is store in file");
	       
	       ObjectInputStream ons = new ObjectInputStream(new FileInputStream("studentdata.txt"));
	       Object readObject = ons.readObject();
	       System.out.println(readObject.toString());
	       ons.close();
	       
	       
	       
	}

}
