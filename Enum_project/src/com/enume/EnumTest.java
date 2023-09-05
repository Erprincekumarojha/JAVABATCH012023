package com.enume;

public class EnumTest {

	public static void main(String[] args) {
		
		String name = ThreadEnum.EXECUTERTHREAD.getName();
		String value = ThreadEnum.EXECUTERTHREAD.getValue();
		int code = ThreadEnum.EXECUTERTHREAD.getCode();
		System.out.println(name);
		System.out.println(value);
		System.out.println(code);
		
		System.out.println("--------------");
		
		for(ThreadEnum e : ThreadEnum.values()) {
			System.out.print(e.getName());
			System.out.print(e.getValue());
			System.out.print(e.getCode());
			System.out.println();
		}
		
		
		ThreadEnum valueByName = ThreadEnum.getByName("TaskExceution");
		System.out.println(valueByName.getName());
		System.out.println(valueByName.getValue());
		System.out.println(valueByName.getCode());
		
		System.out.println(ThreadEnum.getValueByName("TaskExceution"));
		
	}
}
