package com.saroj.stack;

public class ReverseAWord {
  

  public String reverse(String word){
    StringBuilder sb = new StringBuilder();
    int size = word.length();
    StackImpl impl = new StackImpl(size);
    for(int i=1; i<size;i++){
      impl.push(word.charAt(i));
    }
    while(!impl.isEmpty()){
      sb.append(impl.pop());
    }
    return sb.toString();
  }
  public static void main(String[] args) {
    ReverseAWord word = new ReverseAWord();
    String text = word.reverse("hello Saroj");
    System.out.println(text);
  }
  

}
