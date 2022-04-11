//program to search a number in an array with binary search
public class Search_a_number_in_an_array_through_binary_search {

	public static void main(String[] args) {
		search();
	}

	private static void search() {
		int[] ar = { 10, 20, 30, 35, 42, 57, 68, 78, 79, 83, 99, 100 };
		int num = 79;// number is going to search
		int min = 0, max = ar.length - 1;
		while (true) {
			int mid = (min + max) / 2;
			if (num == ar[mid]) {
				System.out.println("The number is present at " + mid + "th position");
				break;
			} else if (num < ar[mid]) {
				max = mid - 1;
			} else if (num > ar[mid]) {
				min = mid + 1;
			}
			if (min > max) {
				System.out.println("Not found");
				break;
			}
		}
	}

}
