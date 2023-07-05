package Array;

public class Calc {
	public static void main(String[] args) {
		int mat1[][] = {{30,50},{70,90}};
		int mat2[][] = {{10,25},{14,75}};
		
		int[][] mat3 = new int[2][2];
		
		//addition
		for(int i = 0; i<2; i++) {
			for(int j=0; j<2; j++) {
				mat3[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(mat3[i][j]);
			}
		}
	}
}
