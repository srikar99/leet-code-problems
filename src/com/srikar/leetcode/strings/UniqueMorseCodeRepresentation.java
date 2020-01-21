package com.srikar.leetcode.strings;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeRepresentation {
	public int uniqueMorseRepresentations(String[] words) {

		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		Set<String> set = new HashSet<>();

		for (String word : words) {
			StringBuilder sb = new StringBuilder();
			for (char c : word.toCharArray()) {
				sb.append(morse[c - 'a']);
			}
			set.add(sb.toString());
		}

		return set.size();
	}
}
