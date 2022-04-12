//program to find addition of two matrix
public class Matrix_addition {

	public static void main(String[] args) {
		matrix();
	}

	private static void matrix() {
		int mat1[][] = { { 3, 4 }, { 5, 8 }, { 3, 7 } };
		int mat2[][] = { { 5, 7 }, { 4, 8 }, { 4, 9 } };
		int add[][] = new int[mat1.length][mat2[0].length];
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat2[0].length; j++) {
				add[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(add[i][j] + " ");
			}
			System.out.println();
		}

	}

}
