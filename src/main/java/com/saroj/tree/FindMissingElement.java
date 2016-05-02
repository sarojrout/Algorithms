package com.saroj.tree;

public class FindMissingElement {
	private static int findMissing(int[] arr){
		int diff = Math.min(arr[2]-arr[1], arr[1]-arr[0]);
		int start=0, end = arr.length-1;
		while(start<end){
			if(end - start == 1) {
				return (arr[end]+ arr[start]) / 2; 
				} 
			int mid=(start+end)/2;
			int leftDiff = arr[mid]-arr[start];
			if(leftDiff > diff*(mid-start)){
				end=mid;
			}else{
				start=mid;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 11, 13};
		int result = FindMissingElement.findMissing(arr);
		System.out.println(result);
	}

}
