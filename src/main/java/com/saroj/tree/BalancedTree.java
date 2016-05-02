package com.saroj.tree;

public class BalancedTree {
	
//	private int getHeight(TreeNode root){
//		if(root == null) return 0;
//		
//		return Math.max(getHeight(root.left),getHeight(root.right))+1;
//	}
//  
//  public boolean isBalanced(TreeNode root){
////	  int heightDiff = getHeight(root.left) - getHeight(root.right);
////	  if(Math.abs(heightDiff)>1){
////		  return false;
////	  }else{
////		  return isBalanced(root.left) && isBalanced(root.right);
////	  }
//	  
//	  if(checkHeight(root) == -1){
//		  return false;
//	  }else{
//		  return true;
//	  }
//    
//  }
//  
//  private int checkHeight(TreeNode root){
//	  if(root == null){
//		  return 0;
//	  }
//	  
//	  int leftHeight = checkHeight(root.left);
//	  if(leftHeight == -1){
//		  return -1;
//	  }
//	  int rightHeight = checkHeight(root.right);
//	  if(rightHeight == -1){
//		  return -1;
//	  }
//	  int heightDiff = rightHeight-leftHeight;
//	  if(Math.abs(heightDiff)>1){
//		  return -1;
//	  }else{
//		  return Math.max(leftHeight, rightHeight)+1;
//	  }
//  }
//  
  
  
  public boolean isBalanced(TreeNode node){
	  if(node == null) return false;
	  if(getHeight(node) == -1){
		  return false;
	  }else{
		  return true;
	  }  
	 
  }
  
  public int getHeight(TreeNode node){
	  int leftH = getHeight(node.left);
	  int rightH = getHeight(node.right);
	  if(leftH == -1 || rightH == -1){
		  return -1;
	  }
	  
	  int diff = leftH - rightH;
	  if(diff > 1){
		  return -1;
	  }else{
		  return Math.max(leftH,rightH)+1;
	  }
  }
  
  
  class TreeNode{
	  int data;
	  TreeNode left;
	  TreeNode right;
  }

}
