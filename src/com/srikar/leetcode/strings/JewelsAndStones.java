package com.srikar.leetcode.strings;

/**
 * You're given strings J representing the types of stones that are jewels, and
 * S representing the stones you have. Each character in S is a type of stone
 * you have. You want to know how many of the stones you have are also jewels.
 * 
 * The letters in J are guaranteed distinct, and all characters in J and S are
 * letters. Letters are case sensitive, so "a" is considered a different type of
 * stone from "A".
 * 
 * @author shreekar.pujari
 *
 */
public class JewelsAndStones {

	public static void main(String[] args) {
		String J = "aA", S = "aAAbbbb";
		System.out.println(numJewelsInStones(J, S));
	}

	public static int numJewelsInStones(String J, String S) {
		char[] j = J.toCharArray();
		char[] s = S.toCharArray();
		int count = 0;

		for (int i = 0; i < s.length; i++) {
			for (int k = 0; k < j.length; k++) {
				if (j[k] == s[i]) {
					count++;
				}
			}
		}

		return count;
	}
}
