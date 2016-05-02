package com.saroj.sort;

public class MyMergeSort {

  private static void mergeSort(int[] arr, int l, int r){
    while(l<r){
      int mid = l+(r-l)/2;
      mergeSort(arr,l,mid);
      mergeSort(arr,mid+1,r);
      merge(arr,l,mid,r);
    }
    
  }
  
  private static void merge(int[] arr, int l, int m, int r){
    int n1 = m-l+1;
    int n2 = r-m;
    int[] L = new int[n1];
    int[] R = new int[n2];
    for(int i=0; i<n1;i++){
      L[i]=arr[l+i];
    }
    for(int j=0;j<n2;j++){
      R[j] = arr[m+1+j];
    }
    int i=0, j=0, k=l;
   
    while(i < n1 && j < n2){
     if(L[i]<R[j]){
       arr[k] = L[i];
       i++;
     }else{
       arr[k] = R[j];
       j++;
     }
     k++;
    }
    while(i<n1){
      arr[k]=L[i];
      i++;
      k++;
    }
    while(j<n2){
      arr[k]=R[j];
      j++;
      k++;
    }
  }
  
  public static void main(String[] args) {
   int[] arr = {4,5,3,7,2,8,1};
   MyMergeSort.mergeSort(arr, 0, arr.length);
   System.out.println(arr);
  }

}
