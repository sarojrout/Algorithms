/**
 * 
 */
package com.saroj.sort;

/**
 * @author sarojrout
 *
 */
public class MergeSort {
	
	private int[] array;
	private int[] tempMergeArray;
	private int length;
	
	public void sort(int[] input){
		this.array = input;
		this.length=input.length;
		this.tempMergeArray = new int[length];
		doMergeSort(0, length-1);
	}
	
	private void doMergeSort(int low, int high){
		int middle = low + (high-low)/2;
		doMergeSort(low, middle);
		doMergeSort(middle+1, high);
		mergeParts(low,middle,high);
	}
	
	private void mergeParts(int low, int middle, int high){
		for(int i = low; i<high; i++){
			tempMergeArray[i]=array[i];
		 i = low;
		 int j=middle+1;
		 int k =low;
		 while(i <=middle+1 && j <=high){
			 
		 }
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
