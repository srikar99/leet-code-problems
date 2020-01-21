package com.srikar.leetcode.lists;

public class ReverseList {

	public ListNode reverseList(ListNode head) {
		ListNode prev = null, next = null;
		ListNode curr = head;
		ListNode node = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		node = prev;

		return node;
	}
}
