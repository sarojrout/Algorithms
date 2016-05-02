package com.saroj.tree;

import java.util.Stack;

public class FlatternBinaryTree {
	
	private void flattern(TreeNode root){
		Stack<TreeNode> myStack = new Stack<TreeNode>();
		TreeNode p = root;
		while(!myStack.isEmpty() || p != null){
			if(p.right !=null){
				myStack.push(p.right);
			}
			if(p.left !=null){
				p.right=p.left;
				p.left=null;
			}else if(!myStack.isEmpty()){
				TreeNode temp = myStack.pop();
				p.right=temp;
			}
			p = p.right;
		}
	}
	class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
	}

}
