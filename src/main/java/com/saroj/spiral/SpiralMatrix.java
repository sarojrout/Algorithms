/**
 * 
 */
package com.saroj.spiral;

/**
 * @author sarojrout
 *
 */
public class SpiralMatrix {
	public static void printSpiralArr(int[][] input){
		int row=input.length; //height or raw
		int col = input[0].length; //width or column
		int topMostRow = 0;
		int bottomMostRow = row-1;
		int leftMostCol = 0;
		int rightMostCol = col-1;
		int dir = 0; //direction
		while(topMostRow <= bottomMostRow && leftMostCol <= rightMostCol){
			if(dir == 0){
				for(int i=leftMostCol;i<=rightMostCol;i++){
					System.out.println(input[topMostRow][i]);
				}
				topMostRow++;
				dir = 1;
			}
			if(dir ==1){
				for(int i=topMostRow;i<=bottomMostRow;i++){
					System.out.println(input[i][rightMostCol]);
				}
				rightMostCol--;
				dir = 2;
			}
			if(dir == 2){
				for(int i = rightMostCol; i>=leftMostCol;i--){
					System.out.println(input[bottomMostRow][i]);
				}
				bottomMostRow--;
				dir = 3;
			}
			if(dir == 3){
				for(int i = bottomMostRow; i>=topMostRow;i--){
					System.out.println(input[i][leftMostCol]);
				}
				leftMostCol++;
				dir = 0;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		SpiralMatrix.printSpiralArr(arr);

	}

}
