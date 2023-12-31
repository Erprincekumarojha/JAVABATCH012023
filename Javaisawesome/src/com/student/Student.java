package com.student;

public class Student {
	
	private int id;
	private String name;
	private String mobile;
	private String course;
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, String mobile, String course) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.course = course;
	}
	
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile + ", course=" + course + "]";
	}
	
	

}
