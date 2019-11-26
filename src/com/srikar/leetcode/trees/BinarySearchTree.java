package com.srikar.leetcode.trees;

public class BinarySearchTree {

	static class Node {
		int key;
		Node left, right;

		public Node(int key) {
			this.key = key;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		Node root = null;
		root = BinarySearchTree.insert(root, 4);
		/*
		 * BinarySearchTree.insert(root, 2); BinarySearchTree.insert(root, 1);
		 * BinarySearchTree.insert(root, 3); BinarySearchTree.insert(root, 6);
		 * BinarySearchTree.insert(root, 5);
		 */
		BinarySearchTree.insert(root, 4);
		BinarySearchTree.insert(root, 2);
		BinarySearchTree.insert(root, 7);
		BinarySearchTree.insert(root, 1);
		BinarySearchTree.insert(root, 3);
		BinarySearchTree.insert(root, 6);
		BinarySearchTree.insert(root, 10);

		System.out.println(searchMinimum(root));
		System.out.println(searchMaximum(root));

		int k = 2;
		Node kthLargest = findKthMaximum(root, k);
		System.out.println(kthLargest.key);
	}

	private static int searchMinimum(Node root) {
		while (root.left != null) {
			root = root.left;
		}

		return root.key;
	}

	private static int searchMaximum(Node root) {
		while (root.right != null) {
			root = root.right;
		}

		return root.key;
	}

	/*
	 * Given a binary search tree and a number, inserts a new node with the given
	 * number in the correct place in the tree. Returns the new root pointer which
	 * the caller should then use (the standard trick to avoid using reference
	 * parameters).
	 */
	private static Node insert(Node node, int data) {

		/*
		 * 1. If the tree is empty, return a new, single node
		 */
		if (node == null) {
			return (new Node(data));
		} else {

			/* 2. Otherwise, recur down the tree */
			if (data <= node.key) {
				node.left = insert(node.left, data);
			} else {
				node.right = insert(node.right, data);
			}

			/* return the (unchanged) node pointer */
			return node;
		}
	}

	private static Node findKthMaximum(Node root, int k) {
		// step 1: initialize current to root
		Node current = root;
		Node kthLargest = null;
		// step 2 Initialize a count variable to 0.
		int count = 0;

		while (current != null) {
			if (current.right == null) {
				count++;
				if (count == k) {
					kthLargest = current;
					return kthLargest;
				} else {
					current = current.left;
				}
			} else {
				Node succ = current.right;

				while (succ.left != null && succ.left != current) {
					succ = succ.left;
				}

				if (succ.left == null) {
					succ.left = current;
					current = current.right;
				} else {
					succ.left = null;
					if (++count == k) {
						kthLargest = current;
					}

					current = current.left;
				}
			}
		}

		return kthLargest;
	}
}
