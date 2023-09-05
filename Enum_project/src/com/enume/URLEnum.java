package com.enume;

public enum URLEnum {
	
	
	DEV("https//localhost:5466/getData"),
	QA("https//localhost:5466/getData"),
	PROD("https//localhost:5466/getData"),
	USER("https//localhost:5466/getData"),
	UAT("https//localhost:5466/getData");
	
	private String url;
	
	private URLEnum(String url) {
		this.url = url;
	}

}
