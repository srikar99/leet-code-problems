package com.srikar.leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
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

		System.out.println("\nPreorder traversal without recursion of binary tree is ");
		tree.preorderWithoutRecurstion(tree.root);
		
		System.out.println("\nPostorder traversal of binary tree is ");
		tree.postorder(tree.root);

		System.out.println("\nPostorder traversal without recursion of binary tree is ");
		tree.postorderWithoutRecursion(tree.root);

		System.out.println("\nInorder traversal of binary tree is ");
		tree.inorder(tree.root);
		
		System.out.println("\nInorder traversal without recursion of binary tree is ");
		tree.inorderWithoutRecursion(tree.root);
		
		System.out.println("\nMorris traversal of binary tree is ");
		tree.morrisTraversal(tree.root);

		System.out.println("\nLevel order traversal of binary tree is ");
		tree.levelOrderTraversal(tree.root);
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

		BinaryTree current, pre;
		if (root == null)
			return;

		current = root;
		while (current != null) {
			if (current.left == null) {
				System.out.print(current.key + " ");
				current = current.right;
			} else {
				/* Find the inorder predecessor of current */
				pre = current.left;
				while (pre.right != null && pre.right != current)
					pre = pre.right;

				/* Make current as right child of its inorder predecessor */
				if (pre.right == null) {
					pre.right = current;
					current = current.left;
				}

				/*
				 * Revert the changes made in the 'if' part to restore the original tree i.e.,
				 * fix the right child of predecessor
				 */
				else {
					pre.right = null;
					System.out.print(current.key + " ");
					current = current.right;
				} /* End of if condition pre->right == NULL */

			} /* End of if condition current->left == NULL */

		}
	}
	
	private void levelOrderTraversal(BinaryTree root) {

		Queue<BinaryTree> queue = new LinkedList<>();

		if (root == null) {
			return;
		}

		queue.add(root);

		while (!queue.isEmpty()) {

			BinaryTree temp = queue.poll();
			System.out.print(temp.key + " ");

			if (temp.left != null) {
				queue.add(temp.left);
			}

			if (temp.right != null) {
				queue.add(temp.right);
			}
		}
	}
	
	private List<Integer> postorderWithoutRecursion(BinaryTree root) {
        
        Stack<BinaryTree> s = new Stack<>();
        List<Integer> list = new ArrayList<>();
        
        BinaryTree prev = null;
        if(root == null) {
            return list;
        }
        
        s.push(root);
        
        while(!s.isEmpty()) {
        	BinaryTree current = s.peek();
            
            if(prev == null || prev.left == current || prev.right == current) {
                if(current.left != null) {
                    s.push(current.left);
                } else if(current.right != null) {
                    s.push(current.right);
                } else {
                	BinaryTree node = s.pop();
                	System.out.print(node.key + " ");
                    list.add(node.key);
                }
            } else if(current.left == prev) {
                if(current.right != null) {
                    s.push(current.right);
                } else {
                	BinaryTree node = s.pop();
                	System.out.print(node.key + " ");
                    list.add(node.key);
                }
            } else if(current.right == prev) {
            	BinaryTree node = s.pop();
            	System.out.print(node.key + " ");
                list.add(node.key);
            }
            
            prev = current;
        }
        
        return list;
    }
}
