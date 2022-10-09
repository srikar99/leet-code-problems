package com.srikar.leetcode.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

	public static void main(String[] args) {
		String s = "anagramAB";
		String t = "AnagaramC";
		
		boolean b = isAnagram(s, t, s.length());
		boolean c = isAnagram(s, t);
		
		System.out.println(b);
		System.out.println(c);
		
	}
	
	// using hashing technique
	private static boolean isAnagram(String s, String t, int length) {
		
		int[] counter = new int[26];
		Map<Character, Integer> smap = new HashMap<>();
		Map<Character, Integer> tmap = new HashMap<>();	


		if(s.length() != t.length()) {
			return false;
		}
		
		for(int i = 0; i < length; i++) {
			smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
			tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) + 1);
		}
		
		for(int i = 0; i < length; i++) {
			char c = s.charAt(i);

			if(smap.get(c) != tmap.get(c)) {
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
