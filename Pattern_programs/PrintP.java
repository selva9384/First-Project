//print P pattern with *
public class PrintP {

	public static void main(String[] args) {
		PrintP P = new PrintP();
		P.print();
	}

	private void print() {
		for (int row = 1; row <= 10; row++) {
			System.out.print("*");
			if (row <= 5) {
				if (row == 1 || row == 5) {
					for (int i = 1; i <= 3; i++) {
						System.out.print(" *");
					}
				} else {
					for (int i = 1; i <= 6; i++)
						System.out.print(" ");
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}

}
