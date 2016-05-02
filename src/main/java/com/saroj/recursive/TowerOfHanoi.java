package com.saroj.recursive;

public class TowerOfHanoi {
  
  public static void move(int n, char from, char to, char inter){
   if(n==1){
     System.out.println("move the disk "+n+ " from "+from+"to "+to);
   }else{
     move(n-1, from, inter, to);
     System.out.println("moving disk "+n+" from "+from+" to "+to+" using "+inter);
      move(n-1,inter,to,from);
   }
  
  }

  public static void main(String[] args) {
    TowerOfHanoi.move(2, 'A', 'C', 'B');

  }

}
