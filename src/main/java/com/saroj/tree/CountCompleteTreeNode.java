package com.saroj.tree;

public class CountCompleteTreeNode {
	
	public int countNodes(TreeNode root){
		int leftH = getLeftHeight(root);
		int rightH = getRightHeight(root);
		if(leftH == rightH){
			return (2<<(leftH-1))-1;
		}else{
			return countNodes(root.left)+countNodes(root.right)+1;
		}
		
	}

	public int getLeftHeight(TreeNode root){
		if(root == null) return 0;
		int count = 0;
		while(root.left !=null){
			count++;
			root = root.left;
		}
		return count;
	}
	
	public int getRightHeight(TreeNode node){
		if(node == null) return 0;
		int height=0;
		while(node.right !=null){
			height++;
			node = node.right;
		}
		return height;
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
