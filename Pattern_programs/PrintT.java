//print T patter with *
public class PrintT {

	public static void main(String[] args) {
		PrintT T = new PrintT();
		T.print();
	}

	private void print() {
		for (int row = 1; row < 7; row++) {
			if (row == 1) {
				for (int i = 1; i <= 5; i++) {
					System.out.print("* ");
				}
			} else {
				for (int i = 1; i <= 4; i++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
