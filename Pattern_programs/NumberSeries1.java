//program to print the following series 1 2 4 7 11 16 
public class NumberSeries1 {

	public static void main(String[] args) {
		NumberSeries1 o = new NumberSeries1();
		o.display();
	}

	private void display() {
		int no = 1;
		for (int i = 1; i <= 6; i++) {
			System.out.print(no + " ");
			no += i;
		}
	}

}
