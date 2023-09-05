package com.base64;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Base64Test {

	public static void main(String[] args) {
        //encode password
		String password = "pk12345";
		Encoder encoder = Base64.getEncoder();

		String encodePassword = encoder.encodeToString(password.getBytes());
		System.out.println(encodePassword);
		
		//decode password
		String encodePwd = "cGsxMjM0NQ==";
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodePwd);
		String decodePassword = new String(decode);
		System.out.println(decodePassword);

	}

}
