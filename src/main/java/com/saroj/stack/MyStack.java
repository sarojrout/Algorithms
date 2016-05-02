/**
 * 
 */
package com.saroj.stack;

/**
 * @author saroj
 *
 */
public class MyStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack myStack = new Stack(10);
		for(int i=0; i<10; i++){
			myStack.push(i);
		}
		for(int i=0; i<5; i++){
			System.out.println(myStack.pop());
		}
	}
	
	static class Stack{
		int size;
		int top;
		int[] array;
		
		public Stack(int maxSize){
			this.size=maxSize;
			top = -1;
			array = new int[maxSize];
		}
		
		public void push(int val){
			array[++top] = val;
		}
		public int pop(){
			int result = array[top];
			top--;
			return result;
		}
		
		public int peek(){
			return array[top];
		}
	}

}
