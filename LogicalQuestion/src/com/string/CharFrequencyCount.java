package com.string;

public class CharFrequencyCount {

	public static void main(String[] args) {

		String str = "javaj awesome";
		char[] arr = str.toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			if(arr[i] == ' ') continue;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = '0';
				}
			}
            if(arr[i]!='0')
			System.out.println(arr[i] + " - " + count);

		}

	}

}
