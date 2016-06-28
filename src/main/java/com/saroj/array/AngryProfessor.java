package com.saroj.array;

public class AngryProfessor {

	public static void main(String[] args) {
		int[] arr={-1, -3, 4, 2};
		String status = AngryProfessor.result(arr, 1);
		System.out.println(status);
	}
	private static String result(int[] arr, int k){
        int count=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]==0 || arr[i]<0 ){
                count++;
            }
        }
        if(count ==k || count > k){
            return "NO";
        }else{
            return "YES";
        }
    }
	

}
