package com.srikar.leetcode.strings;

public class LengthOfLastWord {

	public static void main(String[] args) {
		LengthOfLastWord lastWord = new LengthOfLastWord();
		lastWord.lengthOfLastWord("");
	}

	public int lengthOfLastWord(String s) {
		String[] st = s.split(" ");

		if (st == null || st.length == 0) {
			return 0;
		}
		
		return st[st.length - 1].length();
	}
}
