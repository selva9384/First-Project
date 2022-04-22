
//program to convert upper case into lower case
import java.util.Scanner;

public class To_lower_case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = sc.nextLine();
		sc.close();
		System.out.println(toUpperCase(str));

	}

	private static String toUpperCase(String str) {
		String lower = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
				lower += (char) (str.charAt(i) + 32);
			else
				lower += (char) (str.charAt(i));
		}
		return lower;
	}

}
