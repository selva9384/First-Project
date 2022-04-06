//program to find maximum number in a array
public class MaximumNumInArray {

	public static void main(String[] args) {
		max();
	}

	private static void max() {
		int[] arr = { 87, 56, 99, 56, 65 ,108,79};
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Maximum number is " + max);
	}

}
