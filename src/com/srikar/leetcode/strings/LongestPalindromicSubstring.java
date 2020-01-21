package com.srikar.leetcode.strings;

public class LongestPalindromicSubstring {
	
	public static void main(String[] args) {
		LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
		String p = longestPalindromicSubstring.longestPalindrome("abc");
		System.out.println(p);
	}
	
	public String longestPalindrome(String s) {

		if (s == null || s.length() == 0) {
			return s;
		}

		int start = 0, end = 0;

		for (int i = 0; i < s.length(); i++) {
			int len1 = expand(s, i, i);
			int len2 = expand(s, i, i + 1);

			int len = Math.max(len1, len2);

			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}

		return s.substring(start, end + 1);
	}

	public int expand(String s, int left, int right) {

		int L = left, R = right;
		while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
			L--;
			R++;
		}

		return R - L - 1;
	}
	
	// brute
}
