package com.srikar.leetcode.lists;

import java.util.HashSet;
import java.util.Set;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class ListLinkedCycle {

	public boolean hasCycle(ListNode head) {
		
		Set<ListNode> nodes = new HashSet<>();
		
		while(head != null) {
			if(nodes.contains(head)) {
				return true;
			}
			
			nodes.add(head);
			head = head.next;
		}
		
		return false;
	}
	
	public boolean hasCycleFloydAlgo(ListNode head) {
		ListNode first = head, second = head;

		while (first != null && second != null && second.next != null) {
			first = first.next;
			second = second.next.next;
			if (first == second) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		ListNode third = new ListNode(3);
		head.next.next = third;
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = third;
		
		ListLinkedCycle cycle = new ListLinkedCycle();
		System.out.println(cycle.hasCycle(head));
		System.out.println(cycle.hasCycleFloydAlgo(head));
	}
}
