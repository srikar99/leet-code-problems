package com.srikar.leetcode.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChars {

	public static void main(String[] args) {
		System.out.println(longestSubstring("ABDEFGABEF"));
		System.out.println(longestSubstringBruteForce("ABDEFGABEF"));
		System.out.println(longestSubstringSlidingWindow("ABDEFGABEF"));
	}

	private static int longestSubstringBruteForce(String s) {
		int result = 0;
		int n = s.length();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				if (isUniqueSubstring(s, i, j)) {
					result = Math.max(result, j - i);
				}
			}
		}
		return result;
	}

	private static boolean isUniqueSubstring(String s, int start, int end) {

		Set<Character> set = new HashSet<>();

		for (int i = start; i < end; i++) {
			if (set.contains(s.charAt(i))) {
				return false;
			}
			set.add(s.charAt(i));
		}

		return true;
	}

	private static int longestSubstring(String s) {

		int l = s.length();
		int current_idx = 1, max_idx = 1, prev_idx = -1;
		int[] visited = new int[256];

		for (int i = 0; i < visited.length; i++) {
			visited[i] = -1; // all chars are unvisited
		}

		visited[s.charAt(0)] = 0; // first char is visited

		for (int j = 1; j < l; j++) {
			prev_idx = visited[s.charAt(j)];

			if (prev_idx == -1 || (j - current_idx) > prev_idx) {
				current_idx++;
			} else {
				if (current_idx > max_idx) {
					max_idx = current_idx;
				}
				current_idx = j - prev_idx;
			}
			visited[s.charAt(j)] = j;
		}

		if (current_idx > max_idx) {
			max_idx = current_idx;
		}

		return max_idx;
	}

	private static int longestSubstringSlidingWindow(String s) {
		int result = 0;
		int n = s.length(), i = 0, j = 0;

		Set<Character> set = new HashSet<>();

		while (i < n && j < n) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				result = Math.max(result, j - i);
			} else {
				set.remove(s.charAt(i++));
			}
		}
		return result;
	}
}
