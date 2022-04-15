
//program to multiply two matrices
import java.util.Scanner;

public class Matrix_multiplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix 1 number of rows and column");
		int matrix1Row = sc.nextInt(), matrix1Col = sc.nextInt();
		int matrix1[][] = new int[matrix1Row][matrix1Col];
		System.out.println("Enter matrix 2 number of rows and column");
		int matrix2Row = sc.nextInt(), matrix2Col = sc.nextInt();
		int matrix2[][] = new int[matrix2Row][matrix2Col];
		if (matrix1Col == matrix2Row) {

			getValues(matrix1);
			getValues(matrix2);
			multiplication(matrix1, matrix2);
		} else
			System.out.println("You can not multiply these matrices");
	}

	private static void getValues(int[][] matrix) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix values of matrix");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
	}

	private static void multiplication(int[][] matrix1, int[][] matrix2) {

		int ans[][] = new int[matrix1.length][matrix1[0].length];
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
				for (int k = 0; k < matrix1.length; k++) {
					ans[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		print(ans);
	}

	private static void print(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
				System.out.print(ans[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
