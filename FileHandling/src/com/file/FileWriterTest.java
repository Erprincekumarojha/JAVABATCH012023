package com.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FileWriterTest {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("main started");
		
	        File f = new File("javafile");
	        
			FileWriter fw  = new FileWriter(f, true);
		
		    fw.write("java is awesome. you can learn java from our website prince kumar");
		    fw.append("Batch22");
		    fw.flush();
		    fw.close();
		    
		    try {  
	            OutputStream outputStream = new FileOutputStream("out");  
	            Writer outputStreamWriter = new OutputStreamWriter(outputStream);  
	  
	            outputStreamWriter.write("Hello World");  
	  
	            outputStreamWriter.close();  
	        } catch (Exception e) {  
	            e.getMessage();  
	        }  
		
		System.out.println("Main end");
	}

}
