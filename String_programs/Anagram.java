
//program to find given to words are anagram or not
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Anagram anagram = new Anagram();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two words to check the given input is anagram or not");
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();
		if (anagram.isAnagram(str1, str2))
			System.out.println("These words are anagrams");
		else
			System.out.println("These words are not anagrams");
	}

	private boolean isAnagram(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if (str1.length() != str2.length())
			return false;
		for (int i = 0; i < str1.length(); i++) {
			if (!(str1.contains(str2.charAt(i) + "") && str2.contains(str1.charAt(i) + "")))
				return false;
		}
		return true;
	}

}
