package com.srikar.leetcode.strings;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		String longestPrefix = longestCommonPrefix(strs);
		
		System.out.println(longestPrefix);
	}

	private static String longestCommonPrefix(String[] strs) {
		String longestPrefix = "";

		if (strs == null || strs.length == 0) {
			return longestPrefix;
		}

		// assume the first string is complete prefix
		String prefix = strs[0];

		if (strs.length == 1) {
			return prefix;
		}

		for (int i = 1; i < strs.length; i++) {
			longestPrefix = "";
			for (int j = 0; j < prefix.length() && j < strs[i].length(); j++) {
				if (strs[i].charAt(0) != prefix.charAt(0)) {
					return longestPrefix;
				}

				if (strs[i].charAt(j) == prefix.charAt(j)) {
					longestPrefix = longestPrefix + prefix.charAt(j);
				}
			}

			prefix = longestPrefix;
		}

		return longestPrefix;
	}
}
