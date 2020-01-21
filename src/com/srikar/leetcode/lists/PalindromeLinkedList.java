package com.srikar.leetcode.lists;

import java.util.Stack;

public class PalindromeLinkedList {

	class Node {
		Node next;
		int val;

		public Node(int x) {
			this.val = x;
		}
	}

	static boolean isPalindrome(Node head) {

		Node slow = head;
		boolean ispalin = true;
		Stack<Integer> stack = new Stack<Integer>();

		while (slow != null) {
			stack.push(slow.val);
			slow = slow.next;
		}

		while (head != null) {

			int i = stack.pop();
			if (head.val == i) {
				ispalin = true;
			} else {
				ispalin = false;
				break;
			}
			head = head.next;
		}
		return ispalin;
	}
}
