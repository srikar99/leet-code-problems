package com.srikar.leetcode.strings;

/**
 * Write a function that reverses a string. The input string is given as an
 * array of characters char[].
 * 
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 * 
 * You may assume all the characters consist of printable ascii characters.
 * 
 * @author shreekar.pujari
 *
 */
public class ReverseString {

	public void reverseString(char[] s) {

		int start = 0, end = s.length - 1;

		while (start < end) {
			char t = s[start];
			s[start] = s[end];
			s[end] = t;
			start++;
			end--;
		}
	}
}
