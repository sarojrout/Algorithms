package com.saroj.stack;

import java.util.Stack;

public class SortingAStack {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(5);
		stack.push(3);
		stack.push(12);
		stack.push(6);
		stack.push(7);
		stack.push(1);
		stack.push(14);
//		for(int i=0; i< 6; i++){
//			System.out.println(stack.pop());
//		}
			System.out.println(SortingAStack.sort(stack));
	}
	
	public static Stack<Integer> sort(Stack<Integer> stack1){
		Stack<Integer> stack2 = new Stack<Integer>();
		while(!stack1.isEmpty()){
			int temp = stack1.pop();
			while(!stack2.isEmpty() && stack2.peek() > temp){
				stack1.push(stack2.pop());
			}
			stack2.push(temp);
		}
		return stack2;
	}

}
