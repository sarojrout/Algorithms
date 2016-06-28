package com.saroj.sort;

import java.util.Arrays;

public class MySelectionSort {
  
  private static int[] selectionSort(int[] arr){
    int i, j;
    for(i=0;i<arr.length-1;i++){
      for(j=i+1;j<arr.length;j++){
        if(arr[j]<arr[i]){
          int temp = arr[j];
          arr[j]=arr[i];
          arr[i]=temp;
        }
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int arr[]={2,6,3,5,4,7};
 //   int result = MySelectionSort.distribute(arr);
  int[] result =  MySelectionSort.selectionSort(arr);
 //   System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(result));
    
    System.out.println(" largest number: "+result[result.length-1]);

  }
  static int distributeCandy(int[] input) {
	    int noOfChildren =input[0];
	    int[] score = Arrays.copyOfRange(input, 1, noOfChildren);
	    int candyCount=0;
	    int[] candy= new int[noOfChildren];   
	        for(int i=0; i<noOfChildren; i++){
	            candy[i]=1;
	        }
	    for(int i=0; i< score.length;i++){
	       if(score[i+1]> score[i]){
	           candy[i+1]=candy[i+1]+1;
	       } else{
	           candy[i] = candy[i]+1;
	           for(int j=i; j>0; j--){
	               if(candy[j] < candy[j-1]){
	                   candy[j-1] = candy[j-1]+1;
	               }
	           }
	       }
	    }
	        
	 for(int i=0; i<noOfChildren; i++){
	            candyCount =candyCount+candy[i];
	        }

	return candyCount;
	    }
  
  static int distribute(int[] score){
	  if(score == null || score.length ==0) return 0;
	  int[] candies = new int[score.length];
	  candies[0]=1;
	  for(int i=1; i < score.length; i++){
		  if(score[i] > score[i-1]){
			  candies[i] = candies[i-1]+1;
		  }else {
			  candies[i]=1;
		  }	  
	  }
	  int result=candies[score.length-1];
	  for(int i=score.length-2; i>=0; i--){
		  int current = 1;
		  if(score[i] > score[i+1]){
			  current = candies[i+1]+1;
		  }
		  result +=Math.max(current,  candies[i]);
		  candies[i]=current;
	  }
	  return result;
  }
}
