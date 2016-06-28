package com.saroj.bit;

public class FindConsecutiveOne {
	
	public static void main(String[] args) {
		String binary="";
		String data = FindConsecutiveOne.decimalToBinary(binary,6);
		System.out.println(data);
		int result = consecutiveOnes(data);
		System.out.println(result);
	}
	 private static String decimalToBinary(String binary, int n){
	       if(n==0){
	           return binary;
	       }
	        int remainder =n%2;
	        binary+=remainder;
	        n=n/2;
	        return decimalToBinary(binary,n);
	        
	    }

	 private static int consecutiveOnes(String str){
		 int count=0,max=0;
		 for(int i=0; i< str.length(); i++){
			 if(str.charAt(i)=='1'){
				 count++;
				 if(count > max){
					 max=count;
				 }
			 }else{
//				 if(count > max){
//					 max=count;
//					
//				 }
				 count=0;
			 }
		 }
		 return max;
		 
	 }
}
