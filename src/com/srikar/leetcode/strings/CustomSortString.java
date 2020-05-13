package com.srikar.leetcode.strings;

import java.util.ArrayList;
import java.util.List;

public class CustomSortString {

	public static void main(String[] args) {
		CustomSortString css = new CustomSortString();
		String s = css.customSortString("cba", "abcd");
		System.out.println(s);
	}
	public String customSortString(String S, String T) {

		List<String> list = new ArrayList<>();;

		backtrack(list, new ArrayList<>(), T.toCharArray());

		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
			if(list.get(i).substring(0, list.get(i).length() - 1).equals(S)) {
				return list.get(i);
			}
		}
		return null;
	}

	private void backtrack(List<String> list, List<Character> temp, char[] T) {

		String s = "";
		if (temp.size() == T.length) {
			
			for(int i = 0; i < temp.size(); i++) {
				s += temp.get(i) + "";
			}
			list.add(new String((s)));

		} else {
			for (int i = 0; i < T.length; i++) {
				if (temp.contains(T[i]))
					continue;
				temp.add(T[i]);
				backtrack(list, temp, T);
				temp.remove(temp.size() - 1);
			}
		}
	}
}
