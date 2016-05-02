/**
 * 
 */
package com.saroj.stack;

/**
 * @author saroj
 *
 */
public class MyDynamicStack {

	public static void main(String[] args) {
		DynamicStack myStack = new DynamicStack(10);
		for(int i=0; i<10; i++){
			myStack.push(i);
		}
		for(int i=0; i<5; i++){
			System.out.println(myStack.pop());
		}

	}
	
 static class DynamicStack{
	 int size;
	 int[] stackArr;
	 int top;
	 
	 public DynamicStack(int maxSize){
		 top = -1;
		 this.size=maxSize;
		 stackArr = new int[maxSize];
		 
	 }
	 
	 public void push(int val){
		 if(isFull()){
			 increaseCapacity();
		 }else{
			 stackArr[++top] = val;
		 }
	 }
	 
	 public int pop(){
		 if(isEmpty()){
			 throw new RuntimeException("Stack is empty");
		 }
		 int item = this.stackArr[top--];
		 return item;
	 }
	 // To check if the stack is full
	 public boolean isFull(){
		 return (top == stackArr.length-1);
	 }
	 //check if the stack is empty
	 public boolean isEmpty(){
		 return (top == -1);
	 }
	 //increase the capacity fo stack
	 public void increaseCapacity(){
		 int[] newArray = new int[this.size*2];
		 for(int i=0; i<size;i++){
			 newArray[i] = stackArr[i];
		 }
		 this.stackArr = newArray;
		 this.size=size*2;
	 }
	 
 }

}
