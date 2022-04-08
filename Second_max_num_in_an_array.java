
public class Second_max_num_in_an_array {

	public static void main(String[] args) {
		secondmax();
	}

	private static void secondmax() {
		int[] num = { -1, -2, 1, -88, 32, 76 };
		int max = Integer.MIN_VALUE, secMax = max;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				secMax = max;
				max = num[i];
			} else if (secMax < num[i] && max > num[i])
				secMax = num[i];
		}
		System.out.println("Maximum number is " + max);
		System.out.println("Second Maximum is " + secMax);
	}

}
