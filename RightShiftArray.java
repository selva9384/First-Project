import java.util.Scanner;

public class RightShiftArray {

	public static void main(String[] args) {
		RightShiftArray o = new RightShiftArray();
		o.shift();
	}

	private void shift() {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println("How many times do you want to shift");
		Scanner sc = new Scanner(System.in);
		int shift = sc.nextInt();
		for (int i = 1; i <= shift; i++) {
			int temp = arr[arr.length - 1];
			int j = arr.length - 1;
			for (; j > 0; j--) 
				arr[j] = arr[j - 1];
			arr[j] = temp;
		}
		for (int i : arr)
			System.out.print(i + " ");
	}

}
