//program to print O pattern with *
public class PrintO {

	public static void main(String[] args) {
		print();
	}

	private static void print() {
		for (int row = 1; row <= 7; row++) {
			if (row == 1 || row == 7) {
				for (int i = 1; i <= 5; i++)
					System.out.print(" *");
			} else {
				System.out.print("*");
				for (int i = 1; i <= 9; i++)
					System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
