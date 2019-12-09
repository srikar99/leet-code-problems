package com.srikar.leetcode.strings;

import java.util.Stack;

/**
 * Balanced strings are those who have equal quantity of 'L' and 'R' characters.
 * 
 * Given a balanced string s split it in the maximum amount of balanced strings.
 * 
 * Return the maximum amount of splitted balanced strings.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "RLRRLLRLRL" Output: 4 Explanation: s can be split into "RL",
 * "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 * 
 * @author shreekar.pujari
 *
 */
public class SplitBalancedStrings {

	public int balancedStringSplit(String str) {

		char[] balance = str.toCharArray();
		Stack<Character> s = new Stack<>();

		int rCount = 0, lCount = 0;
		int count = 0;

		for (int i = 0; i < balance.length; i++) {

			if (s.isEmpty()) {
				s.push(balance[i]);
				if (balance[i] == 'R') {
					rCount++;
				} else {
					lCount++;
				}
			} else {
				char top = s.peek();

				if (top == balance[i]) {
					s.push(balance[i]);
					if (balance[i] == 'R') {
						rCount++;
					} else {
						lCount++;
					}
				} else {
					char c = s.pop();

					if (c == 'R') {
						rCount--;
					} else {
						lCount--;
					}
				}
			}

			if (lCount == 0 && rCount == 0) {
				count++;
			}
		}

		return count;
	}
}
