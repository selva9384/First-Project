
public class Bubble_sort {

	public static void main(String[] args) {
		sort();
	}

	private static void sort() {
		int[] arr = { 4, 2, 5, 6, 7, 1 ,0,3};
		int temp = 0;
		for(int j=1;j<arr.length;j++)
		{
		for (int i = 0; i < arr.length - j; i++) {
			if (arr[i] < arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		}
		for(int i:arr)
			System.out.print(i+" ");
	}

}
