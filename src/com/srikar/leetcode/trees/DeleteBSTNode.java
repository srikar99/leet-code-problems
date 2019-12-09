package com.srikar.leetcode.trees;

public class DeleteBSTNode {

	class TreeNode {
		int val;
		TreeNode left, right;

		public TreeNode(int x) {
			this.val = x;
		}
	}

	public TreeNode deleteNode(TreeNode root, int key) {

		if (root == null) {
			return root;
		}

		if (key < root.val) {
			deleteNode(root.left, key);
		} else if (key > root.val) {
			deleteNode(root.right, key);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				root.val = minVal(root.right);
				root.right = deleteNode(root.right, root.val);
			}
		}

		return root;
	}

	private int minVal(TreeNode root) {
		int min = root.val;

		while (root.left != null) {
			min = root.left.val;
			root = root.left;
		}

		return min;
	}
}
