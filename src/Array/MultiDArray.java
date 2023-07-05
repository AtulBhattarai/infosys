package Array;

import java.util.Scanner;

public class MultiDArray {
	/*
	 *  ============== MultiDArray ==================
	 *  # used to store and processing data in rows and cols from form/matrix/table
	 *  
	 *  	syntax:
	 *  		data_type  array_name[][] = new data_type[row][col];
	 */
	
	public static void main(String[] args) {
		int mat[][] = new int[2][2];
		
		// write data in array
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.println("Enter value for matrix: ");
				mat[i][j] = sc.nextInt();
			}
		}
		// read data in array
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
