package com.srikar.leetcode.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the first non-repeating character in it and return it's
 * index. If it doesn't exist, return -1.
 * 
 * Examples:
 * 
 * s = "leetcode" return 0.
 * 
 * s = "loveleetcode", return 2. Note: You may assume the string contain only
 * lowercase letters.
 * 
 * @author shreekar.pujari
 *
 */
public class FirstUniqueLetterInAString {

	public int firstUniqChar(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int n = s.length();

		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (int i = 0; i < n; i++) {
			if (map.get(s.charAt(i)) == 1) {
				return i;
			}
		}

		return -1;
	}
}
