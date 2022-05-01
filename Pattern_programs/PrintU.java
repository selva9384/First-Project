//Program to print U pattern with *
public class PrintU {

	public static void main(String[] args) {
		print();
	}

	private static void print() {
		for (int row = 1; row <= 7; row++) {

			if (row != 7) {
				System.out.print("*");
				for (int j = 1; j <= 5; j++)
					System.out.print("  ");
				System.out.print("*");
			} else {
				for (int i = 1; i <= 4; i++)
					System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
