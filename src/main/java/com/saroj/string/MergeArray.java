package com.saroj.string;

public class MergeArray {
	public static int[] merge(int[] a, int[] b, int[] c, int m, int n, int k){
		int i = m-1;
		int j = n-1;
		while(k>=0){
			if(j<0 || (a[i] > b[j])){
				c[k] = a[i--];
			}else{
				c[k]=b[j--];
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {4,5,6};
		int[] c = new int[0];
		int[] result = MergeArray.merge(a, b, c, 3, 3,1);
		System.out.println(result);
	}

}
