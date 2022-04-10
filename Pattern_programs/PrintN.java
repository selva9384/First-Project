//program to print N pattern with *
public class PrintN {

	public static void main(String[] args) {
		PrintN N = new PrintN();
		N.print();
	}

	private void print() {
		for (int row = 1; row <= 7; row++) {
			System.out.print("*");
			for (int i = 1; i < row; i++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = row; j < 7; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
	}

}
