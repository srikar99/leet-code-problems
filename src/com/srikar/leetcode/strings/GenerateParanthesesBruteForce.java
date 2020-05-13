package com.srikar.leetcode.strings;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesesBruteForce {
	
	public static void main(String[] args) {
		GenerateParanthesesBruteForce g = new GenerateParanthesesBruteForce();
		g.generateParenthesis(3);
	}
	
	public List<String> generateParenthesis(int n) {

		List<String> list = new ArrayList<>();
		generateAll(new char[2 * n], 0, list);

		return list;
	}

	public void generateAll(char[] c, int p, List<String> list) {
		// base case
		if (p == c.length) {
			if (isValid(c)) {
				list.add(new String(c));
			}
		} else {
			c[p] = '(';
			generateAll(c, p + 1, list);
			c[p] = ')';
			generateAll(c, p + 1, list);
		}
	}

	public boolean isValid(char[] ch) {
		int b = 0;

		for (char c : ch) {
			if (c == '(')
				b++;
			else
				b--;
			if (b < 0)
				return false;
		}

		return (b == 0);
	}
}
