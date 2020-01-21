package com.srikar.leetcode.strings;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space
 * characters ' ', return the length of last word (last word means the last
 * appearing word if we loop from left to right) in the string.
 * 
 * If the last word does not exist, return 0.
 * 
 * Note: A word is defined as a maximal substring consisting of non-space
 * characters only.
 * 
 * @author shreekar.pujari
 *
 */
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
