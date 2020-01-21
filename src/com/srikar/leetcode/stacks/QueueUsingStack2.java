package com.srikar.leetcode.stacks;

import java.util.Stack;

public class QueueUsingStack2 {

	Stack<Integer> s1;
	Stack<Integer> s2;

	public QueueUsingStack2() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}

	public void push(int x) {
		s1.push(x);
	}
	
	public int pop() {
		if(s2.isEmpty()) {
			s2.push(s1.pop());
		}
		
		return s2.pop();
	}
	
	public boolean empty() {
		return s1.isEmpty() && s2.isEmpty();
	}
	
	public int peek() {
		if(!s2.isEmpty()) {
			return s2.peek();	
		} else {
			if(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		
		return s2.peek();
	}
}
