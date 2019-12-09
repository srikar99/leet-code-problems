package com.srikar.leetcode.strings;

public class RepeatedSubstringPatterns {

	public static void main(String[] args) {
		System.out.println(isRepeatedSubstringPattern("abcabcabc"));
	}

	private static boolean isRepeatedSubstringPattern(String s) {

		int n = s.length();
		int[] rsp = new int[n];

		calculateRSP(s, n, rsp);

		int len = rsp[n - 1];

		return (len > 0 && n % (n - len) == 0) ? true : false;
	}

	private static void calculateRSP(String s, int n, int[] rsp) {
		int length = 0, i;

		rsp[0] = 0;
		i = 1;

		while (i < n) {
			if (s.charAt(i) == s.charAt(length)) {
				length++;
				rsp[i] = length;
				i++;
			} else {
				if (length != 0) {
					// This is tricky. Consider the
					// example AAACAAAA and i = 7.
					length = rsp[length - 1];

					// Also, note that we do
					// not increment i here
				} else {
					rsp[i] = 0;
					i++;
				}
			}
		}
	}
}
