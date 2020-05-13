package com.srikar.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class DiceRollSumUnique {

	public static void main(String[] args) {
		List<List<Integer>> list = diceRoll(2, 7);

		for (List<Integer> l : list) {
			for (int i : l) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	private static List<List<Integer>> diceRoll(int n, int sum) {

		List<Integer> list = new ArrayList<>();
		List<List<Integer>> res = new ArrayList<>();

		helper(res, list, n, sum, 0, 1);

		return res;
	}

	private static void helper(List<List<Integer>> res, List<Integer> list, int k, int n, int currSum, int currDie) {

		if (k == 0) {
			if (currSum == n) {
				res.add(new ArrayList<>(list));
			}
		} else if (currSum + 1 * k <= n && currSum + 6 * k >= n) {
			for (int i = currDie; i <= 6; i++) {
				list.add(i);
				helper(res, list, k - 1, n, i + currSum, i);
				list.remove(list.size() - 1);
			}
		}
	}
}
