package com.saroj.tree;

public class TreeNode {
  
  private int data;
  public TreeNode leftChild;
  public TreeNode rightChild;
  
  
  public TreeNode(int data1){
    this.data=data1;
  }
  public TreeNode getLeftChild() {
    return leftChild;
  }
  public void setLeftChild(TreeNode leftChild) {
    this.leftChild = leftChild;
  }
  public TreeNode getRightChild() {
    return rightChild;
  }
  public void setRightChild(TreeNode rightChild) {
    this.rightChild = rightChild;
  }
  public int getData() {
    return data;
  }
  public TreeNode(){
    
  }
  public TreeNode find(int data1){
    if(this.data ==data1){
      return this;
    }
    if(data1 < this.data && leftChild !=null){
     return this.leftChild.find(data1);
    }if(rightChild !=null){
      return this.rightChild.find(data1);
    }
    return null;
  }
  
  public boolean isLeaf(){
    return this.leftChild==null && this.rightChild==null;
  }
  
  public int height(){
    if(isLeaf()){
      return 1;
      
    }
    int left =0;
    int right =0;
    if(this.leftChild ==null){
      left = this.leftChild.height();
    }
    if(this.rightChild == null){
      right = this.rightChild.height();
    }
   return (left > right)?(left+1):(right+1);
  }

}
