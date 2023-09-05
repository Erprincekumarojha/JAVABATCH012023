package com.app;

import java.util.ArrayList;
import java.util.List;

class Entity<K, V> {
	private K key;
	private V value;

	public Entity(K key, V value) {
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
		return "Entity [key=" + key + ", value=" + value + "]";
	}

}

class CustomMap<K, V> {

	private List<Entity<K, V>> entity;

	public CustomMap() {
		entity = new ArrayList<>();
	}

	public void put(K key, V value) {
		for (Entity e : entity) {
			if (e.getKey().equals(key)) {
				e.setValue(value); // update value only
				return;
			}
		}
		entity.add(new Entity(key, value));// if new key

	}

	public V get(K key) {
		for (Entity e : entity) {
			if (e.getKey().equals(key)) {
				return (V) e.getValue();
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "CustomMap [entity=" + entity + "]";
	}
	
	
}

public class MapTest {

	public static void main(String[] args) {

		CustomMap<Integer, String> map1 = new CustomMap<>();
		map1.put(101, "Rohit");
		map1.put(102, "Ajay");
		map1.put(103, "Deepak");
		System.out.println(map1);
		
		CustomMap<Integer, Integer> map2 = new CustomMap<>();
		map2.put(101, 1021);
		map2.put(102, 23545);
		map2.put(103, 235);
		System.out.println(map2);
		
		
	}

}
