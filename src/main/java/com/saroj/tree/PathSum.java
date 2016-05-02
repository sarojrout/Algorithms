package com.saroj.tree;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
	private List<ArrayList<Integer>> pathSum(TreeNode root, int sum){
		List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(root == null) return result;
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(root.data);
		dfs(root,sum-root.data,result, l);
		return result;
	}
	
	public void dfs(TreeNode root, int sum, List<ArrayList<Integer>> result, ArrayList<Integer> l){
		if(root.left ==null && root.right == null && sum == 0){
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.addAll(l);
			result.add(temp);
		}
		if(root.left !=null){
			l.add(root.left.data);
			dfs(root.left,sum-root.left.data,result,l);
			l.remove(l.size()-1);
		}
		if(root.right !=null){
			l.add(root.right.data);
			dfs(root.right,sum-root.right.data,result,l);
			l.remove(l.size()-1);
		}
	}
	
	class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
	}

}
