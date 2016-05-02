package com.saroj.stack;

public class StackImpl {

  private int top;
  private int stackSize;
  private char[] stackArr;
  
  public StackImpl(int size){
    this.stackSize=size;
    stackArr =  new char[stackSize];
    top = -1;
  }
  
  public void push(char item){
    this.stackArr[++top] = item;
  }
  
  public char pop(){
    char entry = this.stackArr[top--];
    return entry;
  }
  public int peek(){
    return stackArr[top];
  }
  
  public boolean isEmpty(){
    return (top ==-1);
  }
}
