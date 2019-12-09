package com.srikar.leetcode.lists;

public class Merge2SortedLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode d = new ListNode(0);
		ListNode tail = d;

		while (true) {
			if (l1 == null) {
				tail.next = l2;
				break;
			}
			if (l2 == null) {
				tail.next = l1;
				break;
			}

			if (l1.val <= l2.val) {
				tail.next = l1;
				l1 = l1.next;
			} else {
				tail.next = l2;
				l2 = l2.next;
			}

			tail = tail.next;
		}

		return d.next;
	}

	public ListNode mergeTwoListsRecursive(ListNode l1, ListNode l2) {

		if (l1 == null) {
			return l2;
		}

		if (l2 == null) {
			return l1;
		}

		if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}

	public ListNode mergeTwoListsIterative(ListNode l1, ListNode l2) {

		if (l1 == null) {
			return l2;
		}

		if (l2 == null) {
			return l1;
		}

		if (l1.val < l2.val) {
			return mergeUtil(l1, l2);
		} else {
			return mergeUtil(l2, l1);
		}

	}

	private ListNode mergeUtil(ListNode l1, ListNode l2) {

		if (l1.next == null) {
			l1.next = l2;
			return l2;
		}

		ListNode curr1 = l1, next1 = l1.next;
		ListNode curr2 = l2, next2 = l2.next;

		while(curr2 != null && next1 != null) {
			if((curr2.val) >= (curr1.val) && (curr2.val) <= (next1.val)) {
				next2 = curr2.next;
				curr1.next = curr2;
				curr2.next = next1;
				
				curr1 = curr2;
				curr2 = next2;
				
			} else {
				if(next1.next != null) {
					next1 = next1.next;
					curr1 = curr1.next;
				} else {
					next1.next = curr2;
				}
				
				return l1;
			}
		}
		return l1;
	}
}
