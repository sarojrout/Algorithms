package com.saroj.tree;

public class BinarySearchTree {
  
  private TreeNode root;
  
  public void insert(int data){
    TreeNode newNode = new TreeNode(data);
    
    if(root == null){
      root = newNode;
    }
    else{
      TreeNode current = root;
      TreeNode parent;
      while(true){
        parent = current;
        if(data<current.getData()){
          current = current.getLeftChild();
          if(current == null){
           parent.leftChild=newNode;
          }
        }
        else{
          current = current.getRightChild();
          if(current ==null){
            parent.rightChild=newNode;
          }
        }
      }
    }
  }
  
  public TreeNode findIterative(int key){
    TreeNode current = root;
    while(key !=current.getData()){
      if(key < current.getLeftChild().getData()){
        current = current.getLeftChild();
      }else{
        current = current.getRightChild();
      }
      if(current==null){
        return null;
      }
    }
    return current;
  }
  
  public TreeNode findRecursive(int key){
    if(root != null){
      root.find(key);
    }
    return null;
  }
  public void delete(int key){
    
  }

}
