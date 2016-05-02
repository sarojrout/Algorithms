package com.saroj.sort;

public class NewMergeSort {
	
	public static void mergeSort(int[] arr, int l, int r){
		int mid = (l+r)/2;
		mergeSort(arr, l, mid);
		mergeSort(arr, mid, r);
		merge(arr, l, mid, r);
	}

	public static void merge(int[] arr, int l, int mid, int r){
		int[] lArr = null;
		int[] rArr=null;
		for(int i =0; i<=mid;i++){
			lArr[i] = arr[l+i];
		}
		for(int j = mid+1;j<=r;j++){
			rArr[j] = arr[mid+1+j];
		}
		int i =0, j=0, k=l;
		while(i<mid && j < r){
			if(lArr[i] < rArr[j]){
				arr[k]=lArr[i];
				i++;
			}else{
				arr[k]=rArr[j];
				j++;
			}
			k++;
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,4,3,5,2,8};
		NewMergeSort.mergeSort(arr, 0, arr.length);
		System.out.println(arr);

	}

}
