package com.saroj.tree;

public class InOrderSuccesorBST {
	
	private static TreeNode inOrderSucc(TreeNode root){
		if(root == null) return null;
		if(root.parent == null || root.rightT !=null){
			return leftMostChild(root.rightT);
		}else{
			TreeNode q = root;
			TreeNode x = q.parent;
			while(x !=null && x.leftT !=null){
				q=x;
				x=x.parent;
			}
			return x;
		}
	}
	
	private static TreeNode leftMostChild(TreeNode node){
		if(node == null) return null;
		while(node.leftT != null){
			node = node.leftT;
		}
		return node;
	}
	static class TreeNode {
		TreeNode leftT;
		TreeNode rightT;
		TreeNode parent;
		int data;
	}

}
