package com.java;

import java.util.Arrays;

public enum ThreadStatus {

	START("start", "main", 0), 
	RUNNING("running", "method", 1),
	RUN("run", "service", 2);

	private final String start;
	private final String main;
	private final int status;

	private ThreadStatus(String start, String main, int status) {
		this.start = start;
		this.main = main;
		this.status = status;
	}

	public String getStart() {
		return start;
	}

	public String getMain() {
		return main;
	}

	public int getStatus() {
		return status;
	}
	
	public static ThreadStatus getThreadStatusByStart(String value) {

		return Arrays.stream(ThreadStatus.values())
				.filter(e -> e.getStart()
				.equalsIgnoreCase(value)).findFirst().get();
	}

}
