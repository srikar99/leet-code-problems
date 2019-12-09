package com.srikar.leetcode.strings;

public class ToCharArray {

	public static void main(String[] args) {
		String str = "abc";
		char[] charArray = toCharArray(str);
		
		for(char c : charArray) {
			System.out.println(c);
		}
	}
	
	private static char[] toCharArray(String str) {
		int length = str.length();
		char[] buffer = new char[length];
		
		System.arraycopy(str.toCharArray(), 0, buffer, 0, length);
		
		return buffer;
	}
}
