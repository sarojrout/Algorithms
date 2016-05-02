package com.saroj.tree;

public class ValidateBST {
	
	public boolean validBST(TreeNode1 root){
		return checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	private boolean checkBST(TreeNode1 node, int min, int max){
		if(node == null){
			return true;
		}
		if(node.data <=min || node.data > max){
			return false;
		}
		if(!checkBST(node.left, min, node.data) ||
				!checkBST(node.right,node.data,max)){
			return false;
			
		}else{
			return true;
		}
	}

}

class TreeNode1{
	
	int data;
	TreeNode1 left;
	TreeNode1 right;
	
}