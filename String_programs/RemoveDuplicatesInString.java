//Program to remove duplicate elements from a string
import java.util.Scanner;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		RemoveDuplicatesInString rd = new RemoveDuplicatesInString();
		System.out.println(rd.removeDuplicates(str));
	}

	private String removeDuplicates(String str) {
		int arr[] = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j) || str.charAt(i) == (char) (str.charAt(j) - 32)
						|| str.charAt(i) == (char) (str.charAt(j) + 32))
					arr[j] = -5;
			}
		}
		String output = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -5)
				output += str.charAt(i);

		}
		return output;
	}
}
