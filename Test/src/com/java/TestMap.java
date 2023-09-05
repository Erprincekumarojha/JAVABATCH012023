package com.java;

import java.util.ArrayList;
import java.util.List;

class Entry<K, V> {
	private K key;
	private V value;

	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Entry [key=" + key + ", value=" + value + "]";
	}
	
	
}

class CustomMap<K,V>{
	
	List<Entry<K,V>> entirys;
	public CustomMap() {
		entirys = new ArrayList<>();
	}
	
	public void put(K key, V value) {
	  for(Entry e : entirys) {
		  if(e.getKey().equals(key)) {
			  e.setValue(value); 
			  return;
		  }
	  }
	  entirys.add(new Entry<K, V>(key, value));
	}
	
	public V get(K key) {
		
		for(Entry e: entirys) {
			if(e.getKey().equals(key)) {
				return (V) e.getValue();
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "CustomMap [entirys=" + entirys + "]";
	}
	
	
}

public class TestMap {

	public static void main(String[] args) {

		 CustomMap<Integer, String> map = new CustomMap<>();
		 map.put(1, "Java");
		 map.put(2, "python");
		 
		 System.out.println(map.toString());
	}

}
