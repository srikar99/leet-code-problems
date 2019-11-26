package com.srikar.leetcode.arrays;

public class MinStack {

	int top;
	int[] stack;
	int min;

	/** initialize your data structure here. */
	public MinStack() {
		top = -1;
		stack = new int[100];
		min = Integer.MAX_VALUE;
	}

	public void push(int x) {
		if (top == -1) {
			stack[++top] = x;
			min = x;
		} else {
			if (x < min) {
				if(x == Integer.MIN_VALUE) {
					stack[++top] = Integer.MIN_VALUE;
				} else {
					stack[++top] = 2 * x - min;
				}
				min = x;
			} else {
				stack[++top] = x;
			}
		}
	}

	public void pop() {
		if (top != -1) {
			int t = stack[top--];
			if(top == 0) {
				min = stack[top];
			}
			else if (t < min) {
				min = 2 * min - t;
			}
		}
	}

	public int top() {
		return stack[top];
	}

	public int getMin() {
		return min;
	}
	
	public static void main(String[] args) {
		MinStack obj = new MinStack();
		obj.push(2147483646);
		obj.push(2147483646);
		obj.push(2147483647);
		System.out.println(obj.top());
		obj.pop();
		System.out.println(obj.getMin());
		obj.pop();
		System.out.println(obj.getMin());
		obj.pop();
		obj.push(2147483647);
		System.out.println(obj.top());
		System.out.println(obj.getMin());
		obj.push(Integer.MIN_VALUE);
		System.out.println(obj.top());
		System.out.println(obj.getMin());
		obj.pop();
		System.out.println(obj.getMin());
	}
}
