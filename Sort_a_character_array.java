//sorting a character array with ASCII value
public class Sort_a_character_array {

	public static void main(String[] args) {
		sort();
	}

	private static void sort() {
		char[] arr = { 'z', 'y', 'n', 'a', 'm', 'e', 'b' };
		char temp = ' ';
		for (int j = 1; j < arr.length; j++) {
			for (int i = 0; i < arr.length - j; i++) {
				if ((int) arr[i] > (int) arr[i + 1]) { //comparing character with ASCII value
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		for (char i : arr)
			System.out.print(i + " ");

	}

}
