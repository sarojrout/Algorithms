package com.saroj.tree;

public class BinarySearchTreeDemo {
	
	private static int bst(int[] arr, int start, int end, int x){
		while(end >= start){
			int mid = (start+end)/2;
			if(arr[mid] == x){
				return mid;
			}else if(x < arr[mid]){
				return bst(arr, start, mid-1,x);
			}else{
				return bst(arr, mid+1, end, x);
			}
		}
		return -1;
		
		
	}
	
	public static void main(String[] args) {
		int[] arr={1,2,5,3,7,6,9};
		int index=BinarySearchTreeDemo.bst(arr, 0, arr.length-1, 9);
		System.out.println(index);
	}

}
