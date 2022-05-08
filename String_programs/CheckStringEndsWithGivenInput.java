
//program to check given input ends with specific word 
import java.util.Scanner;

public class CheckStringEndsWithGivenInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println("Enter a string to check end with given input");
		String endsWith = sc.nextLine();
		if (endswith(str, endsWith)) {
			System.out.println("Given input \"" + str + "\" ends with \"" + endsWith + "\"");
		} else
			System.out.println("Given input \"" + str + "\" does not end with \"" + endsWith + "\"");
	}

	private static boolean endswith(String str, String endsWith) {
		if (str.length() < endsWith.length())
			return false;
		int indexToStart = (str.length() - endsWith.length());
		int i = 0;
		while (indexToStart < str.length()) {
			if (str.charAt(indexToStart) != endsWith.charAt(i))
				return false;
			i++;
			indexToStart++;
		}
		return true;
	}

}
