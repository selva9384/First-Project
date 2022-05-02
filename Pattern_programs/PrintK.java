//program to print K pattern with *
public class PrintK {

	public static void main(String[] args) {
		Print();
	}

	private static void Print() {
		for (int i = 1; i <= 10; i++) {
			System.out.print("*");
			if (i <= 6) {
				for (int j = 5 - i; j >= 0; j--)
					System.out.print(" ");
				System.out.print(" *");
			} else {
				for (int j = 6; j <= i; j++)
					System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
