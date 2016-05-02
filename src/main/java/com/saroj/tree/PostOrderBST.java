package com.saroj.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderBST {
	
	private static List<Integer> postOrder(TreeNode root){
		
	List<Integer> list = new ArrayList<Integer>();
	Stack<TreeNode> myStack = new Stack<TreeNode>();
	if(root == null) return list;
	while(!myStack.isEmpty()){
		TreeNode curr = root;
		if(curr !=null){
			myStack.push(curr.rightChild);
			curr = curr.rightChild;
		}else{
			TreeNode node = myStack.pop();
			
		}
	}
	
	return list;
	}
	
	

}
