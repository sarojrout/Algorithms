/**
 * 
 */
package com.saroj.sort;

/**
 * @author sarojrout
 *
 */
public class MergeSort {
	
	int[] tempArr;
	int[] arr;
	int length;
	public void sort(int[] inputArr){
		this.arr=inputArr;
		this.length=inputArr.length;
		tempArr=new int[length];		
		merge(0, length-1);
	}
	
	public void merge(int low, int high){
		
		if(low < high){
			int mid=low+(high-low)/2;
			merge(low, mid);
			merge(mid+1,high);
			mergeParts(low, mid, high);
		}
	}
	public void mergeParts(int low, int mid, int high){
		for(int i=low; i<= high; i++){
			tempArr[i]=arr[i];
		}
		int i=low;
		int j= mid+1;
		int k=low;
		
		while(i<=mid && j<=high){
			if(tempArr[i] <= tempArr[j]){
				arr[k]=tempArr[i];
				i++;
			}else {
				arr[k] = tempArr[j];
				j++;
			}
			k++;
		}
		while(i<=mid){
			arr[k] =tempArr[i];
			k++;
			i++;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr= {2,3,8,4,6,5};
		MergeSort ms= new MergeSort();		
		ms.sort(arr);
		for(int i:arr){
			System.out.print(i+" ");
			System.out.print(" ");
		}
		
	}

}
