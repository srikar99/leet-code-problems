package com.srikar.leetcode.strings;

import java.util.Stack;

public class LongestValidParentheses {
	
	public static void main(String[] args) {
		LongestValidParentheses longestValidParentheses = new LongestValidParentheses();
		longestValidParentheses.longestValidParentheses(")()())");
		longestValidParentheses.longestValidParenthesesDP(")()())");
	}

	/**
	 * approach 1: time complexity O(n^3) space complexity O(n) -- stack takes space
	 */
	public int longestValidParentheses(String s) {

		if (s == null || s.length() < 1) {
			return -1;
		}

		int max_length = 0;

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 2; j <= s.length(); j++) {
				if (isValid(s.substring(i, j))) {
					max_length = Math.max(max_length, j - i);
				}
			}
		}
		return max_length;
	}

	private boolean isValid(String str) {
		Stack<Character> s = new Stack<>();

		char[] a = str.toCharArray();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == '(') {
				s.push(a[i]);
			} else if (!s.isEmpty() && s.peek() == '(') {
				s.pop();
			} else {
				return false;
			}
		}

		return s.isEmpty();
	}

	/**
	 * approach 2: using dynamic programming
	 * time complexity: O(n)
	 * space complexity: O(n)
	 */
	public int longestValidParenthesesDP(String s) {
		if (s == null || s.length() < 1) {
			return 0;
		}

		int max_length = 0;
		int[] dp = new int[s.length()];

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == ')') {
				if (s.charAt(i - 1) == '(') {
					dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
				} else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
					dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
				}
				max_length = Math.max(max_length, dp[i]);
			}
		}

		for(int i : dp) {
			System.out.print(i + " ");
		}
		return max_length;
	}
}
