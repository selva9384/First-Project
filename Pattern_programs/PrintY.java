//Program to print Y pattern with *
public class PrintY {

	public static void main(String[] args) {
		printY();
	}

	private static void printY() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(" ");
			System.out.print("*");
			for (int k = 5 - i; k > 0; k--)
				System.out.print("  ");
			System.out.print("*");
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int k = 6 - i; k > 0; k--)
				System.out.print(" ");
			System.out.print("*");
			System.out.println();
		}

	}

}
