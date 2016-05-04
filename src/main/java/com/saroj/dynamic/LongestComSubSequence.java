package com.saroj.dynamic;

public class LongestComSubSequence {

	public static void main(String[] args) {
		String str1 = "ABCDEFHI";
		String str2 = "BDGIKLMNOP";
		int result = LongestComSubSequence.lcs(str1, str2);
		System.out.println("longest subsequence::"+result);

	}
	
	private static int lcs(String str1, String str2){
		int max =0;
		char[] input1 = str1.toCharArray();
		char[] input2 = str2.toCharArray();
		int[][] tempArr = new int[input1.length+1][input2.length+1]; 
		for(int i=1;i<tempArr.length;i++){
			for(int j=1;j<tempArr[i].length;j++){
				if(input1[i-1] == input2[j-1]){
					tempArr[i][j]=tempArr[i-1][j-1]+1;
				}else {
					tempArr[i][j] = Math.max(tempArr[i-1][j], tempArr[i][j-1]);
				}
				if(tempArr[i][j] > max){
					max=tempArr[i][j];
				}
			}
		}
		return max;
	}

}
