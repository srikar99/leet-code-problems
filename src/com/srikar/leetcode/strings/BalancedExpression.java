package com.srikar.leetcode.strings;

import java.util.Stack;

public class BalancedExpression {
    
    private boolean isMatching(char open, char close) {
        if(open == '[' && close == ']' 
           || open == '{' && close == '}' 
           || open == '(' && close == ')') {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        char[] C = str.toCharArray();
        
        for(int i = 0; i < C.length; i++) {
            if(C[i] == '[' || C[i] == '{' || C[i] == '(') {
                s.push(C[i]);
            }
            if(C[i] == ']' || C[i] == '}' || C[i] == ')') {
                if(s.isEmpty()) {
                    return false;
                }
                
                if(!isMatching(s.pop(), C[i])) {
                    return false;
                }
            }
        }
        
       return s.isEmpty();
    }
}
