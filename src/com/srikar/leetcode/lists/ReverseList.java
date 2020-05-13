package com.srikar.leetcode.lists;

public class ReverseList {

	public ListNode reverseList(ListNode head) {
		ListNode prev = null, next = null;
		ListNode curr = head;
		ListNode node = null;

		while (curr != null) {
			
			// forward the current pointer
			next = curr.next;
			// keep track of previous pointers
			curr.next = prev;
			// reset to proper pointers
			prev = curr;
			curr = next;
		}

		node = prev;

		return node;
	}
}
