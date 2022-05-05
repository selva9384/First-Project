//program to print Q pattern with *
public class PrintQ {
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
		for (int i = 10; i < 12; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
	}
}
