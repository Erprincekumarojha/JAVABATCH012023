package com.prime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDateOnConsole {
	
	public static void main(String[] args) throws ParseException {
		
		String date = "12-02-1998";
		SimpleDateFormat formate = new SimpleDateFormat("dd-mm-yyyy");
		Date parse = formate.parse(date);
		System.out.println(parse);
	}

}
