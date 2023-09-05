package com.string;

public class CountWordInString {
	//4. Write a program to count the words in a given String
	public static void main(String[] args) {
		
		String str = "  java is  \n awesome";
		str = str.replaceAll("\n", "");
		//str = str.trim();
		//String[] split = str.split("\\s+");
		//System.out.println(split.length);
		
		//StringTokenizer tokenizer= new StringTokenizer(str);
		//System.out.println("Word Count : "+tokenizer.countTokens());
		
		char[] arr = str.toCharArray();
		
		int countWord = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if( ((arr[0]!=' ') && (i==0)) || ((i>0)&&(arr[i]!=' ')&& arr[i-1]==' ')) {
				countWord++;
			}
			
		}
		System.out.println("Word Count : "+countWord);
	}

}
