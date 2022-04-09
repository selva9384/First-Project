import java.util.Scanner;

public class Max_number_in_array_by_its_size {

	public static void main(String[] args) {
		max();
	}
	
	private static void max() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which position maximum number do you want");
		int num = sc.nextInt();
		int[] arr = { 87, 56, 99, 86, 65, 108, 79, 5 };
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					min = arr[j];
					arr[j] = arr[i];
					arr[i] = min;
				}
			}
		}
		System.out.println("maximum number is " + arr[num-1]);
	}

}
