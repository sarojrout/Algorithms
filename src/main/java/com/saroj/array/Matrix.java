package com.saroj.array;

public class Matrix {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {2,5,6},{3,4,5}};
		int sum1=0;
		int sum2=0;
		for(int i=0, j=arr.length-1; i<arr.length;++i, j--){
			sum1+=arr[i][i];
			sum2+=arr[i][j];
		}
		System.out.println(Math.abs(sum1-sum2));

	}

}
