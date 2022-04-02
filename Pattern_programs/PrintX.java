
public class PrintX {

	public static void main(String[] args) {
		PrintX X = new PrintX();
		X.print();
	}

	private void print() {
		for (int row = 1; row <= 10; row++) {
			for (int space = 1; space <= row; space++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int innerSpace = row; innerSpace < 10; innerSpace++) {
				System.out.print("  ");
			}

			System.out.print("*");
			System.out.println();
		}
		for (int row = 1; row <= 10; row++) {
			for (int space = row; space <= 10; space++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int innerSpace = 1; innerSpace < row; innerSpace++) {
				System.out.print("  ");
			}
			System.out.print("*");
			System.out.println();
		}
	}

}
