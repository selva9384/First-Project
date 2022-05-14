import java.lang.Math;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		start();
	}

	private static void start() {
		int num = (int) (Math.random() * 10);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number below 10");
		while (true) {
			int num2 = sc.nextInt();
			if (num2 > 10) {
				System.out.println("you should enter below 10");
				break;
			} else if (num == num2) {
				System.out.println("You got it...");
				break;
			} else if (num < num2)
				System.out.println("Smaller than that.");
			else if (num > num2)
				System.out.println("Bigger than that.");
		}
	}

}
