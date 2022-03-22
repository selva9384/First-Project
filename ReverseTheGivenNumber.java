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
		int num=sc.nextInt(),reverse=0;
		sc.close();
		while(num>0)
		{
			int rem=num%10;
			reverse=(reverse*10)+rem;
			num/=10;
		}
		System.out.println(reverse);
		
	}

}
