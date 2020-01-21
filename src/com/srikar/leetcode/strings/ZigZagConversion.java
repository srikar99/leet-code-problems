package com.srikar.leetcode.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
 * of rows like this: (you may want to display this pattern in a fixed font for
 * better legibility)
 * 
 * P A H N A P L S I I G Y I R And then read line by line: "PAHNAPLSIIGYIR"
 * 
 * Write the code that will take a string and make this conversion given a
 * number of rows:
 * 
 * string convert(string s, int numRows);
 * 
 * @author shreekar.pujari
 *
 */
public class ZigZagConversion {

	public String convert(String s, int numRows) {

		if (numRows == 1) {
			return s;
		}

		List<StringBuilder> list = new ArrayList<>();

		for (int i = 0; i < Math.min(numRows, s.length()); i++) {
			list.add(new StringBuilder());
		}

		int currRow = 0;
		boolean goingDown = false;

		for (char c : s.toCharArray()) {
			list.get(currRow).append(c);
			if (currRow == 0 || currRow == numRows - 1) {
				goingDown = !goingDown;
			}

			currRow += goingDown ? 1 : -1;
		}

		StringBuilder result = new StringBuilder();

		for (StringBuilder sb : list) {
			result.append(sb);
		}

		return result.toString();
	}
}
