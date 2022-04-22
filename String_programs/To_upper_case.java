
//program to convert lower case into upper case
import java.util.Scanner;

public class To_upper_case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = sc.nextLine();
		sc.close();
		System.out.println(toUpperCase(str));

	}

	private static String toUpperCase(String str) {
		String upper = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
				upper += (char) (str.charAt(i) - 32);
			else
				upper += (char) (str.charAt(i));
		}
		return upper;
	}

}
