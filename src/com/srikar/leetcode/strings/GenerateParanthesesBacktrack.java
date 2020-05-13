package com.srikar.leetcode.strings;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesesBacktrack {

	public static void main(String[] args) {
		GenerateParanthesesBacktrack g = new GenerateParanthesesBacktrack();
		g.generateParenthesis(3);
		
	}
	public List<String> generateParenthesis(int n) {

		List<String> list = new ArrayList<>();
		backtrack(list, "", 0, 0, n);
		return list;
	}

	public void backtrack(List<String> list, String c, int open, int close, int max) {
		// base case
		if (c.length() == 2 * max) {
			list.add(c);
			return;
		}

		if (open < max) {
			backtrack(list, c + "(", open + 1, close, max);
		}
		if (close < open) {
			backtrack(list, c + ")", open, close + 1, max);
		}
	}
}
