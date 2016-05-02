package com.saroj.tree;

public class BinaryTreeDemo {
	private static int findElement(int[] arr, int x){
		int start =0;
		int end = arr.length-1;
		return bst(arr, x, start, end);
	}
	private static int bst(int[] arr, int x, int start, int end){
		while(end >= start){
			int mid = (start+end)/2;
			if(arr[mid] == x){
				return mid;
			}else if(x < arr[mid]){
				return bst(arr, x, start, mid);
			}else{
				return bst(arr, x, mid+1, end);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,4,5,6,7,8,9};
		int result = BinaryTreeDemo.findElement(arr, 4);
		System.out.println(result);
	}

}
