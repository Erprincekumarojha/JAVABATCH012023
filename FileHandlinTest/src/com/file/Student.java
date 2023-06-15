package com.file;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private transient int sid;
	private transient String name;
	private String number;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String name, String number) {
		super();
		this.sid = sid;
		this.name = name;
		this.number = number;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", number=" + number + "]";
	}
	
	

}
