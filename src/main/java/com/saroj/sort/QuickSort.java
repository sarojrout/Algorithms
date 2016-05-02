/**
 * 
 */
package com.saroj.sort;

import java.util.Arrays;

/**
 * @author sarojrout
 *
 */
public class QuickSort {
  
  public void sort(int[] data){
    quickSort(data,0,data.length-1);
  }
  
  public  void quickSort(int[] data, int start, int end){
    if(start < end){
      int pivot = partition(data,start,end);
      quickSort(data,start,pivot);
      quickSort(data,pivot+1,end);
    }
  }
  
  public int partition(int[] data, int start, int end){
    int pivot = data[end];
    int i = start;
    for(int j=start; j<=end-1; j++){
      if(data[j]<pivot){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
        i++;
      }
      
    }
    data[end]=data[i];
    data[i]=pivot;
    return i;
  }
  
  public static void main(String args[]){
    int[] arr ={12,7,5};
   new QuickSort().sort(arr);
    System.out.println(Arrays.toString(arr));
  }
 
}
