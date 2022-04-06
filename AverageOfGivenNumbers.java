
//program to find average of given numbers
import java.util.Scanner;

public class AverageOfGivenNumbers {

	public static void main(String[] args) {
		average();
	}

	private static void average() {
		System.out.println("How many number's average do you want to find");
		Scanner sc = new Scanner(System.in);
		float[] num = new float[sc.nextInt()];
		float average = 0;
		int i = 0;
		for (; i < num.length; i++) {
			System.out.println("Enter " + (i + 1) + " number");
			num[i] = sc.nextInt();
			average += num[i];
		}
		average /= i;
		System.out.println(average);
	}

}
