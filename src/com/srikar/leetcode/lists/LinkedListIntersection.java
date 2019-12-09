package com.srikar.leetcode.lists;

import java.util.HashSet;
import java.util.Set;

public class LinkedListIntersection {

	class ListNode {
		ListNode next;
		int val;

		public ListNode(int x) {
			this.val = x;
		}
	}

	public static void main(String[] args) {

	}

	public static ListNode listIntersectionBruteForce(ListNode headA, ListNode headB) {
		ListNode pa = headA, pb;
		while (pa != null) {
			for (pb = headB; pb != null; pb = pb.next) {
				if (pa == pb) {
					return pa;
				}
			}
			pa = pa.next;
		}
		return null;
	}

	public static ListNode listIntersectionHashing(ListNode A, ListNode B) {

		Set<ListNode> nodes = new HashSet<>();
		ListNode pA = A;

		while (pA != null) {
			nodes.add(pA);
			pA = pA.next;
		}

		if (nodes.size() == 0) {
			return null;
		}

		ListNode pB = B;

		while (pB != null) {
			if (nodes.contains(pB)) {
				return pB;
			}

			nodes.add(pB);
			pB = pB.next;
		}

		return null;
	}

	public static ListNode listIntersection2Pointers(ListNode headA, ListNode headB) {
		ListNode pA = headA, pB = headB;

		while (pA != pB) {
			pA = (pA != null) ? pA.next : headB;
			pB = (pB != null) ? pB.next : headA;
		}

		return pA;
	}
}
