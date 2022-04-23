//program to find how many times a letter presented in a string

import java.util.Scanner;

public class CountTheOccuranceOfEachCharacter {
	public static void count() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String name = sc.next();
		sc.close();
		int len = name.length();
		int[] freq = new int[len];
		int j = 0;
		while (j < name.length()) {
			char key = name.charAt(j);
			int count = 1;
			for (int i = j + 1; i < name.length(); i++) {
				if (key == name.charAt(i)||key == name.charAt(i)-32) {
					count++;
					freq[i] = -5;
				}
			}

			if (freq[j] != -5)
				freq[j] = count;
			j++;
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != -5)
				System.out.println(name.charAt(i) + " came " + freq[i]+" times.");
		}
	}

	public static void main(String[] args) {
		count();
	}
}
