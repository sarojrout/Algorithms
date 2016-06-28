package com.saroj.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoOfHops {

	public static void main (String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 System.out.println(n);
		 for(int i=0; i<n; i++){
		     int n1 = sc.nextInt();
		     int result = NoOfHops.count(n1);
		    System.out.println(result);
		 }
		}
		private static int count(int n){
			List<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list.add(4);
			for(int i=3; i<n; i++) {
				list.add(list.get(i-1) + list.get(i-2) + list.get(i-3));
			}
			return list.get(n-1);
		}
}
