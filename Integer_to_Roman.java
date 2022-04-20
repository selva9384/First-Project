import java.util.Scanner;

public class Integer_to_Roman {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		Integer_to_Roman roman = new Integer_to_Roman();
		System.out.println(roman.roman(num));

	}

	public String roman(int num) {
		if (num <= 10)
			return letters(num);
		String roman = "";
		if (num >= 100) {
			roman = "C" + roman;
			num -= 100;
		}
		if (num >= 50) {
			roman = roman + "L";
			num -= 50;
		}
		for (int i = 1; i <= num / 10; i++) {
			roman = roman + letters(10);
		}
		roman += letters(num % 10);
		return roman;
	}

	public String letters(int num) {
		if (num == 1)
			return "I";
		else if (num == 2)
			return "II";
		else if (num == 3)
			return "III";
		else if (num == 4)
			return "IV";
		else if (num == 5)
			return "V";
		else if (num == 6)
			return "VI";
		else if (num == 7)
			return "VII";
		else if (num == 8)
			return "VIII";
		else if (num == 9)
			return "IX";
		else if (num == 10)
			return "X";
		else
			return "";
	}

}
