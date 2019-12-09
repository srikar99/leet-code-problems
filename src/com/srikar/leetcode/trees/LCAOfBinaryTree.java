package com.srikar.leetcode.trees;

public class LCAOfBinaryTree {

	class TreeNode {

		TreeNode left = null, right = null;
		int val;

		public TreeNode(int x) {
			this.val = x;
		}
	}

	public static void main(String[] args) {
	}
	
	public static TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null || root == p || root == q) {
			return root;
		}
		
		TreeNode left = lca(root.left, p, q);
		TreeNode right = lca(root.right, p, q);
		
		if(left != null && right != null) {
			return root;
		}
		
		return left == null ? right : left;
	}
}
