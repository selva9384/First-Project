//Matrix multiplication with array
public class Matrix_multiplication {

	public static void main(String[] args) {
		multiplication();
	}

	private static void multiplication() {
		int matrix1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int matrix2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int ans[][] = new int[3][3];
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
