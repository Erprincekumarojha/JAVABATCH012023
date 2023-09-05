package com.enume;

import java.util.Arrays;

public enum ThreadEnum {

	TASKEXECUTION("TaskExceution", "New",0),
	SCHEDULETASK("ScheduleTask", "Ready",1),
	EXECUTERTHREAD("ExecutionThread", "Run",2),
	SESSIONTHREAD("SessionThread", "Wait",3);
	
	private final String name;
	private final String value ;
	private final int code;
	
	
	private ThreadEnum(String name, String value, int code) {
		this.name = name;
		this.value = value;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public int getCode() {
		return code;
	}
	
	public static ThreadEnum getByName(String name) {
		return Arrays.stream(ThreadEnum.values())
				.filter(e->e.getName().equalsIgnoreCase(name)).findFirst().get();
	  
	}
	
	public static String getValueByName(String name) {
		return Arrays.stream(ThreadEnum.values())
				.filter(e->e.getName().equalsIgnoreCase(name)).findFirst().get().getValue();
	  
	}
}
