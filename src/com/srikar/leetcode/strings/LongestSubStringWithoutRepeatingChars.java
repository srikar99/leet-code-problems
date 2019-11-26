package com.srikar.leetcode.strings;

public class LongestSubStringWithoutRepeatingChars {

	public static void main(String[] args) {
		System.out.println(longestSubstring("ABDEFGABEF"));
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
		
		if(current_idx > max_idx) {
			max_idx = current_idx;
		}
		
		return max_idx;
	}
}
