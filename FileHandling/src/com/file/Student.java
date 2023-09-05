package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public int id;
	public String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileOutputStream fos = new FileOutputStream("prince.dat", true);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student s1 = new Student(101, "prince kumar ");
		Student s2 = new Student(102, "Deepak kumar ");
		Student s3 = new Student(103, "Ajit kumar ");
		 oos.writeObject(s1);
		oos.flush();
		 oos.writeObject(s2);
		oos.writeObject(s3);
		oos.flush();
		System.out.println("Object is Successfully Writen In File");
		oos.close();

		ObjectInputStream ons = new ObjectInputStream(new FileInputStream("prince.dat"));
		Object readObject = null;
		while ((readObject = ons.readObject()) != null) {
			if(readObject instanceof Student) {
				System.out.println(((Student)readObject).toString());
			}
		}
		ons.close();
	}

}
