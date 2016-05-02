/**
 * 
 */
package com.saroj.tree;

/**
 * @author saroj
 *
 */
public class SubTreeTest {

	private static boolean areIdentical(TreeNode t1, TreeNode t2){
		if(t1 == null && t2 == null){
			return true;
		}
		if(t1 == null || t2 == null){
			return false;
		}
		return (t1.data == t2.data && areIdentical(t1.leftT, t2.leftT) && areIdentical(t1.rightT, t2.rightT));
	}
	// lets say node1 is subtree of node2
	private static boolean isSubTree(TreeNode node1, TreeNode node2){
		if(node1 == null) return true;
		if(node2 == null) return false;
		if(areIdentical(node1, node2)) return true;
		return isSubTree(node1, node2.leftT) || isSubTree(node1,node2.rightT);
	}
	
	static class TreeNode{
		TreeNode leftT;
		TreeNode rightT;
		int data;
		
		TreeNode(int val){
			this.data=val;
			leftT = rightT = null;
		}
	}
	
    public static void main(String[] args) {
		
    	TreeNode node1 = new TreeNode(10);
    	node1.leftT = new TreeNode(9);
    	node1.rightT = new TreeNode(12);
    	
    	TreeNode node2 = new TreeNode(20);
    	node2.leftT = new TreeNode(10);
    	node2.leftT.leftT = new TreeNode(9);
    	node2.leftT.rightT = new TreeNode(12);
    	
    	node2.rightT = new TreeNode(22);
    	node2.rightT.leftT = new TreeNode(21);
    	node2.rightT.rightT= new TreeNode(24);
    	
    	boolean result = isSubTree(node1, node2);
    	System.out.println("Are these 2 nodes satisfy the subtree: "+result);
	}

}
