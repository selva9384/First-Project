//program to print the following series 1 2 6 12 20 30
public class NumberSeries2 {

	public static void main(String[] args) {
		NumberSeries2 o = new NumberSeries2();
		o.display();
	}

	private void display() {
		int num = 1;
		for (int i = 1; i <= 6; i++) {
			System.out.print((num * i) + " ");
			num = i;
		}
	}

}
