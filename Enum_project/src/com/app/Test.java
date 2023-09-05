package com.app;

import java.util.Stack;

public class Test {

	public static boolean isValid(String s) {

		Stack stack = new Stack();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '[' || ch == '{' || ch == '(') {
				stack.push(ch);
				continue;
			}
			if (stack.size() > 0) {
				char temp = '0';
				switch (ch) {
				case '}': {
					temp = (char) stack.peek();
					if (temp == '{')
						stack.pop();
					else
						return false;
					break;
				}
				case ']': {
					temp = (char) stack.peek();
					if (temp == '[')
						stack.pop();
					else
						return false;
					break;
				}
				case ')': {
					temp = (char) stack.peek();
					if (temp == '(')
						stack.pop();
					else
						return false;
					break;
				}

				}
			}
		}
		if (stack.empty()) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		if(isValid("")) {
			System.out.println("Good");
		}else {
			System.out.println("Bad");
		}
	}
}
