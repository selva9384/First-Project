
public class Second_min_num_in_an_array {

	public static void main(String[] args) {
		secondMin();
	}

	private static void secondMin() {
		int[] num = { -1, 3, -56, 7, 1, -48, 0 };
		int min = Integer.MAX_VALUE, secMin = min;
		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) {
				secMin = min;
				min = num[i];
			} else if (secMin > num[i] && min < num[i]) {
				secMin = num[i];
			}
		}
		System.out.println("Minimum number is " + min);
		System.out.println("Second minimum is " + secMin);
	}
}
