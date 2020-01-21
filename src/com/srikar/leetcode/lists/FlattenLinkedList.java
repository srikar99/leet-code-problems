package com.srikar.leetcode.lists;

public class FlattenLinkedList {

	public static void main(String[] args) {
		ListNodeWithChild head = insertItems();
		ListNodeWithChild node = flattenList(head);
		printList(node);
	}

	public static ListNodeWithChild insertItems() {
		int arr1[] = new int[] { 10, 5, 12, 7, 11 };
		int arr2[] = new int[] { 4, 20, 13 };
		int arr3[] = new int[] { 17, 6 };
		int arr4[] = new int[] { 9, 8 };
		int arr5[] = new int[] { 19, 15 };
		int arr6[] = new int[] { 2 };
		int arr7[] = new int[] { 16 };
		int arr8[] = new int[] { 3 };

		/* create 8 linked lists */
		ListNodeWithChild head1 = insertItems(arr1, arr1.length);
		ListNodeWithChild head2 = insertItems(arr2, arr2.length);
		ListNodeWithChild head3 = insertItems(arr3, arr3.length);
		ListNodeWithChild head4 = insertItems(arr4, arr4.length);
		ListNodeWithChild head5 = insertItems(arr5, arr5.length);
		ListNodeWithChild head6 = insertItems(arr6, arr6.length);
		ListNodeWithChild head7 = insertItems(arr7, arr7.length);
		ListNodeWithChild head8 = insertItems(arr8, arr8.length);

		/* modify child pointers to create the list shown above */
		head1.child = head2;
		head1.next.next.next.child = head3;
		head3.child = head4;
		head4.child = head5;
		head2.next.child = head6;
		head2.next.next.child = head7;
		head7.child = head8;

		return head1;
	}

	public static ListNodeWithChild insertItems(int[] a, int n) {
		ListNodeWithChild node = null;
		ListNodeWithChild p = null;

		int i;
		for (i = 0; i < n; ++i) {
			if (node == null) {
				node = p = new ListNodeWithChild(a[i]);
			} else {
				p.next = new ListNodeWithChild(a[i]);
				p = p.next;
			}
			p.next = p.child = null;
		}
		return node;
	}

	public static ListNodeWithChild flattenList(ListNodeWithChild node) {

		if (node == null) {
			return node;
		}

		ListNodeWithChild head = node, tail = node;

		while (tail.next != null) {
			tail = tail.next;
		}

		ListNodeWithChild temp = null;

		while (head != tail) {
			if (head.child != null) {
				tail.next = head.child;
			}
			temp = head.child;

			while (temp != null && temp.next != null) {
				temp = temp.next;
			}

			tail = temp;
			head = head.next;
		}

		return node;
	}

	public static void printList(ListNodeWithChild node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
		System.out.println("");
	}
}

class ListNodeWithChild {
	ListNodeWithChild next, child;
	int val;

	public ListNodeWithChild(int x) {
		this.val = x;
	}
}
