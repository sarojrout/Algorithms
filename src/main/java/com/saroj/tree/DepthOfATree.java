package com.saroj.tree;

import java.util.LinkedList;
import java.util.Queue;

public class DepthOfATree {
	
	public int getDepth(TreeNode root){
		if(root == null) return 0;
		Queue<TreeNode> nodes = new LinkedList<TreeNode>();
		Queue<Integer> counts = new LinkedList<Integer>();
		nodes.add(root);
		counts.add(1);
		while(!nodes.isEmpty()){
			TreeNode curr = nodes.remove();
			int count = counts.remove();
			if(curr.left !=null){
				nodes.add(curr.left);
				counts.add(count+1);
			}
			if(curr.right !=null){
				nodes.add(curr.right);
				counts.add(count+1);
			}
			
			if(curr.left == null && curr.right ==null){
				return count;
			}
		}
		return 0;
	}
	class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val){
			this.data=val;
		}
	}

}
