package com.saroj.tree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBST {
	
	public TreeNode invertTree(TreeNode root){
		if(root == null) return null;
		Queue<TreeNode> myQ= new LinkedList<TreeNode>();
		
		if(root !=null){
			myQ.add(root);
		}
		while(!myQ.isEmpty()){
			TreeNode p = myQ.poll();
			if(p.leftChild !=null){
				myQ.add(p.leftChild);
			}
			if(p.rightChild !=null){
				myQ.add(p.rightChild);
			}
			TreeNode temp = p.leftChild;
			p.leftChild =  p.rightChild;
			p.rightChild=temp;
		}
		return root;
	}
	
	public TreeNode invertTreeRecursive(TreeNode root){
		if(root !=null){
			helper(root);
		}
		return root;
	}
	
	public void helper(TreeNode node){
		TreeNode temp = node.leftChild;
		node.leftChild = node.rightChild;
		node.rightChild=temp;
		
		if(node.leftChild !=null){
			helper(node.leftChild);
		}
		if(node.rightChild !=null){
			helper(node.rightChild);
		}
	}

}
