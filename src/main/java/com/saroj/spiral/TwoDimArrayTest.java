/**
 * 
 */
package com.saroj.spiral;

/**
 * @author sarojrout
 *
 */
public class TwoDimArrayTest {
 
 //Find average review of 3rd movie when the rows are of different length
public static double findAverageReview(int[][] ratings){
  int sum=0;
  int count=0;
  double average=0.0;
  for(int rows=0; rows<ratings.length;rows++){
    if(ratings[rows].length>3){
      sum+=ratings[rows][3];
      count++;
    }
  }
  if(count>0){
     average=(double)sum/count;
  //  System.out.println(average);
  }
  return average;
}

//public static double average(int[][] input){
//	double avg=0.0;
//	int sum=0;
//	int k=0;
//	for(int i=0;i<input.length;i++){
//	  for(int j=0;j<input.length;j++){
//	     if((i==4)&&(j==4)){
//	     if(input[i][j]==0){
//	     i++;
//	     }else{
//	        sum+=input[i][j]; 
//	     }
//	     }
//     
//}
//	}
//int length=input.length;
//
//if(sum!=0){
//  avg=sum/(k);
//}
//return avg;
//}



//}
  /**
   * @param args
   */
  public static void main(String[] args) {
    int[][] ratings = {{1,2,4,5},{3,4,8,7,6},{6,7,4,5},{4,5,6,3}};
    double result = TwoDimArrayTest.findAverageReview(ratings);
    System.out.println("Average review of 3rd movie:"+result);
  //  int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
  //  TwoDimArrayTest.doSpiral(arr);
  }
  public static void doSpiral(int[][] inputArr){
    int rows=inputArr.length;
    int cols=inputArr[0].length;
    int topMostRow=0;
    int bottomMostRow=rows-1;
    int leftMostColumn=0;
    int rightMostCol=cols-1;
    int dir=0;
    while(topMostRow<=bottomMostRow && leftMostColumn <= rightMostCol){
      if(dir==0){
        for(int i=leftMostColumn;i<=rightMostCol;i++){
          System.out.println(inputArr[topMostRow][i]);
        }
        topMostRow++;
        dir =1;
      }
      else if(dir == 1){
        for(int i=topMostRow;i<=bottomMostRow;i++){
          System.out.println(inputArr[i][rightMostCol]);
        }
        rightMostCol--;
        dir =2;
      }
      else if(dir == 2){
        for(int i=rightMostCol;i>=leftMostColumn;i--){
          System.out.println(inputArr[bottomMostRow][i]);
        }
        bottomMostRow--;
        dir =3;
      }
      else if(dir ==3){
        for(int i=bottomMostRow;i>=topMostRow;i--){
          System.out.println(inputArr[i][leftMostColumn]);
        }
        leftMostColumn++;
        dir=0;
      }
    }
    
  }
}
