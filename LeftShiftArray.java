import java.util.Scanner;

public class LeftShiftArray {

	public static void main(String[] args) {
		LeftShiftArray o = new LeftShiftArray();
		o.shift();
	}

	private void shift() {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println("How many times do you want to shift");
		Scanner sc = new Scanner(System.in);
		int shift = sc.nextInt();
		for (int i = 1; i <= shift; i++) {
			int temp = arr[0];
			int j = 0;
			for (; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = temp;
		}
		for (int i : arr)
			System.out.print(i + " ");

	}

}
