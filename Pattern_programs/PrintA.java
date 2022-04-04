
public class PrintA {

	public static void main(String[] args) {
		PrintA A = new PrintA();
		A.print();
	}

	private void print() {
		for (int row = 1; row <= 6; row++) {
			for (int j = row; j <= 6; j++) {
				System.out.print(" ");
			}

			System.out.print("*");
			for (int j = 1; j < row; j++) {
				if (row == 4)
					System.out.print("**");
				else
					System.out.print("  ");
			}
			System.out.print("*");
			System.out.println();
		}
	}

}
