/**
 * 
 */
package com.saroj.stack;

import java.util.Stack;

/**
 * @author saroj
 *
 */
public class BalancedParanethesis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str="{[()]}";
		BalancedParanethesis.checkParenthesis(str);

	}
	public static char[] c;
	
	private static void checkParenthesis(String s){
	       Stack<Character> st = new Stack<Character>();
	      c = s.toCharArray();
	       for(int i=0; i<c.length; i++){
	           if(c[i]=='{' || c[i] == '(' || c[i] =='['){
	               st.push(c[i]);
	           }else if(c[i]=='}' || c[i] == ')' || c[i] ==']'){
	               if(st.isEmpty() || !isPair(st.peek(),c[i])){
	                   System.out.println("NO");
	                   return;
	                   
	               }else{
	                  st.pop(); 
	               }
	           }
	       }
	       if(st.isEmpty()){
	          System.out.println("YES");
	       }else{
	           System.out.println("NO");
	       }
	   }
	    private static boolean isPair(Character opening, Character closing){
	        if(opening == '{' && closing == '}'){
	            return true;
	        }
	        if(opening == '[' && closing == ']'){
	            return true;
	        }
	        if(opening == '(' && closing == ')'){
	            return true;
	        }
	        return false;
	    } 
	}


