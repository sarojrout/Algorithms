package com.saroj.array;

import java.util.Arrays;

public class SwapKthNode {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		int k=3;
		swapKthNode(arr, k);
		System.out.println(Arrays.toString(arr));
	}
	
	private static void swapKthNode(int[] arr, int k){
	int temp = arr[k-1];
	arr[k-1] = arr[arr.length-k];
	arr[arr.length-k]= temp;
	}

}
