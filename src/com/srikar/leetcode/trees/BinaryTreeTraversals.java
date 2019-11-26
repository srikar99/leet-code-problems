package com.srikar.leetcode.trees;

import java.util.Stack;

public class BinaryTreeTraversals {

	// Root of Binary Tree
	BinaryTree root;

	BinaryTreeTraversals() {
		root = null;
	}

	class BinaryTree {
		BinaryTree left;
		BinaryTree right;
		int key;

		public BinaryTree(int key) {
			this.key = key;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		BinaryTreeTraversals tree = new BinaryTreeTraversals();
		tree.root = tree.new BinaryTree(1);
		tree.root.left = tree.new BinaryTree(2);
		tree.root.right = tree.new BinaryTree(3);
		tree.root.left.left = tree.new BinaryTree(4);
		tree.root.left.right = tree.new BinaryTree(5);

		System.out.println("Preorder traversal of binary tree is ");
		tree.preorder(tree.root);

		System.out.println("\nInorder traversal of binary tree is ");
		tree.inorder(tree.root);

		System.out.println("\nPostorder traversal of binary tree is ");
		tree.postorder(tree.root);

		System.out.println("\nPreorder traversal without recursion of binary tree is ");
		tree.preorderWithoutRecurstion(tree.root);

		System.out.println("\nInorder traversal without recursion of binary tree is ");
		tree.inorderWithoutRecursion(tree.root);

		System.out.println("\nMorris traversal of binary tree is ");
		tree.morrisTraversal(tree.root);
	}

	private void inorder(BinaryTree root) {

		if (root == null) {
			return;
		}

		inorder(root.left);
		System.out.print(root.key + " ");
		inorder(root.right);
	}

	private void postorder(BinaryTree root) {

		if (root == null) {
			return;
		}

		postorder(root.left);
		postorder(root.right);
		System.out.print(root.key + " ");
	}

	private void preorder(BinaryTree root) {

		if (root == null) {
			return;
		}

		System.out.print(root.key + " ");
		preorder(root.left);
		preorder(root.right);
	}

	private void inorderWithoutRecursion(BinaryTree root) {
		Stack<BinaryTree> stack = new Stack<>();
		BinaryTree current = root;

		while (current != null || stack.size() > 0) {
			while (current != null) {
				stack.push(current);
				current = current.left;
			}

			current = stack.pop();
			System.out.print(current.key + " ");
			current = current.right;
		}
	}

	private void preorderWithoutRecurstion(BinaryTree root) {
		if (root == null) {
			return;
		}

		Stack<BinaryTree> s = new Stack<>();

		s.push(root);

		while (!s.isEmpty()) {
			BinaryTree node = s.pop();
			System.out.print(node.key + " ");

			if (node.right != null) {
				s.push(node.right);
			}

			if (node.left != null) {
				s.push(node.left);
			}
		}
	}

	private void morrisTraversal(BinaryTree root) {
		// TODO
	}
}
