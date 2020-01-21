package com.srikar.leetcode.lists;

public class MiddleOfLinkedList {

	public ListNode findMiddle(ListNode head) {

		ListNode fast = head, slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		return slow;
	}

	public ListNode findMiddleUsingCount(ListNode head) {

		ListNode middle = head;
		int count = 0;
		
		if((count & 1) == 1) {
			middle = middle.next;
		}
		
		count++;
		head = head.next;

		return middle;
	}
}
