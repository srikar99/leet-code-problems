package com.srikar.leetcode.lists;

public class RemoveNthNodeFromLastInAList {

	class ListNode {
		int val;
		ListNode next;
		
		public ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head, second = head;
        
        // move the second pointer to nth node from first
        for(int i = 0; i < n; i++) {
            if(second.next == null) {
                if(i == n - 1) {
                    head = head.next;
                }
                return head;
            }
            second = second.next;
        }
        
        // start the second pointer from nth node from starting and move
        // the first pointer till second pointer hits last node
        // once second node reaches last node, first node is at nth node from the last
        // remove that node and return head
        while(second.next != null) {
            second = second.next;
            first = first.next;
        }
        
        first.next = first.next.next;
        
        return head;
    }
}
