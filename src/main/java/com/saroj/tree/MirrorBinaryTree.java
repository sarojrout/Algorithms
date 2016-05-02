package com.saroj.tree;

import java.util.Stack;

public class MirrorBinaryTree {

  public TreeNode mirrorBinary(TreeNode node){
    if(node == null || node.getLeftChild()==null || node.getRightChild() ==null){
      return null;
    }
    else{
      TreeNode current = node;
      Stack<TreeNode> myStack = new Stack<TreeNode>();
      myStack.push(node);
      while(!myStack.isEmpty()){
        myStack.pop();
        TreeNode temp = current.getLeftChild();
        current.leftChild=current.rightChild;
        current.rightChild=temp;
        if(current.leftChild !=null){
          myStack.push(current.leftChild);
        }
        if(current.rightChild !=null){
          myStack.push(current.rightChild);
        }
      }
      return node;
    }
  }
}
