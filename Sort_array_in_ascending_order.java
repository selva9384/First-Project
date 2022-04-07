//program to sort an array in ascending order
public class Sort_array_in_ascending_order {

	public static void main(String[] args) {
		sort();
	}

	private static void sort() {

		int[] arr = { 87, 56, 99, 86, 65, 108, 79, 5 };
		int min = 0;
		System.out.println("Before sorting");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					min = arr[j];
					arr[j] = arr[i];
					arr[i] = min;
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
