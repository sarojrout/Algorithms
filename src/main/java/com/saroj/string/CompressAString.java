/**
 * 
 */
package com.saroj.string;

/**
 * @author sarojrout
 *
 */
public class CompressAString {

  /**
   * @param args
   */
  public static void main(String[] args) {
   System.out.println(CompressAString.compress("abcdaa"));

  }

  public static String compress(String str){
    String myString="";
    char last = str.charAt(0);
    int count=1;
    for(int i = 1;i < str.length();i++){
      if(str.charAt(i) == last){
        count++;
      }else{
        myString +=last+""+count;
        last=str.charAt(i);
        count=1;
      }
    }
    return myString + last + count;
  }
  public static int count(String str){
    int count=1;
 //   char[] myArr = str.toCharArray();
//    int lastIndex=myArr.length-1;
//    char last=myArr[lastIndex];
    char last1 = str.charAt(0);
    for(char ch:str.toCharArray()){
      if(ch != last1){
        count++;
      }
    }
    return count;
  }
}
