package com.string;

import java.util.Arrays;
import java.util.Stack;

//How do you check if a given string contains valid parentheses?
public class CheckValidParanThesis { // v.v.i

	public static void main(String[] args) {

		String s = "()]";
		boolean status = checkParentheses(s);
		if (status) {
			System.out.println("valid");
		} else {
			System.out.println("Invalid");
		}
	}

	private static boolean checkParentheses(String s) {
		char[] arr = s.toCharArray();
		System.out.println(Arrays.toString(arr));
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);
				continue;
			}
			
			if(stack.isEmpty()) {
				return false;
			}
            char temp  =' ';
			switch (ch) {
			case '}': {
				temp = stack.peek();
                if(temp=='(' || temp =='[') {
               	 return false;
                }else {
               	 stack.pop();
                }
				break;
			 }
			case ']': {
				temp = stack.peek();
                if(temp=='{' || temp =='(') {
               	 return false;
                }else {
               	 stack.pop();
                }
				break;
			 }
			case ')': {
                 temp = stack.peek();
                 if(temp=='{' || temp =='[') {
                	 return false;
                 }else {
                	 stack.pop();
                 }
				break;
			  }
			}

		}
		
		if(stack.isEmpty()) {
			return true;
		}else {
			return false;
		}
	
	}
}
