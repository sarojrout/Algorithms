/**
 * 
 */
package com.saroj.tree;

/**
 * @author saroj
 *
 */
public class CommonAncestorBST {
	
	public static void main(String[] args) {
	
		TreeNode node = new TreeNode(15);
		node.leftT = new TreeNode(12);
	//	node.rightT = new TreeNode(20);
		node.leftT.leftT = new TreeNode(10);
	    node.leftT.rightT = new TreeNode(14);
		
		node.rightT = new TreeNode(20);
		node.rightT.leftT = new TreeNode(19);
		node.rightT.rightT=new TreeNode(22);
		
		int n1=19, n2=22;
		TreeNode t = lca(node, n1, n2);
		System.out.println("lca of "+n1+"and "+n2+"is "+t.data);
		
	}
	private static TreeNode lca(TreeNode node, int n1, int n2){
		if(node == null) return null;
		if(node.data > n1 && node.data > n2){
			return lca(node.leftT,n1, n2);
		}
		if(node.data < n1 && node.data < n2){
			return lca(node.rightT, n1, n2);
		}
		return node;
	}
	static class TreeNode {
		TreeNode leftT, rightT;
		int data;
		
		TreeNode(int val){
			this.data=val;
			leftT=rightT=null;
		}
	}

}
