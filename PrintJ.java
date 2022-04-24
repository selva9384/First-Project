//program to print J pattern with *
public class PrintJ {

	public static void main(String[] args) {
		PrintJ J = new PrintJ();
		J.print();
	}

	private void print() {
		for (int row = 1; row <=7; row++) {
			if (row == 1) {
				for (int i = 1; i <= 5; i++) {
					System.out.print(" *");
				}
			} 
			else if(row<=6) {
				for (int i = 1; i <= 5; i++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			else
			{
				System.out.println(" * *");
			}
			System.out.println();
		}

	}

}
