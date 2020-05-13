package com.srikar.leetcode.strings;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		
		boolean b = isAnagram(s, t, s.length());
		boolean c = isAnagram(s, t);
		
		System.out.println(b);
		System.out.println(c);
		
	}
	
	// using hashing technique
	private static boolean isAnagram(String s, String t, int length) {
		
		int[] counter = new int[26];
		
		if(s.length() != t.length()) {
			return false;
		}
		
		for(int i = 0; i < length; i++) {
			counter[s.charAt(i) - 'a']++;
			counter[t.charAt(i) - 'a']--;
		}
		
		for(int count : counter) {
			if(count != 0) {
				return false;
			}
		}
		
		return true;
	}
	
	// using sorting technique
	private static boolean isAnagram(String s, String t) {
		
		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
	}
}
