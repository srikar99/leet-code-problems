package com.srikar.leetcode.trees;

public class HasPathSumBinaryTree {
	public boolean hasPathSum(TreeNode root, int sum) {

		boolean has = false;

		if (root == null) {
			return false;
		} else {
			int subsum = sum - root.val;
			if (subsum == 0 && root.left == null && root.right == null) {
				return true;
			}
			if (root.left != null) {
				has = has || hasPathSum(root.left, subsum);
			}
			if (root.right != null) {
				has = has || hasPathSum(root.right, subsum);
			}
		}
		return has;
	}
}
