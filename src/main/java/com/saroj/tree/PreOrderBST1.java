package com.saroj.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderBST1 {
	private List<Integer> preOrder(TreeNode node){
		List<Integer> returnList = new ArrayList<Integer>();
		Stack<TreeNode> myStack = new Stack<TreeNode>();
		if(node == null) return returnList;
		myStack.push(node);
		while(!myStack.isEmpty()){
			TreeNode result = myStack.pop();
			returnList.add(result.data);
			if(node.right !=null){
				myStack.push(node.right);
			}
			if(node.left != null){
				myStack.push(node.left);
			}
		}
		return returnList;
		
	}
	
	public static String preOrder(int[] nodeArr){
		Stack<Integer> myStack = new Stack<Integer>();
	
		for(int i=0; i< nodeArr.length; i++){
			 int lower = -1;
			if(lower > -1 && nodeArr[i] < lower){
				return "NO";
			}
			while(!myStack.isEmpty() && myStack.peek()<nodeArr[i]){
				lower=myStack.pop();
			}
			myStack.push(nodeArr[i]);
		}
		return "YES";
	}
	
	public static void main(String[] args) {
		int[] arr = {5,1,2,3,4};
		int[] inputPreOrderArray2 = {3,4,5,1,2};
		String result = PreOrderBST1.preOrder(inputPreOrderArray2);
		System.out.println(result);
	}
	class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		public TreeNode(int x){
			this.data=x;
		}
	}

}
