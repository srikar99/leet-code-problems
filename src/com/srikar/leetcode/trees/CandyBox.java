package com.srikar.leetcode.trees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class CandyBox {

	class Node {

		Node left = null, right = null;
		Node key = null;
		List<Node> boxes;
		int candies;
		boolean unlocked;

		public Node(int candies, boolean unlocked) {
			this.candies = candies;
			this.unlocked = unlocked;
			this.boxes = new ArrayList<>();
		}
	}

	public static void main(String[] args) {
		CandyBox box = new CandyBox();
		Node A = box.new Node(7, true);
		Node B = box.new Node(5, false);
		Node C = box.new Node(4, true);
		Node D = box.new Node(100, false);

		A.key = null;
		B.key = null;
		C.key = B;
		D.key = null;

		A.left = B;
		A.right = C;

		B.left = D;

		int candies = bfs(A);

		System.out.println(candies);
	}

	private static int bfs(Node root) {

		if (root == null) {
			return 0;
		}

		int count = 0;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		Set<Node> keys = new HashSet<>();

		while (!queue.isEmpty()) {
			Node temp = queue.poll();

			if (temp.unlocked) {
				count += temp.candies;
				if (temp.key != null) {
					keys.add(temp.key);
				}
			}

			if (!temp.unlocked && !keys.contains(temp.key)) {
				if (temp.key != null) {
					keys.add(temp.key);
				}
			}

			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}
		}

		for (Node key : keys) {
			count += key.candies;
		}

		return count;
	}
}
