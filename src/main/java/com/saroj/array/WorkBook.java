/**
 * 
 */
package com.saroj.array;

/**
 * @author saroj
 *
 */
public class WorkBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}
	
	private static int countMatch(int[] arr, int k){		
		int count=0;
		int sum=0;
		for(int i=0; i< arr.length; i++){
			if(arr[i] > k){				
				if(arr[i]/2!=0){
					count++;
				}
			}else{ 
				count=0;
			}
		}
		return count;
		
	}

}
