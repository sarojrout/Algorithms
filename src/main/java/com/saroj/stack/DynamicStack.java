/**
 * 
 */
package com.saroj.stack;

/**
 * @author sarojrout
 *
 */
public class DynamicStack {
  private int[] stackArr;
  private int top;
  private int stackSize;
  
  public DynamicStack(int size){
    this.stackSize=size;
    stackArr =  new int[stackSize];
    top =-1;
  }
  
  public void push(int item){
    if(this.isStackFull()){
      System.out.println("Stack is full. Increase the capacity");
      this.increaseCapacity();
    }
    System.out.println("Added entry:"+item);
    this.stackArr[++top] = item;
  }

  public int pop(){
    if(this.isEmpty()){
      throw new RuntimeException("Stack is empty");
    }
    int item = this.stackArr[top--];
    System.out.println("Removed the entry:"+item);
  //  stackArr[top]=0;
    return item;
  }
  
  public boolean isStackFull(){
    return (top==stackArr.length-1);
  }
  public boolean isEmpty(){
    return (top==-1);
  }
  
  public void increaseCapacity(){
    int[] newStackArr =  new int[this.stackSize*2];
    for(int i=0; i<stackSize;i++){
      newStackArr[i] = this.stackArr[i];
    }
    this.stackArr = newStackArr;
    this.stackSize=stackSize*2;
  }
  /**
   * @param args
   */
  public static void main(String[] args) {
    DynamicStack stack = new DynamicStack(2);
    for(int i =1; i<10;i++){
      stack.push(i);
    }
    for(int i=1; i<4;i++){
      try{
        stack.pop();
      }catch(Exception ex){
        ex.printStackTrace();
      }
     
    }
  }

}
