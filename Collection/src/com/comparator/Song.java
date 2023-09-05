package com.comparator;

import java.util.Comparator;
import java.util.Date;

public class Song implements Comparator<Song>{

	private int id;
	private String Name;
	private String singer;
	private Date date;

	public Song() {
		super();
	}

	public Song(int id, String name, String singer, Date date) {
		super();
		this.id = id;
		Name = name;
		this.singer = singer;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getsinger() {
		return singer;
	}

	public void setsinger(String singer) {
		this.singer = singer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Song [id=" + id + ", Name=" + Name + ", singer=" + singer + ", date=" + date + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.equals(obj);
	}

	@Override
	public int compare(Song o1, Song o2) {
		int c = o1.getName().compareToIgnoreCase(o2.getName());
		if(c==0) {
			c = o1.getsinger().compareToIgnoreCase(o2.getsinger());
		}
		return c;
	}

}
