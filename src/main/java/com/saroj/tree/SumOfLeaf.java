package com.saroj.tree;

public class SumOfLeaf {
	
	private static int sumOfLeafs(TreeNode node){
		if(node == null) return 0;
		return dfs(node,0,0);
	}

	private static int dfs(TreeNode node, int num, int sum){
		num = num*10+node.data;
		if(node.left == null || node.right == null){
			sum +=num;
			return sum;
		}
		return dfs(node.left,num, sum)+dfs(node.right,num,sum);
	}
	static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val){
			this.data=val;
			left = right =  null;
		}
}

public static void main(String[] args) {
	TreeNode node = new TreeNode(1);
	node.left= new TreeNode(2);
//	node.left.left=new TreeNode(3);
//	node.left.right=new TreeNode(2);
	node.right=new TreeNode(7);
//	node.right.right= new TreeNode(6);
	int result = sumOfLeafs(node);
	System.out.println("sum of leaf nodes: "+result);
	}
	
}
