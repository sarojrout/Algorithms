package com.saroj.queue;

import java.util.Stack;

public class QueueUsingStack<E> {

	Stack<E> stack1 = new Stack<E>();
	Stack<E> stack2 = new Stack<E>();
	public void enQueue(E item){
		stack1.push(item);
	}
	public E dequeue(){
		if(stack2.isEmpty()){
			stack2.push(stack1.pop());
		}
		return stack2.pop();
	}
}
