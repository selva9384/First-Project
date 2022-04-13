//sort an integer array using bubble sort algorithm
public class Bubble_sort {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 5, 6, 7, 1 ,0,3};
		sort_ascenting_order(arr);
		sort_descenting_order(arr);
	}

	private static void sort_descenting_order(int[] arr) {
		int temp = 0;
		for(int j=1;j<=arr.length;j++)
		{
		for (int i = 0; i < arr.length - j; i++) {
			if (arr[i] < arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		}
		System.out.println("Descenting");
		for(int i:arr)
			System.out.print(i+" ");
	}

	private static void sort_ascenting_order(int[] arr) {
		int temp = 0;
		for(int j=1;j<=arr.length;j++)
		{
		for (int i = 0; i < arr.length - j; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		}
		System.out.println("Ascending");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
	}

}
