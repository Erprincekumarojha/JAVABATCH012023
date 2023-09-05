package com.singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable{

	private static Singleton obj = null;
	// we can't create object outside
	private Singleton() {
      if(obj!=null) {
    	  throw new RuntimeException("Exception occured while creating multiple Object");
      }
	}

	// to provide the object with this method only
	public static Singleton getInstance() {
		if (obj == null) {
			synchronized (Singleton.class) {
				if (obj == null)
					obj = new Singleton();
			}
			return obj;
		}
		return obj;
	}
	
	public Object readResolve() {
		return obj;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return obj;
	}
}
