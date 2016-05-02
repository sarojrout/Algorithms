/**
 * 
 */
package com.saroj.fibonacci;

/**
 * @author sarojrout
 *
 */
public class MyFibonacci {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] feb = new int[15];
		feb[0] = 0;
		feb[1] = 1;
		for(int i=2; i < 15; i++){
			feb[i] = feb[i-1] + feb[i-2];
		}
		for(int i=0; i < 15; i++){
			System.out.println(feb[i]+" ");
		}
		
	
	}
	static int[] fib = new int[Integer.MAX_VALUE];
	private static int fibonaci(int i){
		if(i==0) return 0;
		if(i==1) return 1;
		fib[i] = fibonaci(i-1) + fibonaci(i-2);
		return fib[i];
	}

}
