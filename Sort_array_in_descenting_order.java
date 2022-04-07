//program to sort array in descending order
public class Sort_array_in_descenting_order {

	public static void main(String[] args) {
		sort();
	}

	private static void sort() {
		int[] arr = { 87, 56, 99, 86, 65, 108, 79 };
		int max = 0;
		System.out.println("Before sorting");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					max = arr[j];
					arr[j] = arr[i];
					arr[i] = max;
				}
			}
		}
		System.out.println();
		System.out.println("After sorting");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
