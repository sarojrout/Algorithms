package com.saroj.array;

public class NumberOfOccurence {

	public static void main(String[] args) {
		int[] arr= {1, 1, 2, 2, 2, 2, 3};
		int x=2;
		int result = NumberOfOccurence.findNoOfOccurence(arr, x);
		System.out.println(result);
	}
	private static int findNoOfOccurence(int[] arr, int x){
		int count=0;
		for(int i=0; i< arr.length-1; i++){
			if(arr[i] == x){
				count++;
			}
		}
		return count;
	}

}
