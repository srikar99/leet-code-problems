package com.srikar.leetcode.trees;

public class MinDepth {

	class TreeNode {
		int val;
		TreeNode left, right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		MinDepth minDepth = new MinDepth();

		TreeNode root = minDepth.new TreeNode(3);
		root.left = minDepth.new TreeNode(9);
		root.right = minDepth.new TreeNode(20);
		root.right.left = minDepth.new TreeNode(15);
		root.right.right = minDepth.new TreeNode(7);

		int depth = minDepth.minDepth(root);
		System.out.println(depth);
	}

	public int minDepth(TreeNode root) {

		if (root == null) {
			return 0;
		}

		if (root.left == null && root.right == null) {
			return 1;
		}

		if (root.left == null) {
			return minDepth(root.right) + 1;
		}

		if (root.right == null) {
			return minDepth(root.left) + 1;
		}

		return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
	}
}
