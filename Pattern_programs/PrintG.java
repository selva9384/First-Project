//program to print G pattern with *
public class PrintG {

	public static void main(String[] args) {
		print();
	}

	private static void print() {
		for (int row = 1; row <= 10; row++) {
			if (row == 1 || row == 10) {
				for (int i = 1; i <= 7; i++) {
					System.out.print(" *");
				}
			} else {
				System.out.print("*");
				if (row == 6) {
					for (int i = 1; i <= 9; i++) {
						if (i <= 4)
							System.out.print(" ");
						else
							System.out.print("* ");
					}
				} else if (row > 6) {
					for (int i = 1; i < 7; i++) {
						System.out.print("  ");
					}
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
