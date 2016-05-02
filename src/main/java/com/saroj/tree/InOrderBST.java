package com.saroj.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderBST {
	
	private List<Integer> inOrder(TreeNode root){
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> myStack = new Stack<TreeNode>();
		if(root == null) return list;
		TreeNode p = root;
		while(!myStack.isEmpty()){
			if(p != null){
				myStack.push(p);
				p = p.leftChild;
			}else{
				TreeNode t = myStack.pop();
				list.add(t.data);
				p = t.rightChild;
			}
		}
		return list;
	}
	
	
	
	class TreeNode{
		int data;
		TreeNode leftChild;
		TreeNode rightChild;
		public TreeNode(int x){
			this.data=x;
		}
	}

}
