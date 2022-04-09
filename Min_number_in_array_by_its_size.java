import java.util.Scanner;

public class Min_number_in_array_by_its_size {

	public static void main(String[] args) {
		min();
	}

	private static void min() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which position minimum number do you want");
		int num = sc.nextInt();
		int[] arr = { 87, 56, 99, 86, 65, 108, 79, 5 };
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					min = arr[j];
					arr[j] = arr[i];
					arr[i] = min;
				}
			}
		}
		System.out.println("Minimum number is " + arr[num - 1]);
	}

}
