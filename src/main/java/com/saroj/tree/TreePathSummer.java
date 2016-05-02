package com.saroj.tree;

public class TreePathSummer {

	public static int treePathSum(TreeNode root, int val){
		 
        if(root == null){
            return 0;
        }
 
        val = val * 10 + root.getData();
 
        if(root.getLeftNode() == null && root.getRightNode() == null){
            return val;
        }
 
        return treePathSum(root.getLeftNode(),val) + treePathSum(root.getRightNode(),val);
 
    }
	public static void main(String[] args) {
		TreeNode rooTreeNode = new TreeNode(6);
		 
        TreeNode l = new TreeNode(3);
        TreeNode r = new TreeNode(5);
 
        TreeNode ll = new TreeNode(2);
        TreeNode lr = new TreeNode(5);
 
        TreeNode lrl = new TreeNode(7);
        TreeNode lrr = new TreeNode(4);
 
        TreeNode rr = new TreeNode(4);
 
        rooTreeNode.setLeftNode(l);
        rooTreeNode.setRightNode(r);
 
        l.setLeftNode(ll);
        l.setRightNode(lr);
 
        lr.setLeftNode(lrl);
        lr.setRightNode(lrr);
 
        r.setRightNode(rr);
 
        System.out.println("Answer is = " + TreePathSummer.treePathSum(rooTreeNode,0));

	}
	
	public static class TreeNode{
		int data;
		
		/**
		 * @return the data
		 */
		public int getData() {
			return data;
		}
		TreeNode leftNode;
		TreeNode rightNode;
		
		public TreeNode(int d){
			this.data=d;
		}
		/**
		 * @return the leftNode
		 */
		public TreeNode getLeftNode() {
			return leftNode;
		}
		/**
		 * @param leftNode the leftNode to set
		 */
		public void setLeftNode(TreeNode leftNode) {
			this.leftNode = leftNode;
		}
		/**
		 * @return the rightNode
		 */
		public TreeNode getRightNode() {
			return rightNode;
		}
		/**
		 * @param rightNode the rightNode to set
		 */
		public void setRightNode(TreeNode rightNode) {
			this.rightNode = rightNode;
		}
		
		
	}

}
