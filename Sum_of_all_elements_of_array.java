//program to find sum of all elements of an array
public class Sum_of_all_elements_of_array {

	public static void main(String[] args) {
		sum();
	}

	private static void sum() {
		int[] num = { 54, 66, 88, 65, 677 };
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("Sum of all elements of given array is " + sum);
	}

}
