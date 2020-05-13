package com.srikar.leetcode.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Is Unique: Implement an algorithm to determine if a string has all unique
 * characters. What if you cannot use additional data structures?
 * 
 * @author shreekar.pujari
 *
 */
public class IsUnique {

	public static void main(String[] args) {
		System.out.println(isUnique("abc"));
		
	}
	
	private static boolean isUnique(String s) {
		
		if(s == null || s.equals("")) {
			return false;
		}
		
		Set<Character> map = new HashSet<>();
		
		for(int i = 0; i < s.length(); i++) {
			
			if(map.contains(s.charAt(i))) {
				return false;
			}
			map.add(s.charAt(i));
		}
		
		return true;
	}
}
