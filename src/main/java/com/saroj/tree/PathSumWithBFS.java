package com.saroj.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PathSumWithBFS {
	
	private static boolean hasPathSum(TreeNode root, int sum){
		if(root == null) return false;
		Queue<TreeNode> nodes = new LinkedList<TreeNode>();
		Queue<Integer> counts = new LinkedList<Integer>();
		nodes.add(root);
		counts.add(root.data);
		while(!nodes.isEmpty()){
			TreeNode curr = nodes.poll();
			int sumVal = counts.poll();
			
			if(curr.leftT != null){
				nodes.add(curr.leftT);
				counts.add(sumVal+curr.leftT.data);
			}
			if(curr.rightT != null){
				nodes.add(curr.rightT);
				counts.add(sumVal+curr.rightT.data);
			}
			if(curr.leftT == null && curr.rightT == null && sumVal == sum) return true;
		}
		return false;
		
	}
	
	static class TreeNode{
		TreeNode leftT;
		TreeNode rightT;
		int data;
		TreeNode(int val){
			this.data=val;
		}
	}

}
