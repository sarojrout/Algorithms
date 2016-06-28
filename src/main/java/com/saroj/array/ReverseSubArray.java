/**
 * 
 */
package com.saroj.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author saroj
 *
 */
public class ReverseSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int j=2;int k=4;
		int[] result = ReverseSubArray.reverse(arr, j, k);
		System.out.println(Arrays.toString(result));

	}
	
	private static int[] reverse(int[] arr, int j, int k){
		int[] subArr = new int[k-j+1];
		int count = 0;
		for(int p=k-1; p>=j-1; p--) {
			subArr[count] = arr[p];
			count++;
		}
		for(int q=0; q<subArr.length; q++) {
			arr[q+j-1] = subArr[q];
		}
		return arr;
	}

}
