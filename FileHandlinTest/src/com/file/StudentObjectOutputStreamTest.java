package com.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentObjectOutputStreamTest {
	
	public static void main(String[] args) {
		try {
		    //create Student Object
			Student s1 = new Student(101, " prince ", "91315678990");
			Student s2 = new Student(102, " ajit ", "466778990");
			Student s3 = new Student(103, " deepak ", "6786990");
			//create file
			FileOutputStream fos = new FileOutputStream("data.dat", true);
			//create ObjectOutputStream
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.writeObject(s3);
			oos.close();
			fos.close();
			
			System.out.println("file data store");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
