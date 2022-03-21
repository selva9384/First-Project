package tamilNadu.chennai;

import java.util.Scanner;

public class ReverseTheGivenNumber {

	public static void main(String[] args) {
		ReverseTheGivenNumber obj=new ReverseTheGivenNumber();
		obj.reverseTheGivenNumber();
	}

	private void reverseTheGivenNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		int num=sc.nextInt();
		sc.close();
		while(num>0)
		{
			System.out.print(num%10);
			num/=10;
		}
	}

}
