package com.srikar.leetcode.trees;

public class MaxDepthBinaryTrees {

	class TreeNode {
		int val;
		TreeNode left, right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {

	}

	public int maxDepth(TreeNode root) {

		int left = 0, right = 0;

		if (root == null) {
			return 0;
		} else {
			left = maxDepth(root.left);
			right = maxDepth(root.right);

			if (left > right) {
				return left + 1;
			} else {
				return right + 1;
			}
		}
	}
}
