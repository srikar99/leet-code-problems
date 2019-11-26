package com.srikar.leetcode.trees;

public class SortedArrayToBalancedBST {
	
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4, 5};
		convertArrayToBST(A);
	}

	private static TreeNode convertArrayToBST(int[] A) {
		int start = 0, end = A.length - 1;

		if (start < end) {
			return null;
		}

		return convertArrayToBST(A, start, end);
	}

	private static TreeNode convertArrayToBST(int[] A, int start, int end) {
		if (start < end) {
			return null;
		}

		int mid = (start + end) / 2;

		TreeNode node = new TreeNode(A[mid]);
		
		node.left = convertArrayToBST(A, start, mid - 1);
		node.right = convertArrayToBST(A, mid + 1, end);
		
		return node;
	}
}

class TreeNode {
	TreeNode left = null, right = null;
	int val;

	public TreeNode(int val) {
		this.val = val;
	}
}
